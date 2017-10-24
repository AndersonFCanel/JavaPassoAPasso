/*
15) Escreva um algoritmo em PORTUGOL que receba oito números do usuário e
armazene em um vetor o logaritmo de cada um deles na base 10. Caso não seja
possível calcular o valor para o número digitado, o número –1 deve ser atribuído ao
elemento do vetor. Após isso, o algoritmo deve imprimir todos os valores
armazenados.
 */
package j_arrays.VetoresExercios;

import java.util.Scanner;

public class Ex15Logaritmo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double[] num;
		num = new double[8];

		double[] vetlog;
		vetlog = new double[8];
		int i;

		for (i = 0; i < num.length; i++) {
			System.out.println("Entre com um numero: ");
			num[i] = s.nextDouble();
			if (num[i] <= 0)
				vetlog[i] = -1;
			else
				vetlog[i] = Math.log10(num[i]);
		}

		for (i = 0; i < num.length; i++) {
			System.out.println("O log na base 10 de " + num[i] + " é " + vetlog[i]);
		}
	}
}
