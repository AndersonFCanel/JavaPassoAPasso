package cadastrodeclientesaula25052017;

import java.io.*;

class Cliente implements Serializable {
    private int telefone;
    private String nome;

    Cliente(String n, int t) {
        nome = n;
        telefone = t;
    }

    String getNome() {
        return nome;
    }

    int getTelefone() {
        return telefone;
    }

    void setNome(String nome) {
        this.nome = nome;
    }

    void setTelefone(int t ) {
        telefone = t;
    }
}
