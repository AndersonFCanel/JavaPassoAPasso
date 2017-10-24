package j_arrays.VetoresExercios;

/*
Escreva um algoritmo em PORTUGOL que armazene em um vetor todos os números
inteiros do intervalo fechado de 1 a 100. Após isso, o algoritmo deve imprimir todos
os valores armazenados.
*/

public class ExercicioVetor2 {
	public static void main(String[] args) {
		int[] vet = new int[100];
		int i;

		vet[0] = 1;

		for (i = 1; i < vet.length; i++)
			vet[i] = vet[i - 1] + 1;
		/*
		 * OU vet[i]=i+1;
		 */
		System.out.print("vet = { ");

		/*
		 * OU for(i = 0 ; i<100; i++ )
		 */

		for (i = 0; i < vet.length; i++)
			System.out.print("vet[" + i + "]= " + vet[i] + " ");

	}
}