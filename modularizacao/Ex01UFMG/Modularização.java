
package Ex01UFMG;

import java.util.Scanner;

public class Modularização {

    public static void main(String[] args) {
   
         Scanner input = new Scanner(System.in);
       int a; 
       
       System.out.println("Digite o número do mês que deseja exibir na tela: ");
        a = input.nextInt();

        Meses teste =new Meses();
   
       System.out.println("O mes correspondente ao numero é: " + teste.meseS(a));     

   } 
        // TODO code application logic here
    }
    

