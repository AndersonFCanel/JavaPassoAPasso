package Ex02Imc;

import java.util.Scanner;

class Imc {
  static void Massa(double peso , double altura) {
     double imc = peso /(altura*altura);
	 if (imc<20)
	    System.out.println("Abaixo do peso");
	 else if ( imc>20 && imc<25 )
              System.out.println("Peso normal");
          else if(imc>25)
               System.out.println("Acima do peso");		  
		
  }
  
     public static void main (String[] arg){
	   double peso,altura;
	   Scanner imput = new Scanner (System.in);
	   
	   System.out.println("Digite o peso");
	   peso = imput.nextDouble();
	   
	   System.out.println("Digite a altura");
	   altura = imput.nextDouble(); 
	   
	   Massa(peso,altura);
	 }
}