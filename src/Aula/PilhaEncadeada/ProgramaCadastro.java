package Aula.PilhaEncadeada;

import java.io.*;
import javax.swing.JOptionPane;

class ProgramaCadastro {
    static void salvar(Pilha cadastro) {
        FileOutputStream fo;
        ObjectOutputStream oo;
        
        try {
            fo = new FileOutputStream("c:\\aulas\\cadastro.obj");
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
            fi = new FileInputStream("c:\\aulas\\cadastro.obj");
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
    
    static void inserirCliente(Pilha cadastro) {
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
    
    static void removerCliente(Pilha cadastro) {
        Cliente cli;
        
        cli = cadastro.remover();
        JOptionPane.showMessageDialog(null,
                "Foi removido o cliente abaixo:\n" +
                "- Nome: " + cli.getNome() +
                "\n- Telefone: " + cli.getTelefone());
    }
    
    public static void main(String[] args) {
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
                    "5 - Terminar o programa.");
            if(opcao == null || opcao.equals("5"))
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
        }
    }
}
