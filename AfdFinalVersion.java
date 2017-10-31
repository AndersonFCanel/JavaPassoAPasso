
import java.util.*;

//import javax.swing.JOptionPane;

class Main {


	public static void main(String[] args) {


		Scanner s = new Scanner(System.in);
		
		System.out.println("AUTOMATO FINITO DETERMINISTICO");

//ENTRADA ALAFABETO
		String alfabeto = "a,b"; 
		System.out.println("Entre com o alafabeto:\nCada caracter deve ser separado por virgula.\nEX: a,b,c,d,e");
		//alfabeto = s.nextLine();
		String [] alf = splitVirgula(alfabeto); // Array alf recebe os caracteres separados [a,b] 


//ENTRADA ESTADOS
		String estados = "e0,e1";
		System.out.println("\nEntre com os estados:\nCada estado deve ser separado por virgula.\nEX: q0,q1,q2");
		//estados = s.nextLine();
		String [] est = splitVirgula(estados); //Array est recebe os dois estados possiveis e0,e1


//ENTRADA FUNCAO DE TRANSICAO
		String delta ,auxDelta = "e0,a;e0:e1,a;e1:e0,b;e1:e1,b;e1";
		//String [] funcDelta = new String[alf.length*est.length];// = DivideTransicao(delta);
		//int c=0;

//		for1:
//		for(c=0;c<(alf.length*est.length);c++) {
//			System.out.println("\nEntre com as transições:\nCada transicao deve ser separado por virgula e ponto e virgula.\nEX: \"q0,a;q0 : q0,b;q1 : q1,b;q1\"");
//			delta = s.nextLine();
//
//			if(delta.equals("s")) {
//				break for1 ;
//			}
//			auxDelta=delta+":";
//			//funcDelta[c]=delta;
//		}
		
		String [] funcDelta = DivideTransicao(auxDelta);



//ENTRADA ESTADO INICIAL
		String estadoInicial = "e0"; 
		System.out.println("\nEntre com o estado inicial: ");
		//estadosInicial = s.nextLine();
		String [] estIn = splitVirgula(estadoInicial);//Array estIn recebe o estado  Inicial e0



//ENTRADA CONJUNTO DE ESTADOS FINAIS
		String estadosFinais = "e0,e1";
		System.out.println("\nEntre com o conjunto dos estados finais:\nCada estado deve ser separado por virgula.\nEX: q0,q1,q2");
		String [] estFin = splitVirgula(estadosFinais);//Array estFin recebe os estados finais e0,e1
		//estadosFinais = s.nextLine();


//IMPRIMINDO ENTRADAS
		System.out.println("*************************************");
		System.out.println("\n\nIMPRIMINDO ENTRADAS");
		System.out.println("O alfabeto: "+ Arrays.toString(alf));
		System.out.println("Os estados: "+ Arrays.toString(est));
		System.out.println("Os estados de transisao sao: "+ Arrays.toString(funcDelta)+"\n\n");		
		System.out.println("O  estIninicial é: "+ Arrays.toString(estIn));
		System.out.println("O  estFinal é: "+ Arrays.toString(estFin)+"\n\n");
		
		System.out.println("*************************************\n");
		

		//----------------------------------------------------------------------



//TRATANDO OS DADOS INSERIDOS, COLOCANDO AS ENTRADAS DO USUARIO EM ARRAYS
		String [] ED = new String[funcDelta.length];//Estado de Destino -  o tamnho é definido pela quantidades de transicoes, o delta
		String [] EP = new String[funcDelta.length];//Estado de Partida -  o tamnho é definido pela quantidades de transicoes, o delta
		String [] EA = new String[funcDelta.length];//Estado de Alfabetos -  o tamnho é definido pela quantidades de transicoes, o delta



		System.out.println("O estado de destino - ED é: "+ Arrays.toString(ED));
		System.out.println("O estado de partida - EP é: "+ Arrays.toString(EP));
		System.out.println("O estado anterior - EA é: "+ Arrays.toString(EA)+"\n\n");

//LACOS PARA TRATAR OS ESTADOS DE DESTINO, PARTIDA E ALFABETOS QUE ESTAO CONTIDOS NA STRING funcDelta
		
		for(int i = 0;i<funcDelta.length;i++){
			String[] p1 = funcDelta[i].split(";");
			System.out.println("A funcao de transicao o DELTA: "+ Arrays.toString(p1));

			ED[i] = p1[1];
			System.out.println("O estado de destino - ED["+i+"] e: "+ ED[i]);

			String[] p2 = p1[0].split(",");
			System.out.println("O Valor do Array p2 é: "+ Arrays.toString(p2));

			EP[i] = p2[0];
			System.out.println("O Valor do Array EP["+i+"] é: "+ EP[i]);

			EA[i] = p2[1];
			System.out.println("O Valor do Array EA["+i+"] é: "+ EA[i]+"\n\n");
		}

		System.out.println("O estado de destino - ED é: "+ Arrays.toString(ED));
		System.out.println("O estado de partida EP é: "+ Arrays.toString(EP));
		System.out.println("O estado anterior EA é: "+ Arrays.toString(EA)+"\n\n");

		//Pegando entrada
		while(true){
			String EI = estadoInicial;//String EI recebe e0
			System.out.println("O Valor da String EI é: "+ EI);

			String palavra = null;//String para armazenar o dado da janela JOptionPane
			//palavra = JOptionPane.showInputDialog("InformaÃ§Ãµes--- \n\n Alfabeto: {"+alfabeto+"}\nEstados: {"+estados+"} \n\nEntre com uma palavra: ");
			System.out.println("\n\n**********************************************");
			System.out.println("O alfabeto é: "+alfabeto+"\nOs estados: "+estados+"\nEntre com a palavra a se verificada: ");
			palavra = s.next();
			System.out.println("**********************************************");


			if(VerificaPalavra(palavra,alf)){
				boolean flag = false; //flag serve para controlar o if que determinara  em que condicao a abertura das janelas "aceito" e "naÃµ pertence devem ocorrer.

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
					if(monitora == 0){//Se nenhuma das vezes os if acima forem verdadeiros entÃ£o
						flag = true;
						System.out.println("Monitora NÃƒO foi incrementado, seu  valor é: "+monitora);
						System.out.println("O valor de flag é : "+flag);
						break; // Interrompe o laco aqui mais interno qui.
					}
				}

				if(flag){/*Caso tenha sido atendida a condicao do if anterior serÃ¡ impresso. variavel flag tera valor verdadeiro*/
					//JOptionPane.showMessageDialog(null,"Palavra nÃ£o pertence ao alfabeto!\n\n");
					System.out.println("\nPalavra nÃ£o pertence ao alfabeto!\n\n");
				}else{/*Caso nÃ£o tenha sido atendida sera feita uma nova verificacao. */
					PalavraAceita(EI,estFin); // Verifica se o estado final pertence a um dos estados finais
				}


			}else{
				//JOptionPane.showMessageDialog(null,"Palavra nÃ£o pertence ao alfabeto!\n\n");
				System.out.println("\nPalavra nÃ£o pertence ao alfabeto!\n\n");
			}

		}

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
			//JOptionPane.showMessageDialog(null, "Palavra Aceita\n\n");
			System.out.println("\nPalavra Aceita\n\n");
		}else{
			//JOptionPane.showMessageDialog(null, "Palavra nÃ£o foi aceita\n\n");
			System.out.println("\nPalavra nÃ£o foi Aceita\n\n");
		}

	}


	/*
	 Split â€“ O Split é usado para dividir uma string em pequenos pedaÃ§os.
	 Para isso, seu método retorna um array de strings, contendo as respectivas partes,
	 definidas de acordo com a string passada como parÃ¢metro, que na verdade funciona como 
	 o â€œagenteâ€� divisor da mesma.
	 */
	private static String[] DivideTransicao(String valor) {
		return valor.split(":");//Divide a String quando ocorrer ":"

	}

	private static String[] splitVirgula(String valor) {
		return valor.split(",");//Divide a String quando ocorrer ","
	}

}