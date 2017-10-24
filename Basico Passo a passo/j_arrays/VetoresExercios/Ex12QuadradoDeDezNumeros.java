/*
 12) Escreva um algoritmo em PORTUGOL que receba dez números do usuário e
armazene em um vetor o quadrado de cada número. Após isso, o algoritmo deve
imprimir todos os valores armazenados.
 */
package j_arrays.VetoresExercios;

import java.util.Scanner;

public class Ex12QuadradoDeDezNumeros {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double[] vet;
		vet = new double[10];
		int i;

		for (i = 0; i < vet.length; i++) {
			System.out.println("Entre com um numero real: ");
			vet[i] = s.nextDouble();

		}

		for (i = 0; i < vet.length; i++) {
			System.out.println("O quadrado de " + vet[i] + " é: " + (vet[i] * vet[i]));
		}
	}
}
