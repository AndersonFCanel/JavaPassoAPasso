package Ordenacao.QuickSort.Procedural;

/*
Procedimento QUICKSORT(var A, INIVET, FIMVET)
I <-INIVET
J <-FIMVET
PIVO <-A[(INIVET + FIMVET) div 2]
enquanto I <= J faça
enquanto A[I] < PIVO faça
I <-I + 1
fim_enquanto
enquanto A[j] > PIVO faça
J <-J -1
fim_enquanto
se (I <= j) então
AUX <-A[I]
A[I] <-A[j]
A[j] <-AUX
I <-I + 1
J <-J -1
fim_se
fim_enquanto
se J > INIVET então
QUICKSORT(A, INIVET, J)
fim_se
se I < FIMVET então
QUICKSORT(A, I, FIMVET)
fim_se
fim_procedimento
 */
import java.util.Random;
import java.util.Scanner;

public class QuickSort {

    //PROCEDIMENTO QUICKSORT
    static void quickSort(int[] vet, int ini, int fim) {
        int i, j, pivo, aux, cont;
        i = ini;
        j = fim;
        pivo = vet[(ini + fim) / 2];

        while (i < j) {
            while (vet[i] < pivo) {
                i++;
            }
            while (vet[j] > pivo) {
                j--;
            }
            if (i <= j) {
                aux = vet[i];
                vet[i] = vet[j];
                vet[j] = aux;
                i++;
                j--;
            }

        }
        //recursividade
        if (j > ini) {
            quickSort(vet, ini, j);
        }
        if (i < fim) {
            quickSort(vet, i, fim);
        }/**/
    }
    //método imprimir.

    static void imprimir(int[] vet) {
        System.out.println("Apresentação do vetor organizado: \n");
        int cont;
        System.out.println("POSIÇÃO:         VALOR DA POSIÇÃO:");
        for (cont = 0; cont < vet.length; cont++) {
            System.out.printf((cont + 1) + ")               " + vet[cont] + " * \n");
        }
        System.out.println("");
    }
    //método main.

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int TAMANHO;
        Random r = new Random();
        System.out.println("Quantos numeros ira digitar: ");
        TAMANHO = s.nextInt();

        int[] vetNum = new int[TAMANHO];
        int x = 0, inicio, fina;

        /*vetNum[0]=28;
		vetNum[1]=22;
		vetNum[2]=27;
		vetNum[3]=42;
		vetNum[4]=46;
		vetNum[5]=24;*/
        System.out.println("Entre com " + TAMANHO + " números: ");
        String resposta;
        System.out.println("Para entrar manualmente: M \n PARA AUTOMÁTICO DIGITE QUALQUER COISA");
        resposta = s.next();

        String letras;

        if (resposta.equals("M") || resposta.equals("m")) {
            System.out.println("Entre com os números manualmente");
            while (x < vetNum.length) {
                letras = s.next();
                

                for (int i = 0; i < letras.length(); i++) {
                    if (Character.isDigit(letras.charAt(i)) == true) { // caso seja número o valor é inserido no vetor
                        vetNum[x] = Integer.parseInt(letras);
                    } else {
                        System.out.println("Digite um número por favor!!");
                        letras = s.next();
                        i--;
                    }
                }
                x++;

            }
        } else {
            System.out.println("Entrada automática");
            while (x < vetNum.length) {
                vetNum[x] = r.nextInt(10000);
                x++;
            }
        }
        inicio = (TAMANHO - TAMANHO);
        fina = TAMANHO - 1;
        //procedimento quickSort
        quickSort(vetNum, inicio, fina);
        imprimir(vetNum);
    }
}
