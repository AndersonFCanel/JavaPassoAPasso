    //testando a divisibilidade de dois inteiros inseridos pelo usuário.
package ex07ufmg;

import java.util.Scanner;

   public class Ex07ModuloUFMG{

       public static int div (int a, int b) {
                  if((a%b)==0) {
               return 1;
           }
                  else if( a%b != 0) {
               return 0;
           } 
           return 0;
      }
    

   public static void main (String[] args){

         Scanner imput=new Scanner(System.in);

            System.out.println("Digite um numero x: ");
             int a =imput.nextInt();
            System.out.println("Digite um numero y: ");
             int b =imput.nextInt();

          System.out.println("O retorno da função div é : " + div(a,b));
  }        

}