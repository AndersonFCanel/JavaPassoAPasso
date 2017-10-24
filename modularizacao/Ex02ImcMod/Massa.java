/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex02ImcMod;

/**
 *
 * @author andersonfcanel
 */
public class Massa {
  
    public void massa(double peso , double altura) {
     double imc = peso /(altura*altura);
	 if (imc<20)
	    System.out.println("Abaixo do peso");
	 else if ( imc>20 && imc<25 )
              System.out.println("Peso normal");
          else if(imc>25)
               System.out.println("Acima do peso");		  
		
  }
    
}
