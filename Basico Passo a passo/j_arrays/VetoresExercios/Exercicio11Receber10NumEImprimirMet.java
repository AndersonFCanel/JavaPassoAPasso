/*
 11) Escreva um algoritmo em PORTUGOL que receba dez números do usuário e
armazene em um vetor a metade de cada número. Após isso, o algoritmo deve
imprimir todos os valores armazenados.
 */
package j_arrays.VetoresExercios;

import java.util.Scanner;

/**
 *
 * @author andersonfcanel
 */
public class Exercicio11Receber10NumEImprimirMet {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		double[] numeros;
		double valor;
		numeros = new double[10];
		int i;

		for (i = 0; i < numeros.length; i++) {
			System.out.println("Entre com valor : ");
			valor = s.nextDouble();
			numeros[i] = valor / 2;
		}

		for (i = 0; i < numeros.length; i++)
			System.out.println("A metade do numero " + numeros[i] + " é: " + numeros[i]);

	}
}
