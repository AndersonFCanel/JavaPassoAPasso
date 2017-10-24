/*Exercício 6)
 Crie uma função recursiva (um método em Java) de nome fatorial a partir da seguinte definição recursiva:
				1	se n = 0
	fatorial(n) =
				n * fatorial(n – 1)	se n > 0

Essa função possui um parâmetro do tipo inteiro. Faça também um módulo principal (método main) que leia um valor, chame a função fatorial usando esse valor como parâmetro e mostre na tela o resultado dessa função.

*/


import java.util.Scanner;

class Ex06 {
    static int fatorial(int n) {
        if(n <= 0)
            return 1;
        else
            return n * fatorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner s;
        int valor, resultado;

        s = new Scanner(System.in);
        System.out.print("Digite um inteiro: ");
        valor = s.nextInt();
        resultado = fatorial(valor);
        System.out.println("O fatorial de "+valor+" é: " + resultado);
    }
}
