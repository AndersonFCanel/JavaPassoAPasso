package j_arrays.Exemplos;

import java.util.Scanner;

class F1_Array {
    public static void main(String[] args) {
        Scanner s;
        double[] vet, vetor;
        int i;
        final int MAX = 6;

        s = new Scanner(System.in);
        vet = new double[MAX];
        vetor = new double[MAX];
        
        
        //Entrada de dados atraves de scanner no array vet
        for(i = 0; i < MAX; i++)
        {
            System.out.print("Digite um real: ");
            vet[i] = s.nextDouble();
        }
        
        //impress�o dos valores inseridos
        System.out.print("vet = { ");
        for(i = 0; i < MAX; i++)
            System.out.print(vet[i] + " ");
        System.out.println("}");
        

        //Entrada de dados atraves de scanner no array vetor
        for(i = 0; i < MAX; i++)
        {
            System.out.print("Digite um real: ");
            vetor[i] = s.nextDouble();
        }
        
      //impress�o dos valores inseridos
        System.out.print("vetor = { ");
        for(i = 0; i < MAX; i++)
            System.out.print(vetor[i] + " ");
        System.out.println("}");
    }
}
