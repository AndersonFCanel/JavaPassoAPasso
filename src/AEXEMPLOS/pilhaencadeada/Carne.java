package AEXEMPLOS.pilhaencadeada;
import java.io.*;
class Carne extends Alimento implements Serializable{
	private String tipo;
	Carne(boolean coz, String tip){
		setCozido(coz);
		tipo = tip;
	}
	String getTipo(){
		return tipo;
	}
	void setTipo(String tip){
		tipo = tip;
	}
}
