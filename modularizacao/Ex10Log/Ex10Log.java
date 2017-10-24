/*
Exercício 10) Crie uma função recursiva (um método em Java) de nome logDois a partir da seguinte definição recursiva:
				0	se x ≤ 1.0
	 logDois(x) =	1	se x > 1.0 e x ≤ 2.0
				1 + logDois(x / 2)	se x > 2.0

	Essa função possui um parâmetro do tipo real e retorna um inteiro. Faça também um módulo principal (método main) que leia um valor, chame a função logDois usando esse valor como parâmetro e mostre na tela o resultado dessa função.

 */
import java.util.Scanner;

class Ex10Log {
    static int logDois(double x) {
        if(x <= 1.0)
            return 0;
        else
            if(x > 1.0 && x <= 2.0)
                return 1;
            else
                return 1 + logDois(x / 2);
    }

    public static void main(String[] args) {
        Scanner s;
        double valor;
        int resultado;

        s = new Scanner(System.in);
        System.out.print("Digite um número real: ");
        valor = s.nextDouble();
        resultado = logDois(valor);
        System.out.println("O resultado é " + resultado);
    }
}
