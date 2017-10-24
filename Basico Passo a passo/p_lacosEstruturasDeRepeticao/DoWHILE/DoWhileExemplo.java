package p_lacosEstruturasDeRepeticao.DoWHILE;

import java.util.Scanner;

public class DoWhileExemplo {
	/*O la�o do ... while: O la�o que sempre acontece...pelo menos uma vez
	Veremos nesse artigo mais um importante la�o em Java, o la�o do...while, que sempre executa o c�digo do la�o pelo menos uma vez, independente da condi��o do while ser true ou false.


	 Um dos maiores problemas do la�o while � que ele s� � executado se a condi��o contida nele for true.
	Por�m, muitas vezes, em nossos aplicativos Java, n�o podemos garantir que essa condi��o ser� sempre verdadeira ou queremos que o la�o seja executado PELO MENOS UMA VEZ, e caso o usu�rio decida, o la�o vai continuar ou n�o.

	Ent�o, o diferencial do la�o do while � que ele sempre executa, sempre inicia o la�o.

	Como usar o la�o DO WHILE em Java
	A sintaxe do la�o do .. while em Java, � a seguinte

	do
	{
	 //esse c�digo ser� executado pelo menos uma vez    
	} while( condi��o );

	Seu uso � bem simples e intuitivo, visto que o la�o while n�s j� conhecemos.
	O 'do' do ingl�s quer dizer 'fa�a'.
	Ou seja, esse la�o nos diz 'fa�a isso enquanto 'condi��o' for verdadeira'

	Exemplos de uso

	Um dos exemplos de uso � para exibir o menu. Ora, o menu tem que ser exibido pelo menos uma vez.
	Se depois, voc� quiser sair, � op��o sua.
	Mas que ele tem que ser exibido ao menos uma vez, ele tem. E uma boa sa�da para fazer isso, em Java, � usar o la�o do ... while.

	No exemplo a seguir, o menu � mostrado.
	Para parar de exibir o menu, basta digitar 0, que o boolean ir� se tornar 'false' e o la�o n�o mais se repetir�, pois a condi��o dentro do while ser� falsa.
	Caso a entrada do usu�rio seja qualquer outro n�mero que n�o 0, a vari�vel boolean continua 'true', como foi declarada e o la�o continuar� a rodar (ou seja, o menu continua a ser exibido).

	O trecho: System.out.printf("\n\n\n\n\n\n");
	� simplesmente para limpar a tela.
	Teste para ver:
*/



	    public static void main(String[] args) {
	        boolean continuar=true;
	        int opcao;
	        Scanner entrada = new Scanner(System.in);
	        do
	        {
	            System.out.println("\t\tMenu de op��es do curso Java Progressivo:");
	            System.out.println("\t1. Ver o menu");
	            System.out.println("\t2. Ler o menu");
	            System.out.println("\t3. Repetir o menu");
	            System.out.println("\t4. Tudo de novo");
	            System.out.println("\t5. N�o li, pode repetir?");
	            System.out.println("\t0. Sair");
	            
	            System.out.print("\nInsira sua op��o: ");
	            opcao = entrada.nextInt();
	            
	            if(opcao == 0){
	                continuar = false;
	                System.out.println("Programa finalizado.");
	            }
	            else{
	                System.out.printf("\n\n\n\n\n\n");
	            }
	            
	        } while( continuar );
	    }

	}

/*
	Embora este seja um exemplo simples, ele ser� a base para v�rios menus que iremos fazer em nosso Curso de Java.
	Por exemplo, como um sistema de cadastro de alunos e um esquema de caixa eletr�nico.
*/

