import java.util.*;

//import javax.swing.JOptionPane;

class Main {


	public static void main(String[] args) {


		Scanner s = new Scanner(System.in);
		
		System.out.println("AUTOMATO FINITO DETERMINISTICO\n\n");

//ENTRADA ALAFABETO
		String alfabeto = "a,m,o,r";//"a,b"; 
		System.out.println("Entre com o alfabeto Σ:\nCada caracter deve ser separado por virgula.\nEX: a,b,c,d,e");
		//alfabeto = s.nextLine();
		String [] alf = splitVirgula(alfabeto); // Array alf recebe os caracteres separados [a,b] 


//ENTRADA ESTADOS
		String estados = "e0,e1,e2,e3";
		System.out.println("\nEntre com o conjunto de estados Q:\nCada estado deve ser separado por virgula.\nEX: q0,q1,q2");
		//estados = s.nextLine();
		String [] est = splitVirgula(estados); //Array est recebe os dois estados possiveis e0,e1


//ENTRADA FUNCAO DE TRANSICAO  --->>>!!!CORRIGIR!!!
		String delta ,auxDelta = "e0,a;e1:e1,m;e2:e2,o;e3:e3,r;e3";//"e0,a;e0:e1,a;e1:e0,b;e1:e1,b;e1";
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
		//auxDelta.replaceAll("[^0-9]||[^,]||[^;]","");
		 
		String [] funcDelta = DivideTransicao(auxDelta);



//ENTRADA ESTADO INICIAL
		String estadoInicial = "e0"; 
		System.out.println("\nEntre com o estado inicial: ");
		//estadosInicial = s.nextLine();
		String [] estIn = splitVirgula(estadoInicial);//Array estIn recebe o estado  Inicial e0



//ENTRADA CONJUNTO DE ESTADOS FINAIS
		String estadosFinais = "e3";//"e0,e1";
		System.out.println("\nEntre com o conjunto dos estados finais:\nCada estado deve ser separado por virgula.\nEX: q0,q1,q2");
		String [] estFin = splitVirgula(estadosFinais);//Array estFin recebe os estados finais e0,e1
		//estadosFinais = s.nextLine();


//IMPRIMINDO ENTRADAS
		System.out.println("\n\n*************************************");
		System.out.println("\nIMPRIMINDO ENTRADAS DO AUTOMATO\n");
		System.out.println("O alfabeto: Σ \nOs estados: Q = {S1, S2...}\nAs transisaos: (δ : Q × Σ → Q)\nO  estIninicia: q0\nO conjunto dos estados finais: F\nM = (Q, Σ, δ, q0, F)");
		System.out.println("Σ  = "+ Arrays.toString(alf));
		System.out.println("Q  = "+ Arrays.toString(est));
		System.out.println("δ  = "+ Arrays.toString(funcDelta));		
		System.out.println("q0 = "+ Arrays.toString(estIn));
		System.out.println("F  = "+ Arrays.toString(estFin)+"\n");
		System.out.println("*************************************\n");
		

//----------------------------------------------------------------------
//TRATANDO OS DADOS INSERIDOS, COLOCANDO AS ENTRADAS DO USUARIO EM ARRAYS
		
		String [] EP = new String[funcDelta.length];//Estado de Partida -  o tamnho é definido pela quantidades de transicoes, o delta
		String [] EA = new String[funcDelta.length];//Caracter consumido -  o tamnho é definido pela quantidades de transicoes, o delta
		String [] ED = new String[funcDelta.length];//Estado de Destino -  o tamnho é definido pela quantidades de transicoes, o delta
		

//LACOS PARA TRATAR OS ESTADOS DE DESTINO, PARTIDA E ALFABETOS QUE ESTAO CONTIDOS NA STRING funcDelta
		
		for(int i = 0;i<funcDelta.length;i++){
			String[] p1 = funcDelta[i].split(";");
			System.out.println("A  transicao numero "+i+" e: "+ Arrays.toString(p1));

			ED[i] = p1[1];
		//	System.out.println("O estado de destino - ED["+i+"] e: "+ ED[i]);

			String[] p2 = p1[0].split(",");
		//	System.out.println("O Valor do Array p2 é: "+ Arrays.toString(p2));

			EP[i] = p2[0];
		//	System.out.println("O Valor do Array EP["+i+"] é: "+ EP[i]);

			EA[i] = p2[1];
		//	System.out.println("O Valor do Array EA["+i+"] é: "+ EA[i]+"\n\n");
		}
		
//----------------------------------------------------------------------
//IMPRIMINDO TABELA DE TRANCISAO DOS ESTADOS UTILIZADOS
		System.out.println("\n\n\tTABELA DE TRANSICAO DE ESTADOS");
		System.out.println("O estado de partida - EP é: "+ Arrays.toString(EP));
		System.out.println("O caracter consumido -EA é: "+ Arrays.toString(EA));
		System.out.println("O estado de destino - ED é: "+ Arrays.toString(ED)+"\n");
		System.out.println("*************************************\n\n");
		
		//IMPRIMINDO TABELA DE TRANSICAO DE ESTADOS COMPLETA    ----->>>!!!!IMPLEMENTAR!!!!!
		/*
		String[][] tabTran = new String[est.length][alf.length];
        for(int linha=0; linha < tabTran.length; linha++){
            for(int coluna=0; coluna < tabTran[0].length; coluna++){
                System.out.print(tabTran [linha] [coluna]+" ");
            }
        	System.out.println(" ");
        }
        
        for(int linha=0; linha < tabTran.length; linha++){
            for(int coluna=0; coluna < tabTran[0].length; coluna++){
                System.out.print(tabTran [linha] [coluna]+" ");
            }
        	System.out.println(" ");
        }
      System.out.println("\n\n");
		*/	
		
//----------------------------------------------------------------------
//INSERINDO A QUANTIDADE DE PALAVRAS A SEREM VERIFICADAS PELO AUTOMATO
	//	System.out.println("Quantas palavras deseja testar no automato? ");
	//	int qtdPalavras = s.nextInt
	//	for(int i=0 ; i <qtdPalavras ; i++){
		
		
		while(true){
			String EI = estadoInicial;
			System.out.println("O estado  inicial atual e: "+ EI);
//Entrada de dados - palavra
			String palavra = null;
			System.out.println("\n\n**********************************************");
			System.out.println("Entre com a palavra a ser verificada\nPARA SAIR DIGITE S ");
			palavra = s.next();
//FORÇAR SAIDA	
			if(palavra.equals("S")||palavra.equals("s")){
				System.out.println("**********************************************");
				break;
			}
			System.out.println("**********************************************");

//----------------------------------------------------------------------
		String simbolInvalid = null;
		
			if(VerificaPalavra(palavra,alf)){
				boolean flag = false; //flag serve para controlar o if que determinara  em que condicao a abertura das janelas "aceito" e "naÃµ pertence devem ocorrer.

				for(int x = 0 ; x <palavra.length() ; x++){ //para x =0 até x < que tamanho da palavra inserida na janela
					String l = ""+palavra.charAt(x); //String l recebe palavra vazia ""+ o caracter referente ao valor de   x no laco for.
					System.out.println("O Valor da String l é: "+ l);

					int monitora = 0; // monitora serve para acompanhar quantas ocorrencias o proximo laco tera.
					for(int y = 0 ; y <ED.length ; y++){
						if(l .equals(EA[y]) && EI .equals(EP[y])){ 
							/*Se o valor de l for igual ao de EA[y] e EI[y]*/
							System.out.println("o estado  inicial atual e: "+EI);

							EI = ED[y];
							System.out.println("O valor de ED["+y+"] é: "+ED[y]);
							
							monitora++; 
							System.out.println("Monitora foi incrementado, seu novo valor é: "+monitora);
						}
					}
					
					if(monitora == 0){
						flag = true;
						System.out.println("Monitora NÃƒO foi incrementado, seu  valor é: "+monitora);
						System.out.println("O valor de flag é : "+flag);
						break; 
					}
				}

				if(flag){
					System.out.println("\nPalavra não aceita pelo automato!\n\n");
				}else{
					PalavraAceita(EI,estFin); // Verifica se o estado final pertence a um dos estados finais
				}


			}else{
				//JOptionPane.showMessageDialog(null,"Palavra nao pode ser verificada pelo automato!\n\n");
				System.out.println("\nPalavra nao pode ser verificada pelo automato!\nSIMBOLO INEXISTENTE NO ALFABETO!!\n\n");
				System.out.println("SIMBOLO:   "+simbolInvalid);
			}

		}

	}
	
//}
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
