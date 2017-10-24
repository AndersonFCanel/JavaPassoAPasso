package Aula.FilaEncadeada;


import Aula.FilaEncadeada.Cliente;
import java.io.Serializable;

class Nodo implements Serializable {
    private Cliente info;
    private Nodo elo;

    Nodo(Cliente i, Nodo e) {
        info = i;
        elo = e;
    }

    Cliente getInfo() {
        return info;
    }

    Nodo getElo() {
        return elo;
    }

    void setInfo(Cliente i) {
        info = i;
    }

    void setElo(Nodo e) {
        elo = e;
    }
}