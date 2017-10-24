package j_arrays.VetoresExercios;

/*21) Em uma cidade do interior, sabe-se que, de janeiro a abril de 1976 (121 dias), não
ocorreu temperatura inferior a 15ºC nem superior a 40ºC. As temperaturas verificadas
em cada dia estão disponíveis em uma unidade de entrada de dados.
Fazer um algoritmo em PORTUGOL que calcule e imprima:
- A menor temperatura ocorrida;
- A maior temperatura ocorrida;
- A temperatura média;
- O número de dias nos quais a temperatura foi inferior à temperatura média.*/
import java.util.Scanner;

public class ExercicioVetor21 {
	public static void main(String[] args) {
		Scanner s;
		double[] temperatura;
		int i, numeroDeDias;
		double menorTemp, maiorTemp, tempMedia, somaTemp;

		s = new Scanner(System.in);
		temperatura = new double[121];
		for (i = 0; i < temperatura.length; i++) {
			System.out.print("Digite uma temperatura: ");
			temperatura[i] = s.nextDouble();
		}
		menorTemp = maiorTemp = temperatura[0];
		for (i = 1; i < temperatura.length; i++) {
			if (temperatura[i] < menorTemp)
				menorTemp = temperatura[i];
			if (temperatura[i] > maiorTemp)
				maiorTemp = temperatura[i];
		}
		somaTemp = 0.0;
		for (i = 0; i < temperatura.length; i++)
			somaTemp += temperatura[i];
		tempMedia = somaTemp / temperatura.length;
		numeroDeDias = 0;
		for (i = 0; i < temperatura.length; i++)
			if (temperatura[i] < tempMedia)
				numeroDeDias++;
		System.out.println("Menor temperatura: " + menorTemp);
		System.out.println("Maior temperatura: " + maiorTemp);
		System.out.println("Temperatura média: " + tempMedia);
		System.out.println("Número de dias: " + numeroDeDias);
	}
}
