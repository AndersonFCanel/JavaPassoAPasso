package AEXEMPLOS.filaencadeada;
import java.io.*;
class Cidade extends Regiao implements Serializable{
	private float territorio;
	Cidade(int hab, float ter){
		setHabitantes(hab);
		territorio = ter;
	}
	float getTerritorio(){
		return territorio;
	}
	void setTerritorio(float ter){
		territorio = ter;
	}
}
