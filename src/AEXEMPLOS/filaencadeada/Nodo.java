package AEXEMPLOS.filaencadeada;
import java.io.*;
class Nodo implements Serializable{
	private Cidade info;
	private Nodo elo;
	Nodo(Cidade i, Nodo e){
		info = i;
		elo = e;
	}
	Cidade getInfo(){
		return info;
	}
	void setInfo(Cidade i){
		info = i;
	}
	Nodo getElo(){
		return elo;
	}
	void setElo(Nodo e){
		elo = e;
	}
}