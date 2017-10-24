package Ordenacao.BubleSort;

import java.util.Random;
import java.util.Scanner;

public class BubleSort {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        int TAMANHO;
        System.out.println("Quantos numeros ira digitar: ");
        TAMANHO = s.nextInt();
        int[] numVet = new int[TAMANHO];
        int aux, i, j, x = 0;
        boolean controle = true; //variável responsável pelo corte do laçõ assim que estiver ordenado

        System.out.println("Entre com " + TAMANHO + " números: ");

        System.out.println("Para entrar com números manualmente: M \nPara preenchimento automático aperte qualquer tecla");
        String resposta = s.next();

        if (resposta.equals("M") || resposta.equals("m")) {
            System.out.println("Entre com os números manualmente\n");
            while (x < numVet.length) {
                System.out.println("Digite o valor da posição: " + x);
                numVet[x] = s.nextInt();
                x++;
                System.out.println("");
            }
        } else {
            System.out.println("Entrada automática");
            while (x < numVet.length) {
                numVet[x] = r.nextInt(10000);
                System.out.println("INSERT AUTOMÁTICO: " + numVet[x]);
                x++;
            }
        }
        System.out.println("Atualmente o vetor esta assim: ");
        for (i = 0; i < numVet.length; i++) {
            System.out.println("Posição " + (i + 1) + " = " + numVet[i]);
        }
        
        
        for (i = 0; i < numVet.length - 1; i++) {
            System.out.println("O valor da variável I é: "+i);
            for (j = i + 1; j < numVet.length; j++) {
                if (numVet[i] > numVet[j]) {
                    aux = numVet[i];
                    numVet[i] = numVet[j];
                    numVet[j] = aux;
                }
            }
        }

        if (controle) {
            for (i = 0; i < numVet.length; i++) {
                System.out.println("Posição " + (i + 1) + " = \tvalor:" + numVet[i]);
            }
        }
    }
}
