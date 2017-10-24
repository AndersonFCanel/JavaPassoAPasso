package AEXEMPLOS.simuladopilha;
import java.io.*;
class Carta extends Folha implements Serializable{
	private String naipe;
Carta(int num, String nai){
	setNumero(num);
	naipe = nai;
}
String getNaipe(){
	return naipe;
}
void setNaipe(String nai){
	naipe = nai;
}
}
