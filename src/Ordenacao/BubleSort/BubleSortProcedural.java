package Ordenacao.BubleSort;

import java.util.Random;
import java.util.Scanner;

public class BubleSortProcedural {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        int TAMANHO;
        System.out.println("Quantos numeros ira digitar: ");
        TAMANHO = s.nextInt();
        int[] numVet = new int[TAMANHO];
        int aux, i, j;

        for (i = 0; i < numVet.length; i++) {
            //System.out.println("Entre com um número posição "+(i+1)+": " );
            numVet[i] = r.nextInt(10000);
            System.out.println("" + numVet[i]);
        }
        for (i = 0; i < numVet.length - 1; i++) {
            for (j = i + 1; j < numVet.length; j++) {
                if (numVet[i] > numVet[j]) {
                    aux = numVet[i];
                    numVet[i] = numVet[j];
                    numVet[j] = aux;
                }
            }
        }
        for (i = 0; i < numVet.length; i++) {
            System.out.println("Posição " + (i + 1) + " = " + numVet[i]);
        }
    }
}
