package cadastrodeclientesaula25052017;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

class ProgramaCadastro {
    static void salvar(Pilha cadastro) {
        FileOutputStream fo;
        ObjectOutputStream oo;
        
        try {
            fo = new FileOutputStream("cadastro.obj");
            oo = new ObjectOutputStream(fo);
            oo.writeObject(cadastro);
            oo.close();
            JOptionPane.showMessageDialog(null,
                    "O cadastro foi salvo em arquivo.");
        } catch(IOException e) {
            JOptionPane.showMessageDialog(null,
                    "Não foi possível salvar o cadastro em arquivo!");
        }
    }
    
    static Pilha ler() {
        FileInputStream fi;
        ObjectInputStream oi;
        Pilha cadastroLido;

        try {
            fi = new FileInputStream("cadastro.obj");
            oi = new ObjectInputStream(fi);
            cadastroLido = (Pilha) oi.readObject();
            oi.close();
            JOptionPane.showMessageDialog(null,
                    "O cadastro foi lido do arquivo.");
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Não foi possível ler o cadastro do arquivo!");
            cadastroLido = new Pilha();
        }
        return cadastroLido;
    }
    
    static void inserirCliente(Pilha cadastro) throws PilhaCheiaException {
        String resposta, nome;
        int telefone;
        Cliente cli;
        
        nome = JOptionPane.showInputDialog(
                "Digite nome do cliente");
        resposta = JOptionPane.showInputDialog(
                "Digite telefone do cliente");
        telefone = Integer.parseInt(resposta);
        cli = new Cliente(nome, telefone);
        cadastro.inserir(cli);
        JOptionPane.showMessageDialog(null,
                "O cliente foi inserido no cadastro.");
    }
    
    static void removerCliente(Pilha cadastro) throws PilhaVaziaException {
        Cliente cli;
        
        cli = cadastro.remover();
        JOptionPane.showMessageDialog(null,
                "Foi removido o cliente abaixo:\n" +
                "- Nome: " + cli.getNome() +
                "\n- Telefone: " + cli.getTelefone());
    }
    
     static void mostrarClientes(Pilha cadastro)  {
        Cliente cli;
        Pilha caux; //cadastro auxiliar
        caux = new Pilha();
        
        for (;;) 
            try {
                //salvar(cadastro);
                cli = cadastro.remover();
                caux.inserir(cli);
                JOptionPane.showMessageDialog(null, "Nome: " + cli.getNome()
                        + "\nTelefone: " + cli.getTelefone());
            } catch (PilhaException e) {
                break;
            
                
        }
        
        for (;;) 
            try {
                cli = caux.remover();
                cadastro.inserir(cli);
            } catch (PilhaException e) {
                break;
            }
        
    }
     static void consultarCliente(Pilha cadastro){
         Cliente cli;
         Pilha caux; //cadastro auxiliar
         caux = new Pilha();
         String  nome;
         nome = JOptionPane.showInputDialog(
                "Digite nome do cliente");
         for (;;) {
             try {
                 //salvar(cadastro);
                 cli = cadastro.remover();
                 caux.inserir(cli);
                 if(nome.equals(cli.getNome())){
                 JOptionPane.showMessageDialog(null, "Nome: " + cli.getNome()
                         + "\nTelefone: " + cli.getTelefone());
                 break;
                 }

             } catch (PilhaException e) {
                 JOptionPane.showMessageDialog(null,
                        "O cliente não foi encontrado.");
                 break;


             }
         }

         for (;;) {
             try {
                 cli = caux.remover();
                 cadastro.inserir(cli);
             } catch (PilhaException e) {
                 break;
             }
         }
         
     }
    
    public static void main(String[] args) throws PilhaCheiaException, PilhaVaziaException {
        Pilha cadastro;
        String opcao;
        
        cadastro = new Pilha();
        for(;;)
        {
            opcao = JOptionPane.showInputDialog(
                    "Digite a opção:\n" +
                    "1 - Salvar o cadastro no arquivo.\n" +
                    "2 - Ler um cadastro do arquivo.\n" +
                    "3 - Inserir um cliente no cadastro.\n" +
                    "4 - Remover um cliente do cadastro.\n" +
                    "5 - Mostrar clientes do cadastro.\n" +
                    "6 - Apagar cadastro.\n" +
                    "7 - Consultar cliente.\n" +
                    "8 - Terminar o programa.");
//IMPEDIR USUÁRIO DE SAIR AO CLICAR EM CANCELAR
//           while(opcao == null ){
//                opcao = JOptionPane.showInputDialog(
//                    "Digite a opção:\n" +
//                    "1 - Salvar o cadastro no arquivo.\n" +
//                    "2 - Ler um cadastro do arquivo.\n" +
//                    "3 - Inserir um cliente no cadastro.\n" +
//                    "4 - Remover um cliente do cadastro.\n" +
//                    "5 - Terminar o programa.");
//            }
            if(opcao == null)   //forma elegante de fazer
                ; //COMANDO NULO
            else
            if( opcao.equals("8"))
                break;
            else
                if(opcao.equals("1"))
                    salvar(cadastro);
                else
                    if(opcao.equals("2"))
                        cadastro = ler();
                    else
                        if(opcao.equals("3"))
                            inserirCliente(cadastro);
                        else
                            if(opcao.equals("4"))
                                removerCliente(cadastro);
                            else
                                if(opcao.equals("5"))
                                   mostrarClientes(cadastro);
                                else
                                   if(opcao.equals("6"))
                                     cadastro=new Pilha();
                                   else
                                      if(opcao.equals("7"))
                                         consultarCliente(cadastro);
                           
                                
        }
    }
}
