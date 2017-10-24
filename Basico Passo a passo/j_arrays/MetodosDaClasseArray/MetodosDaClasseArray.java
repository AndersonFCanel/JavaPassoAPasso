package j_arrays.MetodosDaClasseArray;

public class MetodosDaClasseArray {
	public static void main(String[] args) {
		/*M�todos da classe Arrays (Array class methods):
			Dependendo dos m�todos, podemos usar inteiros, float, double, char, short, List, Object etc.
			Para saber exatamente se existe um m�todo para aplicar no que voc� deseja usar, olhe a documenta��o da classe Arrays em:
			http://docs.oracle.com/javase/7/docs/api/java/util/Arrays.html
		*/
			
		/*Arrays.binarySearch:
			Serve para encontrar um elemento espec�fico dentro do array. Retorna a posi��o no array (inteiro).
			Caso passe como argumento um array e um valor, a busca � feita em todo o array.
			Podemos tamb�m passar um intervalo de busca. Por exemplo, para procurar o elemento 'x', no Array 'vetor', a partir do elemento 'daqui' at� o elemento 'ate_aqui', fa�a:
			Arrays.binarySearch( vetor, daqui, ate_aqui, x);
		*/

		/*Arrays.copyOf:
			Esse m�todo copia um array e retorna outro. Esse que ele retorna � uma c�pia do primeiro.
			Se receber dois argumentos - um array e um valor, esse array que voc� passa � aquele que voc� deseja copiar e o valor � o n�mero de elementos que voc� deseja copiar (ou o n�mero de elementos que voc� quer que seu novo array tenha. Caso deseje ter um array maior, esse m�todo preenche com 0 ou nulls):
			novoArray[] = Arrays.copyOf( arrayOriginal, numero_de_elementos_a_serem_copiados);

			Voc� tamb�m pode especificar uma faixa de valores:
			novoArray[] = Arrays.copyOf( arrayOriginal, daqui, ate_aqui);
		*/

		/*Arrays.equals:
			Recebe dois arrays. Retorna true caso sejam iguais e false caso contr�rio.
		*/	
			
		/*Arrays.fill:
			Vai preencher os valores de um array com determinado valor.
			Caso deseje que todos os elementos de 'array' tenham o valor 'valor':
			Arrays.fill(array, valor);

			Para preencher s� determinada faixa de valores:
			Arrays.fill(array, daqui, ate_aqui, valor);
		*/
			
		/*Arrays.sort:
			Ordena os elementos em ordem crescente:
			Arrays.sort(array);

			Para ordenar uma faixa de valores:
			Arrays.sort(array, daqui, ate_aqui);
		*/

		/*Arrays.toString:
			Retorna todos os elementos de um array na forma de string:
			Arrays.toString(array);
		*/
	}
}
