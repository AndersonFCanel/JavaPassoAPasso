package Aula.Pilha;

import java.io.*;
import javax.swing.JOptionPane;

public class TestePilhaDeClientes {
    public static void main(String[] args) {
 //       
        String resposta, nome; // variavel que receberá valor introdulido através de método showImputDialog()
        int telefone;
        Pilha cadastro; // cadastro é um objeto de tipo pilha(irá referênciar na pilha o endereço da memória onde está gravado o dado)
        Cliente cli; 
        FileOutputStream fo;
        ObjectOutputStream oo;

        cadastro = new Pilha();
//        
        for(;;) // for infinito
        {
            nome = JOptionPane.showInputDialog("Digite nome do cliente");
           
            if(nome.equals("fim"))      ///CUIDADOOOOOOOOOOOOOOOOOOOO 
                break;
            
            resposta = JOptionPane.showInputDialog("Digite telefone do cliente");
            telefone = Integer.parseInt(resposta);
            cli = new Cliente(nome, telefone);
            cadastro.inserir(cli);
        }
        
        try {
            fo = new FileOutputStream("c:\\aulas\\cadastro.obj");
            oo = new ObjectOutputStream(fo);
            oo.writeObject(cadastro);
            oo.close();
        } catch(IOException e) {
            JOptionPane.showMessageDialog(null,
                    "Erro - " + e.toString());
        }
		
		// para exibir todos os cadastros preciso remover todos os clientes , o laço while vai rodar até a pilha esta vazia 
	
        while(!cadastro.vazia())
        {
            cli = cadastro.remover();
            JOptionPane.showMessageDialog(null,
                "Nome: " + cli.getNome() +
                "\nTelefone: " + cli.getTelefone());
        }
    }
}
