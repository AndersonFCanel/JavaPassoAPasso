package i_operadores;

public class TiposUnarioBinarioTernario {
	public static void main(String[] args) {
		/*Os operadores s�o divididos em 3 tipos em rela��o � quantidade 
		 * de operandos no qual operam: un�rio, bin�rio e tern�rio.
*/
		int a = 5, b = 2, c = 0;
		a--;                   // -- � um operador un�rio pois opera apenas em a;
		c = a * b;             // * � um operador bin�rio pois opera em a e b.
		c = c < 0 ? a : b;     // ?: � O operador tern�rio. Opera em na express�o booleana (c < 0), e em a ou b.
	}
}
