package afd;
//https://pt.wikipedia.org/wiki/Aut%C3%B4mato_finito_determin%C3%ADstico

/*Definição Formal[editar | editar código-fonte]
Um Autômato Finito Determinístico A é uma 5-tuple (ou quíntupla), (Q, Σ, δ, q0, F) consistindo de:
um conjunto finito de símbolos de entrada chamado Alfabeto (Σ)
um conjunto finito de estados (Q)
uma função de transição (δ : Q × Σ → Q)
um estado inicial (q0 ∈ Q) e
um conjunto de estados de aceitação (F ⊆ Q)
Seja w = a1a2 ... an uma cadeia de símbolos sobre o alfabeto Σ, O autômato M aceita a cadeia w se somente se existe uma 
sequência de estados, r0,r1, ..., rn, em Q com as seguintes condições:
r0 = q0
ri+1 = δ(ri, ai+1), para i = 0, ..., n−1
rn ∈ F.
Em outras palavras, a primeira condição afirma que a máquina se inicia no estado inicial q0. A segunda condição diz que, dado cada
símbolo da entrada w, a máquina transita de estado em estado de acordo com a função de transição δ. A terceira e última condição diz 
que a máquina aceita w se somente se o último símbolo da entrada leva o autômato a parar em um estado f tal que f ∈ F. Caso contrário, 
diz-se que a máquina rejeita a entrada. O conjunto de cadeias que M aceita é chamado Linguagem reconhecida por M e é simbolicamente 
representado por L(M).
Um autômato finito determinístico que não possui estado inicial ou estados de aceitação é conhecido como um Sistema de Transições ou
Semiautômato.
Para uma melhor compreensão introdutória à definição formal de autômatos, veja Teoria dos autômatos.
Utilizado para reconhecer uma sequencia de caracteres.
*/

/*AFD
Autômato Finito Determinístico - Código simples em JAVA IDE utilizado Eclipse Versão: Luna Service Release 1 (4.4.1)
O código exige que a entrada de teste seja feita da seguinte maneira:
Dividiremos nossa entrada em 5 partes, conforme descreve a notação formal de um Autômato Finito, ou seja, M = (Q, Σ, δ, q0, F),
onde temos:
(Q) = um conjunto finito de estados (Σ) = um conjunto finito de símbolos de entrada chamado Alfabeto (δ : Q × Σ → Q) = uma função
de transição (q0 ∈ Q) = um estado inicial (F ⊆ Q) = um conjunto de estados de aceitação ou conjunto de estados finais
//Explicando a entrada:
a,b --->>> (Σ) Alfabeto 
e0,e1 --->>> (Q) Conjunto de estados
e0,a=e0:e0,b=e1:e1,b=e1 --->>> δ Função transição
e0 --->>> q0 Estado Inicial
e0,e1 --->>> F Conjunto de estados Finais
 * 
 * */

/*Conteúdo do arquivo entradaAutomato.txt //para android não será utilizado
a,b
e0,e1
e0,a=e0:e0,b=e1:e1,b=e1
e0
e0,e1
*/
//import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileReader;
import java.utit.*;

//import javax.swing.JOptionPane;

//CODIGO ADAPTADO PARA AIDE FOR ANDROID
public class AFD {

	public static void main(String[] args) {
		
		//File file = new File("C:\\Users\\Anderson\\workspace\\JavaPassoAPasso\\AutomatoFinitoDeterministico\\src\\afd/entradaAutomato.txt"); // Arquivo de entrada está anexado
		//try{
			
			// Leitura e separação do arquivo
			
			//FileReader fr = new FileReader(file);
			//BufferedReader br = new BufferedReader(fr);//Objeto fr passado como parametro para o contrutor da classe BufferedReader
			//bufferedreader serve pra ler de entrada de dados, desde teclado, passando por arquivos e até sockets...
			Scanner s = new Scanner(System.in);
		
			String alfabeto = "a,b"; //br.readLine();//.readLine serve para Ler Strings digitadas. Leu a,b
			String estados = "e0,e1"; //br.readLine();//Leu e0,e1
			String funcaoPrograma = "e0,a=e0:e0,b=e1:e1,b=e1";// br.readLine();//Leu e0,a=e0:e0,b=e1:e1,b=e1
			String estadoInicial = "e0"; // br.readLine();//Leu e0
			String estadosFinais = "e0,e1"; //br.readLine();// Leu e0,e1
			
			String [] alf = DividirEConquistar(alfabeto); // Array alf recebe os caracteres separados a,b
			String [] est = DividirEConquistar(estados); //Array est recebe os dois estados possiveis e0,e1
			String [] estIn = DividirEConquistar(estadoInicial);//Array estIn recebe o estado  Inicial e0
			String [] estFin = DividirEConquistar(estadosFinais);//Array estFin recebe os estados finais e0,e1
			
			String [] funcaoPro = DivideTransicao(funcaoPrograma);//Array funcaoPro recebe as funcoes de transisoa e0,a=e0:e0,b=e1:e1,b=e1
			
			//Arrays para armazenarem os estados
			String [] ED = new String[funcaoPro.length];//Estado de Destino  
			String [] EP = new String[funcaoPro.length];//Estado de Partida
			String [] EA = new String[funcaoPro.length];//Estado de Alfabetos
			
			//LAÇOS PARA TRATAR OS ESTADOS DE DESTINO, PARTIDA E ALFABETOS QUE ESTÃO CONTIDOS NA STRING funcaoPro
			for(int i = 0;i<funcaoPro.length;i++){
				String[] p1 = funcaoPro[i].split("=");
				ED[i] = p1[1];
				String[] p2 = p1[0].split(",");
				EP[i] = p2[0];
				EA[i] = p2[1];
			}
			
			//Pegando entrada
			while(true){
				String EI = estadoInicial;//String EI recebe e0
				String palavra = null;//String para armazenar o dado da janela JOptionPane
				//palavra = JOptionPane.showInputDialog("Informações--- \n\n Alfabeto: {"+alfabeto+"}\nEstados: {"+estados+"} \n\nEntre com uma palavra: ");
				System.out.println("O alfabeto é: "+alfabeto+"\n O estados: "+estados+"\nEntre com a palavra a se verificada: ");
				palavra = s.next();
				
				if(VerificaPalavra(palavra,alf)){
					boolean flag = false; //flag serve para controlar  que determinarao em que condição a abertura das janelas aceito e naõ aceito deve ocorrer.
					
					for(int x = 0 ; x <palavra.length() ; x++){ //para x =0 até x < que tamanho da palavra inserida na janela
						String l = ""+palavra.charAt(x); //String l recebe palavra vazia ""+ o caracter referente ao valor de   x no laco for.
						int monitora = 0; // monitora serve para:   CONTINUAR A COMENTAR DAQUI,,, PAREI AQUI!!!
						for(int y = 0 ; y <ED.length ; y++){
							if(l .equals(EA[y]) && EI .equals(EP[y])){ /**/
								EI = ED[y];
								monitora++; 
							}
						}
						if(monitora == 0){//Se nenhuma das vezes os if acima for verdadeiro então
							flag = true;
							break; // Interrompe o laco aqui.
						}
					}
					
					if(flag){/*Caso tenha sido atendida a condição do if anterior será impresso*/
						//JOptionPane.showMessageDialog(null,"Palavra não pertence ao alfabeto!");
						System.out.println("Palavra não pertence ao alfabeto!");
					}else{/*Caso não tenha sido atendida sera feita uma nova verificacao. */
						PalavraAceita(EI,estFin); // Verifica se o estado final pertence a um dos estados finais
					}
					
					
				}else{
					//JOptionPane.showMessageDialog(null,"Palavra não pertence ao alfabeto!");
					System.out.println("Palavra não pertence ao alfabeto!");
				}
				
			}
			
		//}catch(Exception e){//Caso aja uma exception
			//System.out.println("Erro:"+e); //Imprimir erro no console.
		//}

	}
//--------------------METODOS---------------------------
	
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
			//JOptionPane.showMessageDialog(null, "Palavra Aceita");
			System.out.println("Palavra Aceita");
		}else{
			//JOptionPane.showMessageDialog(null, "Palavra não foi aceita");
			System.out.println("Palavra não foi Aceita");
		}
		
	}

	private static String[] DivideTransicao(String valor) {
		return valor.split(":");//Divide a String quando ocorrer ":"
	/*
	Split – O Split é usado para dividir uma string em pequenos pedaços.
	Para isso, seu método retorna um array de strings, contendo as respectivas partes,
	definidas de acordo com a string passada como parâmetro, que na verdade funciona como 
	o “agente” divisor da mesma.
	*/
	}

	private static String[] DividirEConquistar(String valor) {
		return valor.split(",");//Divide a String quando ocorrer ","
	}

}
