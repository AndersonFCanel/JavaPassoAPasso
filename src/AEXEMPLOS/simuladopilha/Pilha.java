package AEXEMPLOS.simuladopilha;
import java.io.*;
class Pilha implements Serializable{
	private static int base = 0, limite = 111;
	private int topo;
	private Carta[] vetor;
Pilha(){
	topo = base - 1;
	vetor = new Carta[limite + 1];
}
void inserir(Carta car) throws PilhaCheiaException{
	if (topo < limite){
		topo = topo + 1;		
		vetor[topo] = car;
	}
	else
		throw new PilhaCheiaException();
}

Carta remover() throws PilhaVaziaException{
        Carta car;
	if(topo>=base){
		car = vetor[topo];
		vetor[topo] = null;
		topo = topo - 1;
		return car;
}
	else
		throw new PilhaVaziaException();
}
}