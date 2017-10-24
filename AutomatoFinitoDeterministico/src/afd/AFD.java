package afd;
/*AFD

Autômato Finito Determinístico - Código simples em JAVA IDE utilizado Eclipse Versão: Luna Service Release 1 (4.4.1)

O código exige que a entrada de teste seja feita da seguinte maneira:

Dividiremos nossa entrada em 5 partes, conforme descreve a notação formal de um Autômato Finito, ou seja, M = (Q, Σ, δ, q0, F), onde temos:

(Q) = um conjunto finito de estados (Σ) = um conjunto finito de símbolos de entrada chamado Alfabeto (δ : Q × Σ → Q) = uma função de transição (q0 ∈ Q) = um estado inicial (F ⊆ Q) = um conjunto de estados de aceitação ou conjunto de estados finais

//Explicando a entrada:

a,b --->>> (Σ) Alfabeto 
e0,e1 --->>> (Q) Conjunto de estados
e0,a=e0:e0,b=e1:e1,b=e1 --->>> δ Função transição
e0 --->>> q0 Estado Inicial
e0,e1 --->>> F Conjunto de estados Finais
 * 
 * */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.swing.JOptionPane;

public class AFD {

	public static void main(String[] args) {
		
		File file = new File("C:\\Users\\Anderson\\workspace\\JavaPassoAPasso\\AutomatoFinitoDeterministico\\src\\afd/entradaAutomato.txt"); // Arquivo de entrada está anexado
		try{
			
			// Leitura e separação do arquivo
			
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			
			String alfabeto = br.readLine();
			String estados = br.readLine();
			String funcaoPrograma = br.readLine();
			String estadoInicial = br.readLine();
			String estadosFinais = br.readLine();
			
			String [] alf = DividirEConquistar(alfabeto);
			String [] est = DividirEConquistar(estados);
			String [] estIn = DividirEConquistar(estadoInicial);
			String [] estFin = DividirEConquistar(estadosFinais);
			
			String [] funcaoPro = DivideTransicao(funcaoPrograma);
			
			String [] ED = new String[funcaoPro.length];//Estado de Destino
			String [] EP = new String[funcaoPro.length];//Estado de Partida
			String [] EA = new String[funcaoPro.length];//Estado de Alfabetos
			
			for(int i = 0;i<funcaoPro.length;i++){
				String[] p1 = funcaoPro[i].split("=");
				ED[i] = p1[1];
				String[] p2 = p1[0].split(",");
				EP[i] = p2[0];
				EA[i] = p2[1];
			}
			
			//Pegando entrada
			while(true){
				String EI = estadoInicial;
				String palavra = null;
				palavra = JOptionPane.showInputDialog("Informações--- \n\n Alfabeto: {"+alfabeto+"}\nEstados: {"+estados+"} \n\nEntre com uma palavra: ");
				
				if(VerificaPalavra(palavra,alf)){
					boolean flag = false;
					for(int x = 0 ; x <palavra.length() ; x++){
						String l = ""+palavra.charAt(x);
						int monitora = 0;
						for(int y = 0 ; y <ED.length ; y++){
							if(l .equals(EA[y]) && EI .equals(EP[y])){
								EI = ED[y];
								monitora++;
							}
						}
						if(monitora == 0){
							flag = true;
							break;
						}
					}
					
					if(flag){
						JOptionPane.showMessageDialog(null,"Palavra não pertence ao alfabeto!");
					}else{
						PalavraAceita(EI,estFin); // Verifica se o estado final pertence a um dos estados finais
					}
					
					
				}else{
					JOptionPane.showMessageDialog(null,"Palavra não pertence ao alfabeto!");
				}
				
			}
			
		}catch(Exception e){
			System.out.println("Erro:"+e);
		}

	}

	private static boolean VerificaPalavra(String palavra, String [] alf) {
		
		int cont = 0;
		for(int x = 0 ; x < palavra.length(); x++){
			String l = ""+palavra.charAt(x);
			for(int y = 0 ; y < alf.length ; y++){
				if(l .equals(alf[y])){
					cont++;
				}
			}
		}
		
		if(cont == palavra.length()){
			return true;
		}else{
			return false;
		}
		
	}

	private static void PalavraAceita(String EP, String[] estFin) {
		
		int x = 0;
		for(int i = 0 ; i < estFin.length ; i++){
			if(EP .equals(estFin[i])){
				x = 1;
			}
		}
		
		if(x == 1){
			JOptionPane.showMessageDialog(null, "Palavra Aceita");
		}else{
			JOptionPane.showMessageDialog(null, "Palavra não foi aceita");
		}
		
	}

	private static String[] DivideTransicao(String valor) {
		return valor.split(":");
	}

	private static String[] DividirEConquistar(String valor) {
		return valor.split(",");
	}

}