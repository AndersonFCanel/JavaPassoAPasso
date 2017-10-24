package AEXEMPLOS.pilhaencadeada;
import java.io.*;
class Pilha implements Serializable{
	private Nodo topo;
	Pilha(){
		topo = null;
	}
	void inserir(Carne car){
		topo = new Nodo(car,null);
	}
	Carne remover() throws PilhaVaziaException{
		Carne car;
		if(topo!= null){
			car = topo.getInfo();
			topo = topo.getElo();
			return car;
		}
		else
			throw new PilhaVaziaException();
	}
}
