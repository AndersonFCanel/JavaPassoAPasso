package h_JOptionPane_Exemplos;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class EntradaDeDadosUsandoJanela {
	  public static void main(String[] args) {
			
			Scanner entrada = new Scanner(System.in);
			int i;
			String s;
			double d;
			char c;
			boolean  b;
		  
		  //O metodo abaixo recebe dados digidados pelo usuario atraves de uma janela
			//Seu retorno é uma String
		  String nome = JOptionPane.showInputDialog("Qual o seu nome? ");
		  
		  JOptionPane.showMessageDialog(null,"Seu nome é "+nome+" ?");
		  
		  
		  
	  }

}