package AEXEMPLOS.simuladofila;
import java.io.*;
class Vegetal implements Serializable{
	private boolean fresco;
	Vegetal(){
		fresco = true;
	}
	boolean getFresco(){
            return fresco;
	}
	void setFresco(boolean fre){
		fresco = fre;
	}
}

