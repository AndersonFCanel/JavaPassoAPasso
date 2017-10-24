/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex03Hipotenuza;

import java.util.Scanner;

/**
 *
 * @author andersonfcanel
 */
public class Main {
    public static void main(String[] args) {
     
        double cateto1, cateto2;

        Scanner imput = new Scanner(System.in);
        System.out.print("Digite o cateto adsjacente: ");
        cateto1 = imput.nextDouble();
        System.out.print("Digite o oposto: ");
        cateto2 = imput.nextDouble();
        
        Hipot res= new Hipot();
        res.hipotenusa(cateto1, cateto2);
        
        System.out.println("O resulatdo da hipotenusa é " + res);
    }
    
}
