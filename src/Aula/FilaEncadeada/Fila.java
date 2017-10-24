package Aula.FilaEncadeada;

import java.io.*;


class Fila implements Serializable {
    private Nodo inicio, fim;

    Fila() {
        inicio = fim = null;
    }

    void inserir(Cliente cli) {
        Nodo novo;
        novo = new Nodo(cli, null);
        if(inicio == null)
            inicio = novo;
        else
            fim.setElo(novo);
        fim = novo;
    }

    Cliente remover() {
        Cliente cli;

        if(inicio == null)
            return null;
        else
        {
            cli = inicio.getInfo();
            inicio = inicio.getElo();
            if(inicio == null)
                fim = null;
            return cli;
        }
    }

    boolean vazia() {
        if(inicio == null)
            return true;
        else
            return false;
    }
}