 //fatorial não recursiva  -->> fatorial(n) = n * (n – 1) * (n – 2) * ... * 3 * 2 * 1

import java.util.Scanner;

   public class Ex07Modulo{

  static int fatorial(int n) {
        int fat, i;

        fat = 1;    //Inicialização das variáveis
        i = 1;

        while(i <= n)    //Enquanto i for menor que o parametro passado para função
        {
            fat = fat * i;
            i = i + 1; //ou i++;
        }
        return fat;

    }

    public static void main(String[] args) {

        Scanner  s = new Scanner(System.in);
        int valor, resultado;

       
        System.out.print("Digite um inteiro: ");
        valor = s.nextInt();

        resultado = fatorial(valor);
        System.out.println("O resultado é " + resultado);

  /*OU
      System.out.println("O resultado é " +  fatorial(valor););
  */

    }
}