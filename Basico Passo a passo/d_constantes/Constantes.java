package d_constantes;

import java.util.Scanner;

public class Constantes {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		int populacaoBrasileira=203429773;
		/* A popula��o brasileira modifica-se a cada segundo sendo 
		 * assim � justificav�l que esse valor seja armazenavel em 
		 * uma vari�vel e n�o em uma constante.
		 */
		final double PI=3.14159255;
		/*Podemos definir uma constante utilizando o modificador final,
		 * o a vari�vel com esse modificador torna-se imut�vel ao longo 
		 * do  c�digo.
		 * � uma regra que constantes sejm definidas com letras maiusculas. 
		 */
		System.out.println("O valor de PI �: "+PI);
		/*Caso tentarmos modificar ou atribuir um novo valor a essa 
		 * vari�vel os sistema exibira um erro para que retiremos o
		 *  modificador final.
		 */
		//PI=22;//SE RETIRAR O '//' ser� gerado um erro.
		
		double VALORPI=3.14159255;
		VALORPI=222.333;//Sem o modificador final � permitida a modifica��o indevida
		
		
		
	}
}
