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

public class NovoClass {

    static int contador;

    public static int getContador() {
        return contador;
    }

    public static void incrementaContador() {
        contador++;
    }


    //PROCEDIMENTO QUICKSORT
    static void quickSort(int[] vet, int ini, int fim) {
        System.out.println("INICIO DO PROCEDIMENTO QUICKSORT (Topo do método)\n");
        System.out.println("Valor atual das variáveis e do vetor: \n");
        int i, j, pivo, aux, cont;
        i = ini;
        j = fim;
        pivo = vet[(ini + fim) / 2];
        System.out.println("A variável i vale:" + i);
        System.out.println("A variável j vale: " + j);
        //System.out.println("Pivo está na posicao :"+pivo+". Com valor:  "+vet[pivo]);
        System.out.println("O vetor atualmente está organizado dets forma: ");

        for (cont = 0; cont < vet.length; cont++) {
            System.out.printf(cont + ")" + vet[cont] + " * \n");
        }
        System.out.println("\n");
        while (i < j) {
            System.out.println("INICIO DO LACO WHILE (i<j)(LACO DE FORA) ");
            while (vet[i] < pivo) {
                i++;
                System.out.println("Teste loop 1{while(vet[i]<pivo)} = VERDADEIRO\n>> Variável i é incrementada,e agora esá na posição: " + i);
            }
            System.out.println("Teste loop 1{while(vet[i]<pivo)} = FALSO   -->>> Próximo passo: ");
            
            while (vet[j] > pivo) {
                j--;
                System.out.println("Teste loop 2{while(vet[j]>pivo)} = VERDADEIRO\n>> Variável j é decrementada ,e agora esá na posição: " + j);
            }
            System.out.println("Teste loop 2{while(vet[j]>pivo)} = FALSO   -->>> Próximo passo: ");
            System.out.println("\n");
            
            if (i <= j) {
                System.out.println("INÍCIO DA ESTRUTURA DE DESIÇÃO {if(i<=j)=VERDADEIRO}");
                System.out.println("SERÁ feita a troca  do valor de vet[i]:  " + vet[i] + " que está na posição: " + i + "\npor valor de vet[j]: " + vet[j] + " que está na posição: " + j);
                aux = vet[i];
                vet[i] = vet[j];
                vet[j] = aux;
                System.out.println("TROCARAM, agora está assim vet[i]: " + vet[i] + " foi para posisao: " + i + "\npor valor vet[j]: " + vet[j] + " foi para posisao: " + j);
                i++;
                j--;
                System.out.println("Fim do if i<=j, i e j mudam de valor i(incrementado): " + i + " e j(decrementado): " + j);
                incrementaContador();
            }
            
            System.out.println("\n");
            System.out.println("I e J agora valem respectivamente: I = " + i + " J=" + j);
            System.out.println("Atualmente o vetor esta assim: ");
            for (cont = 0; cont < vet.length; cont++) {
                System.out.printf(cont + ")" + vet[cont] + " * \n");
            }
            System.out.println("Fim do laco maior(WHILE i<j).\n");
        }
        //recursividade
        /**/
        System.out.println("INÍCIO DA RECURSIVIDADE DO PROCEDIMENTO\n");
        if (j > ini) {
            System.out.println("PRIMEIRO IF(if (j > ini))=VERDADEIRO");
            System.out.println("i vale:" + i);
            System.out.println("j vale: " + j);
            System.out.println("pivo vale :" + pivo);
            System.out.println("RECURSIVIDADE DO PRIMEIRO IF: \n");
            quickSort(vet, ini, j);
            System.out.println("TERMINOU PRIMEIRO IF(if (j > ini))-recursivo \n");
        }
        System.out.println("If (if (j > ini))=FALSO próximo passo-->>>");
        System.out.println("\n");
        if (i < fim) {
            System.out.println("SEGUNDO IF(if (i < fim) )=VERDADEIRO");
            System.out.println("i vale:" + i);
            System.out.println("j vale: " + j);
            System.out.println("pivo vale :" + pivo);
            System.out.println(" RECURSIVIDADE DO SEGUNDO IF: \n");
            quickSort(vet, i, fim);
            System.out.println("TERMINOU SEGUNDO IF (if (i < fim) )- recursivo\n");
        }/**/
        System.out.println("If (if (i < fim))=FALSO próximo passo-->>>");
        System.out.println("\n");
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
        System.out.println("Para entrar com números manualmente: M \nPara preenchimento automático aperte qualquer tecla");
        String resposta = s.next();
       

        if (resposta.equals("M") || resposta.equals("m")) {
            System.out.println("Entre com os números manualmente\n");
            while (x < vetNum.length) {
                System.out.println("Digite o valor da posição: "+x);
                 vetNum[x] = s.nextInt();
                x++;
                System.out.println("");
            }
        } else {
            System.out.println("Entrada automática");
            while (x < vetNum.length) {
                vetNum[x] = r.nextInt(10000);
               System.out.println("INSERT AUTOMÁTICO: "+vetNum[x]);
                x++;
            }
        }

        inicio = (TAMANHO - TAMANHO);
        fina = TAMANHO - 1;
        quickSort(vetNum, inicio, fina);
        imprimir(vetNum);
        //JOptionPane.showMessageDialog(null,"Qtd de vezes que houve troca: "+QuickSortProcedural.contador());
        System.out.println("Qtd de vezes que houve troca: " + getContador());
    }

}
