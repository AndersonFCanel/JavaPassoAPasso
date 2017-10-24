package Ex04CoverssorDollarReal;

/*Exercício 4) 
Crie uma função (um método em Java) de nome conversor1 que possui um 
parâmetro: real. Essa função retorna o resultado da conversão  de um 
valor em reais (no parâmentro real) para um valor em dólares. 
Sabe-se que um dólar vale 1.62 reais. Faça também um módulo principal 
(método main) que leia um valor em reais, chame a função conversor1 e 
mostre na tela o valor em dólares obtido dessa função.
*/
import java.util.*;

class Converssor{
     static double conversor1(double real){
     double dolar = real/1.62;	 
     return dolar;
	 }
/*OU
    class ExercicioModularizacao4 {
    static float conversor1(float real) {
        float dolar;

        dolar = real / 1.62f;
        return dolar;
    }
*/	 
	 
	 public static void main(String[] args){
	    
		Scanner imput = new Scanner(System.in);
		 double real;
		 
		 System.out.println("Digite o valor que deseja converter : ");
		 real = imput.nextLong();
		 
		 System.out.println("O valor convertido em dolares equivale a : "+ conversor1(real));
	 }
}