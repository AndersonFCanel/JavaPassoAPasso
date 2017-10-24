package cadastrodeclientesaula25052017;

import java.io.*;
import javax.swing.JOptionPane;

class Pilha implements Serializable {
    private static int base = 0, limite = 3; // esse cadastro recebera 100 clientes
    private int topo;
    private Cliente[] vetor;

    Pilha() {
        topo = base - 1; // valor inicial do topo sempre inicializara abaixo da base onde ser� colocado o primeiro valor da pilha 
        vetor = new Cliente[limite + 1];   //limite  acima do final do vettor
    }

    void inserir(Cliente cli) throws PilhaCheiaException {
       if(topo < limite ){
            topo = topo + 1;
            vetor[topo] = cli;
       }else 
           throw new PilhaCheiaException();
    }

    Cliente remover()throws PilhaVaziaException{
        Cliente cli;
        if(topo >=base)
        {
            cli = vetor[topo];
            vetor[topo] = null;
            topo = topo - 1;
            return cli;
        }else
            throw  new PilhaVaziaException();
    }
//    
// public void Exibir() {
//            JOptionPane.showMessageDialog(null,"Pilha: \n");
//            for (int i=0; i<topo; i++)
//                JOptionPane.showMessageDialog(null,"Nome: "+vetor[i].getNome()
//                        +"\nTelefone: "+vetor[i].getTelefone());
//            }
 
    boolean vazia() {
        if(topo < base)
            return true;
        else
            return false;
    }
}
