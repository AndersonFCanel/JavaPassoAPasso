/*
	Exercício 9) Crie uma função recursiva (um método em Java) de nome soma a partir da seguinte definição recursiva:
				a	se a = b
	soma(a, b) =	a + soma(a + 1, b)		se a < b
				soma(b, a)		se a > b

	Essa função possui dois parâmetros do tipo inteiro. Faça também um módulo principal (método main) que leia dois valores, chame a função soma usando esses valores como parâmetros e mostre na tela o resultado dessa função.

 */
package Ex09Soma;

import java.util.Scanner;

/**
 *
 * @author andersonfcanel
 */
public class Somma {
    public static int soma(int a, int b){
        if(a ==b)
            return a;
        else if(a<b)
              return a+soma(a+1,b);
              else if(a>b)
                   return soma(b,a);
        return 0;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int a = s.nextInt();
        System.out.println("Digite outro valor: ");
        int b = s.nextInt();
        
        
        
        System.out.println("O resultado da operação é: "+soma(a,b));
    }
    
}
