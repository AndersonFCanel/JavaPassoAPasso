package Pilhas.exemplo;

public class Teste {

    public static void main(String[] args) {
        Pilha pilha = new Pilha();
        Peca pecaInsere = new Peca();
        pilha.insere(pecaInsere);
        Peca pecaRemove = pilha.remove();
        if (pilha.vazia()) {
            System.out.println("A pilha está vazia");
        }
    }
}
