/*
 12) Escreva um algoritmo em PORTUGOL que receba dez números do usuário e
armazene em um vetor o quadrado de cada número. Após isso, o algoritmo deve
imprimir todos os valores armazenados.
 */
package j_arrays.VetoresExercios;

import java.util.Scanner;

public class Ex12QuadradoComMath {
	public static void main(String[] args) {

		Scanner s;
		s = new Scanner(System.in);

		int[] num_Vet = new int[10];
		int[] num_VetQuad = new int[10];
		int i;

		System.out.println("Entre com dez números: ");
		for (i = 0; i < num_Vet.length; i++) {
			num_Vet[i] = s.nextInt();
			num_VetQuad[i] = (int) Math.pow(num_Vet[i], 2);
		}

		for (i = 0; i < num_Vet.length; i++)
			System.out.println("O quadrado de " + num_Vet[i] + " é: " + num_VetQuad[i]);
	}
}
