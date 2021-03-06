//package afd;
import java.util.*;
//https://pt.wikipedia.org/wiki/Aut%C3%B4mato_finito_determin%C3%ADstico

/*Definição Formal
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
 
//para IDE no android não será utilizado, caso queira utilizar crie o arquivo txt com so dados abaixo e descomente as linhas 52, 53 ,54, 57, 66, 67, 71, 72, 73
/*Conteúdo do arquivo entradaAutomato.txt 
a,b
e0,e1
e0,a=e0:e0,b=e1:e1,b=e1
e0
e0,e1
*/
//import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileReader;


//import javax.swing.JOptionPane;

//CODIGO ADAPTADO PARA AIDE FOR ANDROID
//OBS: PARA ACOMPANHAR O PROCESSAMENTO DO CODIGO VIA CONSOLE DESCOMENTE AS LINHAS DE SYSTEM.OUT
 class Main {

	
	public static void main(String[] args) {
		
		//File file = new File("C:\\Users\\seu_usuario_desktop\\desktop/entradaAutomato.txt"); // Arquivo de entrada está anexado
		//try{
			
			// Leitura e separação do arquivo
			
			//FileReader fr = new FileReader(file);
			//BufferedReader br = new BufferedReader(fr);//Objeto fr passado como parametro para o contrutor da classe BufferedReader
			//bufferedreader serve pra ler de entrada de dados, desde teclado, passando por arquivos e até sockets...
			System.out.println("ESTE CODIGO AO SER EXECUTADO DEVE SER ACOMPANHADO PASSO A PASSO JUNTO AO CODIGO!\n\n");
			System.out.println("ENTRADAS AUTOMATICAS DO PROGRAMA:\nAlfabeto: a,b \nEstados: e0,e1 \nFuncao de transicao: e0,a=e0:e0,b=e1:e1,b=e1 \nEstado inicial: e0 \nEstados finais: e0,e1\n\n\n");
			System.out.println("***************************************");
			Scanner s1 = new Scanner(System.in);
			
			String alfabeto = "a,b"; //br.readLine();//.readLine serve para Ler Strings digitadas. Leu a,b
			String estados = "e0,e1"; //br.readLine();//Leu e0,e1
			String funcaoPrograma = "e0,a=e0:e0,b=e1:e1,b=e1";// br.readLine();//Leu e0,a=e0:e0,b=e1:e1,b=e1
			String estadoInicial = "e0"; // br.readLine();//Leu e0
			String estadosFinais = "e0,e1"; //br.readLine();// Leu e0,e1
			
			String [] alf = DividirEConquistar(alfabeto); // Array alf recebe os caracteres separados a,b 
			System.out.println("O Valor do Array alf(que armazena alfabeto) é: "+ Arrays.toString(alf));
			
			String [] est = DividirEConquistar(estados); //Array est recebe os dois estados possiveis e0,e1
			System.out.println("O Valor do Array est(que armazena estados) é: "+ Arrays.toString(est));
			
			String [] estIn = DividirEConquistar(estadoInicial);//Array estIn recebe o estado  Inicial e0
			System.out.println("O Valor do Array estIn(que armazena estado Inicial) é: "+ Arrays.toString(estIn));
			
			String [] estFin = DividirEConquistar(estadosFinais);//Array estFin recebe os estados finais e0,e1
			System.out.println("O Valor do Array estFin(que armazena estados finais) é: "+ Arrays.toString(estFin)+"\n\n");
			
			String [] funcaoPro = DivideTransicao(funcaoPrograma);
			/*Array funcaoPro recebe as funcoes de transisao e0,a=e0:e0,b=e1:e1,b=e1, as divide e coloca as em posisoes 
			*do vetor funcaoPro, essa divisao ocorre sempre que ":" aparecer na funcao de transicao EX: |"a=e0"| -:- |"e0,b=e1"| -:- |"e1"|
			*o exemplo anterior representa as posicoes do vetor. 
			*/
			//Caso queira saber o tamanho ou o conteúdo do Array funcaoPro DESCOMENTE as linhas abaixo
			System.out.println("O tamanho do Array funcaoPro(que armazena fun trans dividida, qts funcs existem) é: "+funcaoPro.length);
			System.out.println("O Valor do Array funcaoPro(que armazena fun trans dividida) é: "+ Arrays.toString(funcaoPro)+"\n\n");
		
			//Arrays para armazenarem os estados
			String [] ED = new String[funcaoPro.length];//Estado de Destino -  o tamnho é definido pela quantidades de transicoes, o delta
			System.out.println("O tamanho do Array ED(estado de destino)=qtd de transicoes, é: "+ funcaoPro.length +" - Seus valores inicialmente são: "+Arrays.toString(ED));
			
			String [] EP = new String[funcaoPro.length];//Estado de Partida -  o tamnho é definido pela quantidades de transicoes, o delta
			System.out.println("O tamanho do Array EP(Estado de Partida)=qtd de transicoes, é: "+ funcaoPro.length +" - Seus valores inicialmente são: "+Arrays.toString(EP));
			
			String [] EA = new String[funcaoPro.length];//Estado de Alfabetos -  o tamnho é definido pela quantidades de transicoes, o delta
			System.out.println("O Valor do Array EA(Estado de Alfabetos)=qtd de transicoes, é: "+ funcaoPro.length +" - Seus valores inicialmente são: "+Arrays.toString(EA) +"\n\n");
			System.out.println("********************************************");
			System.out.println("TRANSICOES DE ESTADO::::\n\n");
			//LAÇOS PARA TRATAR OS ESTADOS DE DESTINO, PARTIDA E ALFABETOS QUE ESTÃO CONTIDOS NA STRING funcaoPro
			for(int i = 0;i<funcaoPro.length;i++){
				String[] p1 = funcaoPro[i].split("=");
				System.out.println("Os valores do Array p1 sao: "+ Arrays.toString(p1));
				
				ED[i] = p1[1];
				System.out.println("Os valores do Array ED["+i+"] são: "+ ED[i]);
				
				String[] p2 = p1[0].split(",");
				System.out.println("Os valores do Array p2 sao: "+ Arrays.toString(p2));
				
				EP[i] = p2[0];
				System.out.println("Os valor do Array EP["+i+"] sao: "+ EP[i]);
				
				EA[i] = p2[1];
				System.out.println("Os valores do Array EA["+i+"] sao: "+ EA[i]+"\n\n");
			}
			
			//Pegando entrada
			while(true){
				String EI = estadoInicial;//String EI recebe e0
				System.out.println("O Valor da String EI(Estado inicial) é: "+ EI);
				
				String palavra = null;//String para armazenar o dado da janela JOptionPane
				//palavra = JOptionPane.showInputDialog("Informações--- \n\n Alfabeto: {"+alfabeto+"}\nEstados: {"+estados+"} \n\nEntre com uma palavra: ");
				System.out.println("\n\n**********************************************");
				System.out.println("O alfabeto é: "+alfabeto+"\nOs estados: "+estados+"\nEntre com a palavra a se verificada: ");
				palavra = s1.next();
				System.out.println("**************************************************");
				
				//Metodo responsavel pela chegagem, recebe a String inserida pelo usuário(A palavra) e o alfabeto como parametros
				if(VerificaPalavra(palavra,alf)){
					boolean flag = false; //flag serve para controlar o if que determinara  em que condição a abertura das janelas "aceito" e "naõ pertence devem ocorrer.
					
					for(int x = 0 ; x <palavra.length() ; x++){ //para x =0 até x < que tamanho da palavra inserida na janela
						String l = ""+palavra.charAt(x); //String l recebe palavra vazia ""+ o caracter referente ao valor de   x no laco for.
						System.out.println("O Valor da String l é: "+ l);
						
						int monitora = 0; // monitora serve para acompanhar quantas ocorrencias o proximo laco tera.
						for(int y = 0 ; y <ED.length ; y++){
							if(l .equals(EA[y]) && EI .equals(EP[y])){ 
								/*Se o valor de l for igual ao de EA[y] e EI[y]*/
								System.out.println("O valor de EI é: "+EI);
								
								EI = ED[y];
								System.out.println("O valor de ED["+y+"] é: "+ED[y]);
								
								monitora++; 
								System.out.println("Monitora foi incrementado, seu novo valor é: "+monitora);
							}
						}
						if(monitora == 0){//Se nenhuma das vezes os if acima forem verdadeiros então
							flag = true;
							System.out.println("Monitora NÃO foi incrementado, seu  valor é: "+monitora);
							System.out.println("O valor de flag é : "+flag);
							break; // Interrompe o laco aqui mais interno qui.
						}
					}
					
					if(flag){/*Caso tenha sido atendida a condição do if anterior será impresso. variavel flag tera valor verdadeiro*/
						//JOptionPane.showMessageDialog(null,"Palavra não pertence ao alfabeto!\n\n");
						System.out.println("\nPalavra não pertence ao alfabeto!\n\n");
					}else{/*Caso não tenha sido atendida sera feita uma nova verificacao. */
						PalavraAceita(EI,estFin); // Verifica se o estado final pertence a um dos estados finais
					}
					
					
				}else{
					//JOptionPane.showMessageDialog(null,"Palavra não pertence ao alfabeto!\n\n");
					System.out.println("\nPalavra não pertence ao alfabeto!\n\n");
				}
				
			}
			
		//}catch(Exception e){//Caso aja uma exception
			//System.out.println("Erro:"+e); //Imprimir erro no console.
		//}

	}
//--------------------METODOS---------------------------
	
	//Metodo responsavel pela chegagem
	private static boolean VerificaPalavra(String palavra, String [] alf) { //RETORNO TRUE OU FALSE
		System.out.println("\n\n**********************************************");
		System.out.println("\n****Metodo verificador de palavras pertencentes ao alfabeto\n");
		int cont = 0;
		for(int x = 0 ; x < palavra.length(); x++){ //for é incrementado até o tamanho da palavra inserida pelo usuario
			String l = ""+palavra.charAt(x); //String l recebe cada caracter digitados e entre eles palavra vazia
			System.out.println("\nO valor da String l(Armazenador de caracteres da palavra inserida) é: "+l);
			for(int y = 0 ; y < alf.length ; y++){
				if(l .equals(alf[y])){//cada letra inserida na string digitada será lida e comparada com uma letra do alfabeto inserido
					System.out.println("\nO caracter foi encontrado no alfabeto: ");
					cont++; // cada vez que houver uma ocorrencia de igualdade cont será incrementado
					System.out.println("\nContador de palavras que pertencem ao alfabeto: "+cont);
				}
			}
		}
		System.out.println("\n****FIM DO Metodo verificador de palavras");
		System.out.println("\n\n**********************************************\n\n");
		
		if(cont == palavra.length()){ // caso o contador seja = ao tamanho da palavra isso significa que ela esta contida nesse alfabeto
			return true;
		}else{
			return false;
		}
		
	}

	//Metodo para definir se a palavra é aceita pelo automato segundo as regras de transicao
	private static void PalavraAceita(String EP, String[] estFin) {//Recebe EI como estado atual e estFim como os estados finais definidos pelo usuário
		System.out.println("\n\n**********************************************");
		System.out.println("\n****Inicio do medodo verificador de palavras do automato(Segundo as regras de transicao)\n\n");
		int x = 0;
		for(int i = 0 ; i < estFin.length ; i++){//for é incrementado até a quantidade de estados finais definidas
			if(EP .equals(estFin[i])){ //Se estado de partida(Estado inicial no momento) for igual ao estado final na posicao i x recebe valor 1
				x = 1;
			}
		}
		
		if(x == 1){
			//JOptionPane.showMessageDialog(null, "Palavra Aceita\n\n");
			System.out.println("\nPalavra Aceita\n\n");
		}else{
			//JOptionPane.showMessageDialog(null, "Palavra não foi aceita\n\n");
			System.out.println("\nPalavra não foi Aceita\n\n");
		}
		System.out.println("\n****FIM  do medodo verificador de palavras do automato(Segundo as regras de transicao)");
		System.out.println("\n\n**********************************************\n\n");
	}

	 
	 /*
	Split – O Split é usado para dividir uma string em pequenos pedaços.
	Para isso, seu método retorna um array de strings, contendo as respectivas partes,
	definidas de acordo com a string passada como parâmetro, que na verdade funciona como 
	o “agente” divisor da mesma.
	*/
	private static String[] DivideTransicao(String valor) {
		return valor.split(":");//Divide a String quando ocorrer ":"
	
	}

	private static String[] DividirEConquistar(String valor) {
		return valor.split(",");//Divide a String quando ocorrer ","
	}

}
