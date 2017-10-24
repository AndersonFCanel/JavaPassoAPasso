package AEXEMPLOS.simuladofila;
import java.io.*;
class Fruta extends Vegetal implements Serializable{
	private int sementes;
	Fruta(boolean fre, int sem){
		setFresco(fre);
		sementes = sem;
	}
		
	int getSementes(){
		return sementes;
	}
	void setSementes(int sem){
		sementes = sem;		
	}
	
}
