package Aula.PilhaEncadeada;

import java.io.*;

class Pilha implements Serializable {
    private Nodo topo;
    
    Pilha() {
        topo = null;
    }
    
    void inserir(Cliente cli) {
        topo = new Nodo(cli, topo);
    }
    
    Cliente remover() {
        Cliente cli;
        
        if(topo == null)
            return null;
        else
        {
            cli = topo.getInfo();
            topo = topo.getElo();
            return cli;
        }
    }
    
    boolean vazia() {
        if(topo == null)
            return true;
        else
            return false;
    }
}
