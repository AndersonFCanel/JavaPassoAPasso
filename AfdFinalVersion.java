
import java.util.*;

class Main {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		linhaAst();
		System.out.println("AUTOMATO FINITO DETERMINISTICO - AFD");
		linhaAst();
		System.out.println("");

		//ENTRADA ALAFABETO
		String alfabeto = "a,m,o,r";//"a,b"; 
		//System.out.println("Entre com o alfabeto Σ:\nCada caracter deve ser separado por virgula.\nEX: a,b,c,d,e");
		//alfabeto = s.nextLine();
		String [] alf = splitVirgula(alfabeto); // Array alf recebe os caracteres separados [a,b] 

		//ENTRADA ESTADOS
		String estados = "e0,e1,e2,e3";
		//System.out.println("\nEntre com o conjunto de estados Q:\nCada estado deve ser separado por virgula.\nEX: q0,q1,q2");
		//estados = s.nextLine();
		String [] est = splitVirgula(estados); //Array est recebe os dois estados possiveis e0,e1

		//ENTRADA FUNCAO DE TRANSICAO  --->>>!!!CORRIGIR!!!
		String delta =null ;//,auxDelta = null; //"e0,a;e1:e1,m;e2:e2,o;e3:e3,r;e3";//"e0,a;e0:e1,a;e1:e0,b;e1:e1,b;e1";
		String [] funcDeltaAux = new String[alf.length*est.length];// = DivideTransicao(delta);
		
		int c=0, cont1=0;
					for1:
					for(c=0;c<(alf.length*est.length);c++) {
						System.out.println("\nEntre com as transições (δ : Q × Σ → Q):\nCada transicao deve ser separada por virgula e ponto e virgula.\nEX: \"q0,a;q0 : q0,b;q1 : q1,b;q1\"");
						delta = s.nextLine();
		
						if(delta.equals("s")) {
							break for1 ;
						}
						funcDeltaAux[c]=delta;
						cont++;
					}

					//String [] funcDelta = Arrays.copyOf(funcDeltaAux,funcDeltaAux.length);
					//String [] funcDelta = funcDeltaAux.clone();
					
					int [] b = new int[a.length];                //primeiro é preciso reservar espaço para b
					for (int i=0; i < a.length; i++) b[i]=a[i];  //agora podemos copiar
		
						//(3) exibe o conteúdo de "b" 
							for (int i=0; i < a.length; i++) {
							System.out.println("b[" + i + "]=" + b[i]);
							}
				
					
//----------------------------------------------------------------------

		//auxDelta.replaceAll("[^0-9]||[^,]||[^;]","");
		System.out.println("Aux Delta: "+delta);
		//String [] funcDelta = DivideTransicao(auxDelta);

		//ENTRADA ESTADO INICIAL
		String estadoInicial = "e0"; 
		//System.out.println("\nEntre com o estado inicial q0: ");
		//estadosInicial = s.nextLine();
		String [] estIn = splitVirgula(estadoInicial);//Array estIn recebe o estado  Inicial e0

		//ENTRADA CONJUNTO DE ESTADOS FINAIS
		String estadosFinais = "e3";//"e0,e1";
		//System.out.println("\nEntre com o conjunto dos estados finais F:\nCada estado deve ser separado por virgula.\nEX: q0,q1,q2");
		String [] estFin = splitVirgula(estadosFinais);//Array estFin recebe os estados finais e0,e1
		//estadosFinais = s.nextLine();


		//IMPRIMINDO ENTRADAS
		imprimirEntradas(alf, est, funcDelta, estIn, estFin);


		//----------------------------------------------------------------------
		//TRATANDO OS DADOS INSERIDOS, COLOCANDO AS ENTRADAS DO USUARIO EM ARRAYS
		//Estados de partida, caracter consumido e destino
		String [] estadoPartida = new String[funcDelta.length];
		String [] caracConsumido = new String[funcDelta.length];
		String [] estadoDestino = new String[funcDelta.length];

		//TRATANDO funcDelta
		for(int i = 0;i<funcDelta.length;i++){
			String[] p1 = funcDelta[i].split(";");
			String[] p2 = p1[0].split(",");
			estadoPartida[i] = p2[0];
			caracConsumido[i] = p2[1];
			estadoDestino[i] = p1[1];

			//IMRIMINDO 			
			System.out.println("O caracter da vez e: "+ caracConsumido[i]);
			System.out.println("A  transicao numero "+i+" e: "+ Arrays.toString(p1));
			System.out.println("O estado de partida: "+ estadoPartida[i]);
			System.out.println("Estado: "+p2[0]+" consome caracter :"+ p2[1]);
			System.out.println("O estado de destino: "+ estadoDestino[i]+"\n");
		}
		linhaAst();
		System.out.println("");
		//----------------------------------------------------------------------
		//IMPRIMINDO TABELA DE TRANSICAO DOS ESTADOS UTILIZADOS
		imprimeTabela(estadoPartida, caracConsumido, estadoDestino);

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

		while(true){
			String EI = estadoInicial;
			System.out.println("O estado atual: "+ EI);
			//ENTRADA DA PALAVRA
			String palavra = null;
			palavra= entrarPalavra();
			if(palavra.equals("S")||palavra.equals("s")){
				linhaAst();
				break;
			}
			linhaAst();


			//----------------------------------------------------------------------
			String simbolInvalid = null;

			if(VerificaPalavra(palavra,alf)){
				boolean flag = false; 
				for(int x = 0 ; x <palavra.length() ; x++){ 
					String caracPalavra = ""+palavra.charAt(x); 	
					int flag2 = 0;
					for(int y = 0 ; y <estadoDestino.length ; y++){
						if(caracPalavra.equals(caracConsumido[y]) && EI .equals(estadoPartida[y])){ 
							EI = estadoDestino[y];
							flag2++; 
						}
					}

					if(flag2 == 0){
						flag = true;
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
	//IMPRIME ENTRADAS
	private static void imprimirEntradas(String[] alf, String[] est, String[] funcDelta, String[] estIn, String[] estFin){
		System.out.println("\n\t*************************************");
		System.out.println("\tIMPRIMINDO ENTRADAS DO AUTOMATO\n");
		System.out.println("\tO alfabeto: Σ \n\tOs estados: Q = {S1, S2...}\n\tAs transicoes: (δ : Q × Σ → Q)\n\tO  estIninicia: q0\n\tO conjunto dos estados finais: F\n\tM = (Q, Σ, δ, q0, F)");
		System.out.println("\tΣ  = "+ Arrays.toString(alf));
		System.out.println("\tQ  = "+ Arrays.toString(est));
		System.out.println("\tδ  = "+ Arrays.toString(funcDelta));		
		System.out.println("\tq0 = "+ Arrays.toString(estIn));
		System.out.println("\tF  = "+ Arrays.toString(estFin)+"\n");
		System.out.println("\t*************************************");
	}

	//IMPRIME TABELA DE TRANSICAO ATUAL 
	private static void imprimeTabela(String[]estadoPartida, String[] caracConsumido, String[] estadoDestino){
		System.out.println("\n\t*************************************************");
		System.out.println("\tTABELA DE TRANSICAO DE ESTADOS UTILIZADOS");
		System.out.println("\tO estado de partida - estadoPartida: "+ Arrays.toString(estadoPartida));
		System.out.println("\tO caracter consumido -caracConsumido: "+ Arrays.toString(caracConsumido));
		System.out.println("\tO estado de destino - estadoDestino: "+ Arrays.toString(estadoDestino)+"\n");
		System.out.println("\t**************************************************\n\n");
	}

	//ENTRAR PALAVRA
	private static String entrarPalavra(){
		Scanner s = new Scanner(System.in);
		String palavra;
		System.out.println("\n\n**********************************************");
		System.out.println("Entre com a palavra a ser verificada pelo AFD:\nCASO QUEIRA SAIR, DIGITE S ou s ");
		palavra = s.next();
		//FORÇAR SAIDA	


		return palavra;
	}

	//IMPRIMIR LINHA COM ASTERISCOS
	private static void linhaAst(){
		System.out.println("**********************************************");
	}

	//VERIFICA PALAVRAS
	private static boolean VerificaPalavra(String palavra, String [] alf) {

		int cont = 0;
		for(int x = 0 ; x < palavra.length(); x++){
			String caracPalavra = ""+palavra.charAt(x);
			for(int y = 0 ; y < alf.length ; y++){
				if(caracPalavra.equals(alf[y])){
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
	

	//METODO PARA VERIFICAR A ACEITACAO DA PALAVRA PELO AUTOMATO
	private static void PalavraAceita(String estadoPartida, String[] estFin) {

		int x = 0;
		for(int i = 0 ; i < estFin.length ; i++){
			if(estadoPartida .equals(estFin[i])){
				x = 1;
			}
		}

		if(x == 1){
			//JOptionPane.showMessageDialog(null, "Palavra Aceita\n\n");
			System.out.println("\nPalavra Aceita pelo automato!!!\n\n");
		}else{
			//JOptionPane.showMessageDialog(null, "Palavra nÃ£o foi aceita\n\n");
			System.out.println("\nPalavra nao foi Aceita pelao automato!!!\n\n");
		}

	}



	//SPLITS
	private static String[] DivideTransicao(String valor) {
		return valor.split(":");//Divide a String quando ocorrer ":"

	}

	private static String[] splitVirgula(String valor) {
		return valor.split(",");//Divide a String quando ocorrer ","
	}

}
