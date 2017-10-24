package j_arrays.VetoresExercios;

import java.util.*;

/*
16) Escreva um algoritmo em PORTUGOL que receba a altura de 10 atletas. Esse
algoritmo deve imprimir a altura daqueles atletas que tem altura maior que a média.
*/
public class Exercicio16Vetor {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double[] altura = new double[10];
		int i;
		double soma = 0, media = 0;

		for (i = 0; i < altura.length; i++) {
			System.out.println("Digite a altura: ");
			altura[i] = input.nextDouble();
		}

		for (i = 0; i < altura.length; i++)
			soma = altura[i] + soma;

		media = soma / altura.length;

		for (i = 0; i < altura.length; i++) {
			if (altura[i] > media)
				System.out.println("Altura maior que a média geral : " + altura[i]);
		}
	}
}