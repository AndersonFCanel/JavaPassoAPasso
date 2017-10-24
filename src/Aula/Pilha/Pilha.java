package Aula.Pilha;

/*
Na pilha:
 a base é o valor incial do vetor
o limite é o ultimo
e o topo é a posição que teve valor adicionado
*/
                  
import java.io.*;

public class Pilha implements Serializable {
    private static int base = 0, limite = 99; // esse cadastro recebera 100 clientes
    private int topo;
    private Cliente[] vetor;

   // criação da pilha
    Pilha() {
        topo = base - 1; // valor inicial do topo sempre inicializara abaixo da base onde será colocado o primeiro valor da pilha 
        vetor = new Cliente[limite + 1];   //limite  acima do final do vettor
    }
         
    void inserir(Cliente cli) {  
        topo = topo + 1;    //esta linha levanta o topo em +1 a cada item inserido
        vetor[topo] = cli; 
    }

    Cliente remover() {   
        Cliente cli; //variável auxiliar vai remover cliente que está no topo 
        
        cli = vetor[topo];   // variável que ira referenciar objeto a ser removido
        vetor[topo] = null; // limpar valor do topo
        topo = topo - 1;  //descer o topo pois um item foi removido da pilha
        return cli;   // retorna o  valor removido 
    }   //obs: neste código eremos problema quando a pilha estiver vazia

	
	
    boolean vazia() {     //função que fara o teste se a pilha está vazia ou não
        if(topo < base)   
            return true;
        else
            return false;
    }
	
}