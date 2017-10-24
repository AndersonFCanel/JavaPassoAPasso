/*
 14) Escreva um algoritmo em PORTUGOL que receba quinze números do usuário e
armazene em um vetor a raiz quadrada de cada número. Caso o valor digitado seja
menor que zero o número –1 deve ser atribuído ao elemento do vetor. Após isso, o
algoritmo deve imprimir todos os valores armazenados.
 */
package j_arrays.VetoresExercios;

import java.util.Scanner;

public class Ex14RaizQuadComMath {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		double[] vet;
		vet = new double[15];

		double[] vetaux;
		vetaux = new double[15];

		int i;

		for (i = 0; i < vet.length; i++) {
			System.out.println("Digite um valor: ");
			vet[i] = s.nextDouble();
			if (vet[i] < 0)
				vetaux[i] = -1;
			else
				vetaux[i] = Math.sqrt(vet[i]);
		}

		for (i = 0; i < vet.length; i++) {
			System.out.println("A raiz quadrada do numero " + vet[i] + " é : " + vetaux[i]);
		}
	}
}