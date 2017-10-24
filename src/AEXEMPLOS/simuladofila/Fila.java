package AEXEMPLOS.simuladofila;
import java.io.*;
class Fila implements Serializable{
	private static int li = 0,ls = 222;
	private int inicio, fim;
	private Fruta[] vetor;
	Fila(){
		inicio = fim = li - 1;
		vetor = new Fruta[ls - li + 1];
	}
	void inserir(Fruta fru) throws FilaCheiaException{
		if(fim!=inicio - 1 && (inicio!=li || fim!=ls)){
			if(inicio == li - 1)
				inicio = fim = li;
			else
				if(fim == ls)
					fim = li;
				else
					fim ++;
                        vetor[fim] = fru;
		}
                else
			 throw new FilaCheiaException();
        }
	
	Fruta remover() throws FilaVaziaException{
		Fruta fru;
		if(inicio!= li - 1){
		fru = vetor[inicio];
		vetor[inicio] = null;
			if(inicio == fim)
				inicio = fim = li - 1 ;
			else
				if(inicio==ls)
					inicio = li;
				else
					inicio++;
                        return fru;
		}else
			throw new FilaVaziaException();}
}
