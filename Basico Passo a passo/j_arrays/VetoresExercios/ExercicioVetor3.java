package j_arrays.VetoresExercios;

/*
03) Escreva um algoritmo em PORTUGOL que armazene em um vetor todos os números
inteiros de 100 a 1 (em ordem decrescente). Após isso, o algoritmo deve imprimir
todos os valores armazenados.
*/

public class ExercicioVetor3 {
	public static void main(String[] args) {
		int[] vet;
		int i;

		vet = new int[100];
		vet[0] = 100;

		for (i = 1; i < vet.length; i++)
			vet[i] = vet[i - 1] - 1;
		System.out.print("vet = { ");

		for (i = 0; i < vet.length; i++)
			System.out.print(vet[i] + ", ");
		System.out.println("-}");
	}
}

/*
 * OU class ExercicioVetor3X { public static void main(String[] args) { int[]
 * vet; int i;
 * 
 * vet = new int[100];
 * 
 * for(i = 0; i < vet.length; i++) vet[i] = 100 - i;
 * System.out.print("vet = { ");
 * 
 * for(i = 0; i < vet.length; i++) System.out.print(vet[i] + " ");
 * System.out.println("}"); } }
 * 
 * OU***********
 * 
 * class Exercicio3Modularizado {
 * 
 * static void criar(int[] v){ int i; for(i = 0; i < vet.length; i++) vet[i] =
 * v.lenght - 1; }
 * 
 * static void mostrar(int[] v){ int i; for(i = 0; i < vet.length; i++)
 * System.out.print(vet[i] ); }
 * 
 * public static void main(String[] args) { int[] vet = new int[100];
 * 
 * criar(vet);
 * 
 * mostrar(vet);
 * 
 * 
 * } }
 */
