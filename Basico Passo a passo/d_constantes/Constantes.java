package d_constantes;

import java.util.Scanner;

public class Constantes {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		int populacaoBrasileira=203429773;
		/* A população brasileira modifica-se a cada segundo sendo 
		 * assim é justificavél que esse valor seja armazenavel em 
		 * uma variável e não em uma constante.
		 */
		final double PI=3.14159255;
		/*Podemos definir uma constante utilizando o modificador final,
		 * o a variável com esse modificador torna-se imutável ao longo 
		 * do  código.
		 * É uma regra que constantes sejm definidas com letras maiusculas. 
		 */
		System.out.println("O valor de PI é: "+PI);
		/*Caso tentarmos modificar ou atribuir um novo valor a essa 
		 * variável os sistema exibira um erro para que retiremos o
		 *  modificador final.
		 */
		//PI=22;//SE RETIRAR O '//' será gerado um erro.
		
		double VALORPI=3.14159255;
		VALORPI=222.333;//Sem o modificador final é permitida a modificação indevida
		
		
		
	}
}
