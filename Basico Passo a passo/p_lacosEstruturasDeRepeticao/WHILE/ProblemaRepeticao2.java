package p_lacosEstruturasDeRepeticao.WHILE;

/* Faça um programa em Java que repita a leitura de números reais 
(digitados pelo teclado) enquanto não for digitado um número positivo. 
Dentro desta repetição calcule o somatório dos números digitados. No final 
do programa mostre na tela o valor final do somatório calculado. */

import java.util.Scanner;

class ProblemaRepeticao2 {
    public static void main(String[] args) {
        Scanner s;
        float num, soma;

        s = new Scanner(System.in);
        soma = 0.0f;
        //System.out.print("Digite um real: ");
        //num = s.nextFloat();
    	
        char key = 0;  //Esta variável deverá receber o valor da tecla que for pressionada

        System.out.println("SOMENTE SÂO ACEITAS ENTRADAS DE NÚMEROS REAIS:");
    	while (key != 's' || key!='S') 
        {
           
            System.out.print("Digite um real: ");
            num = s.nextFloat();
            soma += num;
            System.out.println("O somatório é " + soma);
            System.out.println("\n\nPresione s caso deseje sair ou qualquer outra coisa para continuar!");
            key = s.next().charAt(0);
        }
        
    }
}
