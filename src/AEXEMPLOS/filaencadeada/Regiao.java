package AEXEMPLOS.filaencadeada;
import java.io.*;
class Regiao implements Serializable{
	private int habitantes;
	Regiao(){
		habitantes = 1;
	}
	int getHabitantes(){
		return habitantes;
	}
	void setHabitantes(int hab){
		habitantes = hab;
	}
}