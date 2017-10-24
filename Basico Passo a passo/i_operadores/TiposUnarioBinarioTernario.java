package i_operadores;

public class TiposUnarioBinarioTernario {
	public static void main(String[] args) {
		/*Os operadores são divididos em 3 tipos em relação à quantidade 
		 * de operandos no qual operam: unário, binário e ternário.
*/
		int a = 5, b = 2, c = 0;
		a--;                   // -- é um operador unário pois opera apenas em a;
		c = a * b;             // * é um operador binário pois opera em a e b.
		c = c < 0 ? a : b;     // ?: é O operador ternário. Opera em na expressão booleana (c < 0), e em a ou b.
	}
}
