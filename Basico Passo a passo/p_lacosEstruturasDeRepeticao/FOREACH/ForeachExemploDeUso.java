package p_lacosEstruturasDeRepeticao.FOREACH;

import java.util.ArrayList;
import java.util.Scanner;

public class ForeachExemploDeUso {
	public static void main(String[] args) {
		 ArrayList<Integer> list = new ArrayList<Integer>();
	        list.add(1);
	        list.add(2);
	        list.add(3);
	        list.add(4);
	        list.add(5);
	        //....
	        int qnt = 0;
	        for (Integer integer : list) {
	            System.out.println(integer);
	            qnt += integer;
	        }
	        
	        //OUTRA FORMA
	        
	        
	        int[] numero = new int[5];
            int soma=0;
            Scanner entrada = new Scanner(System.in);
            
            for(int cont=0 ; cont< numero.length ; cont++){
                System.out.print("Entre com o número "+(cont+1)+": ");
                numero[cont]=entrada.nextInt();
            }
            
            //exibindo e somando
            for(int cont : numero){
                soma += cont;
            }
            
            System.out.println("A soma dos números que você digitou é "+soma);
        }

	          
	}

