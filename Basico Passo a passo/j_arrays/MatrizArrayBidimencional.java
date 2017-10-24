package j_arrays;

import java.util.Scanner;

public class MatrizArrayBidimencional {
	public static void main(String[] args) {
		int[][] numeros = new int[5][4];

		int linhas = 5;
		int colunas = 4;

		//inicia todos os números com -1
		for(int i = 0; i < linhas; i++)
		{
			for(int j = 0; i < colunas; i++)
			{
				numeros[i][j] = -1;	
			}	
		}

		Scanner in = new Scanner(System.in);

		String opcao = "s";

		//while(opcao == "s")
		//{
			System.out.println("Informe a linha onde deseja inserir o valor:");
			int x = in.nextInt();
			System.out.println("Informe a coluna onde deseja inserir o valor:");
			int y = in.nextInt();
			if(numeros[x][y] != -1)
			{
				System.out.println("Informe o valor que deseja inserir nessa posição:");	
				numeros[x][y] = in.nextInt();
			}
			else
			{
				System.out.println("O elemento desta posição já foi preenchido.");	
			}
			//System.out.println("Deseja continuar? s/n");		
			//opcao = in.next();
		//}
	}
}
