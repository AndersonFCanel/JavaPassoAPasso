package AEXEMPLOS.pilhaencadeada;
import java.io.*;
class Alimento implements Serializable{
	private boolean cozido;
	Alimento(){
		cozido = false;
	}
	boolean getCozido(){
		return cozido;
	}
	void setCozido(boolean coz){
		cozido = coz;
	}
}