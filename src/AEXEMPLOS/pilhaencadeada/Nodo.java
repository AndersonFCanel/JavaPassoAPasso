package AEXEMPLOS.pilhaencadeada;
import java.io.*;
class Nodo implements Serializable{
	private Carne info;
	private Nodo elo;
	Nodo(Carne i, Nodo e){
		info = i;
		elo = e;
	}
	Carne getInfo(){
		return info;
	}
	Nodo getElo(){
		return elo;
	}
	void setInfo(Carne i){
		info = i;
	}
	void setNodo(Nodo e){
		elo = e;
	}
}