package p_lacosEstruturasDeRepeticao.DoWHILE;

import java.util.Scanner;

public class DoWhileExemplo {
	/*O laço do ... while: O laço que sempre acontece...pelo menos uma vez
	Veremos nesse artigo mais um importante laço em Java, o laço do...while, que sempre executa o código do laço pelo menos uma vez, independente da condição do while ser true ou false.


	 Um dos maiores problemas do laço while é que ele só é executado se a condição contida nele for true.
	Porém, muitas vezes, em nossos aplicativos Java, não podemos garantir que essa condição será sempre verdadeira ou queremos que o laço seja executado PELO MENOS UMA VEZ, e caso o usuário decida, o laço vai continuar ou não.

	Então, o diferencial do laço do while é que ele sempre executa, sempre inicia o laço.

	Como usar o laço DO WHILE em Java
	A sintaxe do laço do .. while em Java, é a seguinte

	do
	{
	 //esse código será executado pelo menos uma vez    
	} while( condição );

	Seu uso é bem simples e intuitivo, visto que o laço while nós já conhecemos.
	O 'do' do inglês quer dizer 'faça'.
	Ou seja, esse laço nos diz 'faça isso enquanto 'condição' for verdadeira'

	Exemplos de uso

	Um dos exemplos de uso é para exibir o menu. Ora, o menu tem que ser exibido pelo menos uma vez.
	Se depois, você quiser sair, é opção sua.
	Mas que ele tem que ser exibido ao menos uma vez, ele tem. E uma boa saída para fazer isso, em Java, é usar o laço do ... while.

	No exemplo a seguir, o menu é mostrado.
	Para parar de exibir o menu, basta digitar 0, que o boolean irá se tornar 'false' e o laço não mais se repetirá, pois a condição dentro do while será falsa.
	Caso a entrada do usuário seja qualquer outro número que não 0, a variável boolean continua 'true', como foi declarada e o laço continuará a rodar (ou seja, o menu continua a ser exibido).

	O trecho: System.out.printf("\n\n\n\n\n\n");
	É simplesmente para limpar a tela.
	Teste para ver:
*/



	    public static void main(String[] args) {
	        boolean continuar=true;
	        int opcao;
	        Scanner entrada = new Scanner(System.in);
	        do
	        {
	            System.out.println("\t\tMenu de opções do curso Java Progressivo:");
	            System.out.println("\t1. Ver o menu");
	            System.out.println("\t2. Ler o menu");
	            System.out.println("\t3. Repetir o menu");
	            System.out.println("\t4. Tudo de novo");
	            System.out.println("\t5. Não li, pode repetir?");
	            System.out.println("\t0. Sair");
	            
	            System.out.print("\nInsira sua opção: ");
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
	Embora este seja um exemplo simples, ele será a base para vários menus que iremos fazer em nosso Curso de Java.
	Por exemplo, como um sistema de cadastro de alunos e um esquema de caixa eletrônico.
*/

