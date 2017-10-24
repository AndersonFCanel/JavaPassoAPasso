package j_arrays.MetodosDaClasseArray;

public class MetodosDaClasseArray {
	public static void main(String[] args) {
		/*Métodos da classe Arrays (Array class methods):
			Dependendo dos métodos, podemos usar inteiros, float, double, char, short, List, Object etc.
			Para saber exatamente se existe um método para aplicar no que você deseja usar, olhe a documentação da classe Arrays em:
			http://docs.oracle.com/javase/7/docs/api/java/util/Arrays.html
		*/
			
		/*Arrays.binarySearch:
			Serve para encontrar um elemento específico dentro do array. Retorna a posição no array (inteiro).
			Caso passe como argumento um array e um valor, a busca é feita em todo o array.
			Podemos também passar um intervalo de busca. Por exemplo, para procurar o elemento 'x', no Array 'vetor', a partir do elemento 'daqui' até o elemento 'ate_aqui', faça:
			Arrays.binarySearch( vetor, daqui, ate_aqui, x);
		*/

		/*Arrays.copyOf:
			Esse método copia um array e retorna outro. Esse que ele retorna é uma cópia do primeiro.
			Se receber dois argumentos - um array e um valor, esse array que você passa é aquele que você deseja copiar e o valor é o número de elementos que você deseja copiar (ou o número de elementos que você quer que seu novo array tenha. Caso deseje ter um array maior, esse método preenche com 0 ou nulls):
			novoArray[] = Arrays.copyOf( arrayOriginal, numero_de_elementos_a_serem_copiados);

			Você também pode especificar uma faixa de valores:
			novoArray[] = Arrays.copyOf( arrayOriginal, daqui, ate_aqui);
		*/

		/*Arrays.equals:
			Recebe dois arrays. Retorna true caso sejam iguais e false caso contrário.
		*/	
			
		/*Arrays.fill:
			Vai preencher os valores de um array com determinado valor.
			Caso deseje que todos os elementos de 'array' tenham o valor 'valor':
			Arrays.fill(array, valor);

			Para preencher só determinada faixa de valores:
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
