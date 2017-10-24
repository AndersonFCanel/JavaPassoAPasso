package AEXEMPLOS.simuladopilha;
import java.io.*;
class Folha implements Serializable{
	private int numero;// 1 questão
Folha(){
	numero = 2;
}
int getNumero(){
	return numero;
}
void setNumero(int num){
	numero = num;
}
}
