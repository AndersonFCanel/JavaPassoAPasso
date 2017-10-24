package Aula.PilhaEncadeada;

import java.io.*;
import javax.swing.JOptionPane;

class LerCadastro {
    public static void main(String[] args) {
        FileInputStream fi;
        ObjectInputStream oi;
        Pilha cadastro;
        Cliente cli;

        try {
            fi = new FileInputStream("c:\\aulas\\cadastro.obj");
            oi = new ObjectInputStream(fi);
            cadastro = (Pilha) oi.readObject();
            oi.close();
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Erro - " + e.toString());
            cadastro = new Pilha();
        }
        while(!cadastro.vazia())
        {
            cli = cadastro.remover();
            JOptionPane.showMessageDialog(null,
                "Nome: " + cli.getNome() +
                "\nTelefone: " + cli.getTelefone());
        }
    }
}
