package l_arraysListCollectionsFrameworkArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class MetodosDaClasseArrayListExolicado {
	public static void main(String[] args) {
		//O que são ArrayList em Java
/*
		 O Java, por padrão, possui uma série de recursos prontos (APIs) para que possamos tratar de estrutura de dados, também chamados de coleções (collections).
		Podemos dizer que ArrayList é uma classe para coleções. Uma classe genérica (generic classes), para ser mais exato.

		Coleções mesmo, de qualquer tipo de 'coisa', desde que seja um objeto.

		Você pode criar seus objetos - através de uma classe - e agrupá-los através de ArrayList e realizar, nessa coleção, várias operações, como: adicionar e retirar elementos, ordená-los, procurar por um elemento específico, apagar um elemento específico, limpar o ArrayList dentre outras possibilidades.
*/

	/*	Como declarar e usar ArrayList em Java
		Importe:

	import java.util.ArrayList;
		Por ser um tipo diferente, sua sintaxe é um pouco diferente do que você já viu até então:

		ArrayList< Objeto > nomeDoArrayList = new ArrayList< Objeto >();

		No exemplo a seguir, vamos usar um ArrayList de String para trabalhar com o nome de várias Bandas de música:
		ArrayList<String> bandas = new ArrayList<String> ();


		Exemplo de uso do ArrayList
		Após declarar a ArrayList 'bandas' que armazenará Strings, vamos adicionar alguns nomes.
		Primeiro adicionamos a banda "Rush":
		bandas.add("Rush");
*/
	/*	Existe um método do ArrayList chamado 'toArray()' que coloca todos os elementos de um ArrayList em um Array.
		Ou seja: bandas.toArray() é um Array!

		Porém, já vimos que existe um método 'toString' da classe Arrays que retorna uma String com os elementos de um Array. Vamos usar esse método parar exibir todos os elementos do ArrayList, que transformamos em Array através do método 'toArray()':
		Arrays.toString( bandas.toArray() );

		Vamos adicionar a segunda banda, "Beatles" e imprimir, usando o mesmo método.
		Note que quando usamos 'add', sempre adicionamos o elemento pro fim da ArrayList.
		Confirme isso agora, vendo que a banda "Iron Maiden" ficará depois de "Beatles".

		Vamos pegar o primeiro elemento, o elemento '0', através do método 'get':
		bandas.get(0);

		Note que é a banda "Rush", pois ela foi a primeira a ser adicionada.

		Vamos adicionar o "Tiririca" na posição do "Rush", ou seja, na posição '0':
		bandas.add(0,"Tiririca");
		ou
		bandas.add( bandas.indexOf("Rush"), "Tiririca");

		Pois o método 'indexOf' retorna o índice em que ocorre "Rush".

		Para saber o tamanho que tem seu ArrayList, basta usar o método 'size()':
		bandas.size();

		Feito isso, rapidamente remova o "Tiririca", pois alguém pode ver.
		Para tal, use o método 'remove':
		bandas.remove("Tiririca");

		Ok. Não quer mais brincar de ArrayList? Remova tudo
		bandas.clear();
*/
		            ArrayList<String> bandas = new ArrayList<String> ();
		            
		            bandas.add("Rush");
		            System.out.print( "Adicionando a banda Rush: " );
		            System.out.println( Arrays.toString( bandas.toArray() ) );
		            
		            bandas.add("Beatles");
		            System.out.print( "Adicionando a banda Beatles: " );
		            System.out.println( Arrays.toString( bandas.toArray() ) );
		            
		            bandas.add("Iron Maiden");
		            System.out.print( "Adicionando a banda Iron Maiden: " );
		            System.out.println( Arrays.toString( bandas.toArray() ) );
		            
		            System.out.print( "Quem está na índice 0: " );
		            System.out.println( bandas.get(0) );
		            
		            System.out.print( "Adicionando Tiririca onde estava o Rush: " );
		            bandas.add( bandas.indexOf("Rush"), "Tiririca");
		            System.out.println( Arrays.toString( bandas.toArray() ) );
		            
		            System.out.print( "Número de elementos na lista: " );
		            System.out.println( bandas.size() );
		            
		            System.out.print( "Removendo o Tiririca: " );
		            bandas.remove("Tiririca");
		            System.out.println( Arrays.toString( bandas.toArray() ) );
		            
		            System.out.print( "Removendo tudo: " );
		            bandas.clear();
		            System.out.println( Arrays.toString( bandas.toArray() ) );
		        }

}		
/*
		Saída:
		Adicionando a banda Rush: [Rush]
		Adicionando a banda Beatles: [Rush, Beatles]
		Adicionando a banda Iron Maiden: [Rush, Beatles, Iron Maiden]
		Quem está na índice 0: Rush
		Adicionando Tiririca onde estava o Rush: [Tiririca, Rush, Beatles, Iron Maiden]
		Número de elementos na lista: 4
		Removendo o Tiririca: [Rush, Beatles, Iron Maiden]
		Removendo tudo: []

*/
	/*	Para saber mais métodos e mais opções de parâmetros/argumentos, consulte a documentação sobre ArrayList em Java, no site da Oracle:
		http://docs.oracle.com/javase/7/docs/api/java/util/ArrayList.html

		Se em vez de de Strings, quiser trabalhar com números, use as classes Wrappers:
		ArrayList<Integer>, ArrayList<Float>, ArrayList<Double>, ArrayList<Long> etc.

	*/	
		

