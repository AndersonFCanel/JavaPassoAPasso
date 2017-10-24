package AEXEMPLOS.filaencadeada;
import java.io.*;
class Fila implements Serializable{
	private Nodo inicio,fim;
	Fila(){
		inicio=fim=null;
	}
	void inserir(Cidade cid){
        Nodo novo;
	novo = new Nodo(cid,null);
		if(inicio==null)
			inicio=novo;
                else
			fim.setElo(novo);
	fim = novo;
	}
	Cidade remover() throws FilaVaziaException{
		Cidade cid;
		if(inicio!=null){
			cid = inicio.getInfo();
			inicio = inicio.getElo();
			return cid;
		}
		else
			throw new FilaVaziaException();
	}
}