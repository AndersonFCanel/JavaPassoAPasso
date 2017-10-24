package g_entradaDeDadosComScanner;

import java.util.Scanner;

public class EntradaDeDadosComScanner {
  public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
	int i;
	String s;
	double d;
	char c;
	boolean  b;
  
  System.out.println("Entre com os dados para: ");
  
  //Capturando um inteiro com Scanner
  System.out.println("inteiro: ");
  i = entrada.nextInt();
  System.out.println("O valor digitado é: "+i);
  
//Capturando um array de caracter(String) com Scanner
  System.out.println("String: ");
  s = entrada.next();
  System.out.println("O valor digitado é: "+s);
  
//Capturando um caracter com Scanner
  System.out.println("char: ");
  c = entrada.next().charAt(0);
  System.out.println("O valor digitado é: "+c);
  
//Capturando um boolean com Scanner
  System.out.println("booleam: ");
  b = entrada.nextBoolean();
  System.out.println("O valor digitado é: "+b);
  }
  
}