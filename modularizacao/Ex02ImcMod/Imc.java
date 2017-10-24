 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex02ImcMod;

import java.util.Scanner;

/**
 *
 * @author andersonfcanel
 */
public class Imc {
     public static void main (String[] arg){
	   double peso,altura;
	   Scanner imput = new Scanner (System.in);
	   
	   System.out.println("Digite o peso");
	   peso = imput.nextDouble();
	   
	   System.out.println("Digite a altura");
	   altura = imput.nextDouble(); 
	   
           Massa imc = new Massa();
	   imc.massa(peso,altura);
	 }
    
}
