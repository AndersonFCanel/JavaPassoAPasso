package l_arraysListCollectionsFrameworkArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class MetodosDaClasseArrayListExolicado {
	public static void main(String[] args) {
		//O que s�o ArrayList em Java
/*
		 O Java, por padr�o, possui uma s�rie de recursos prontos (APIs) para que possamos tratar de estrutura de dados, tamb�m chamados de cole��es (collections).
		Podemos dizer que ArrayList � uma classe para cole��es. Uma classe gen�rica (generic classes), para ser mais exato.

		Cole��es mesmo, de qualquer tipo de 'coisa', desde que seja um objeto.

		Voc� pode criar seus objetos - atrav�s de uma classe - e agrup�-los atrav�s de ArrayList e realizar, nessa cole��o, v�rias opera��es, como: adicionar e retirar elementos, orden�-los, procurar por um elemento espec�fico, apagar um elemento espec�fico, limpar o ArrayList dentre outras possibilidades.
*/

	/*	Como declarar e usar ArrayList em Java
		Importe:

	import java.util.ArrayList;
		Por ser um tipo diferente, sua sintaxe � um pouco diferente do que voc� j� viu at� ent�o:

		ArrayList< Objeto > nomeDoArrayList = new ArrayList< Objeto >();

		No exemplo a seguir, vamos usar um ArrayList de String para trabalhar com o nome de v�rias Bandas de m�sica:
		ArrayList<String> bandas = new ArrayList<String> ();


		Exemplo de uso do ArrayList
		Ap�s declarar a ArrayList 'bandas' que armazenar� Strings, vamos adicionar alguns nomes.
		Primeiro adicionamos a banda "Rush":
		bandas.add("Rush");
*/
	/*	Existe um m�todo do ArrayList chamado 'toArray()' que coloca todos os elementos de um ArrayList em um Array.
		Ou seja: bandas.toArray() � um Array!

		Por�m, j� vimos que existe um m�todo 'toString' da classe Arrays que retorna uma String com os elementos de um Array. Vamos usar esse m�todo parar exibir todos os elementos do ArrayList, que transformamos em Array atrav�s do m�todo 'toArray()':
		Arrays.toString( bandas.toArray() );

		Vamos adicionar a segunda banda, "Beatles" e imprimir, usando o mesmo m�todo.
		Note que quando usamos 'add', sempre adicionamos o elemento pro fim da ArrayList.
		Confirme isso agora, vendo que a banda "Iron Maiden" ficar� depois de "Beatles".

		Vamos pegar o primeiro elemento, o elemento '0', atrav�s do m�todo 'get':
		bandas.get(0);

		Note que � a banda "Rush", pois ela foi a primeira a ser adicionada.

		Vamos adicionar o "Tiririca" na posi��o do "Rush", ou seja, na posi��o '0':
		bandas.add(0,"Tiririca");
		ou
		bandas.add( bandas.indexOf("Rush"), "Tiririca");

		Pois o m�todo 'indexOf' retorna o �ndice em que ocorre "Rush".

		Para saber o tamanho que tem seu ArrayList, basta usar o m�todo 'size()':
		bandas.size();

		Feito isso, rapidamente remova o "Tiririca", pois algu�m pode ver.
		Para tal, use o m�todo 'remove':
		bandas.remove("Tiririca");

		Ok. N�o quer mais brincar de ArrayList? Remova tudo
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
		            
		            System.out.print( "Quem est� na �ndice 0: " );
		            System.out.println( bandas.get(0) );
		            
		            System.out.print( "Adicionando Tiririca onde estava o Rush: " );
		            bandas.add( bandas.indexOf("Rush"), "Tiririca");
		            System.out.println( Arrays.toString( bandas.toArray() ) );
		            
		            System.out.print( "N�mero de elementos na lista: " );
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
		Sa�da:
		Adicionando a banda Rush: [Rush]
		Adicionando a banda Beatles: [Rush, Beatles]
		Adicionando a banda Iron Maiden: [Rush, Beatles, Iron Maiden]
		Quem est� na �ndice 0: Rush
		Adicionando Tiririca onde estava o Rush: [Tiririca, Rush, Beatles, Iron Maiden]
		N�mero de elementos na lista: 4
		Removendo o Tiririca: [Rush, Beatles, Iron Maiden]
		Removendo tudo: []

*/
	/*	Para saber mais m�todos e mais op��es de par�metros/argumentos, consulte a documenta��o sobre ArrayList em Java, no site da Oracle:
		http://docs.oracle.com/javase/7/docs/api/java/util/ArrayList.html

		Se em vez de de Strings, quiser trabalhar com n�meros, use as classes Wrappers:
		ArrayList<Integer>, ArrayList<Float>, ArrayList<Double>, ArrayList<Long> etc.

	*/	
		

