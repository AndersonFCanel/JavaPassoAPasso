package e_classesWrapper;

public class ClassesWrapper {
	/*Os Wrapper s�o conhecidos na linguagem Java como classes especiais 
	 * que possuem m�todos capazes de fazer convers�es em vari�veis 
	 * primitivas e tamb�m de encapsular tipos primitivos para serem 
	 * trabalhados como objetos, ou seja, � feita um embrulho de streams 
	 * que s�o fluxo de dados atrav�s de canais.
	 * Sendo assim, existe uma classe Wrapper para cada tipo primitivo
	 *  identificado pelo mesmo nome do tipo que possui e tendo a 
	 *  primeira letra mai�scula. Essa regra de declara��o � aplicada a 
	 *  todos os tipos, exceto aos que s�ochar classificados como Character
	 *   e boolean como Boolean.
	 *   Cada tipo wrapper num�rico em Java s�o subclasses da superclasse 
	 *   abstrataNumber (Java.lang.Number) que consegue acessar todos os 
	 *   m�todos values que s�o: doubleValue(), floatValue(), longValue(),
	 *    intValue(), shortValue() e byteValue().
	 */
	public static void main(String[] args) {
		//criando um objeto utilizando a classe wrapper.
		Double preco = new Double("12.45");
		double d = preco.doubleValue();
		int i = preco.intValue();
		byte b = preco.byteValue();
		
		System.out.println("Valor double: "+d+"\nValor int: "
				+ ""+i+"\nValor byte: "+b);
		
		
		Boolean casado = new Boolean("true");
		
		//CONVERS�O EST�TICA
		double d1 =Double.parseDouble("123.45");
		int i1 = Integer.parseInt("123");
		float f1 = Float.parseFloat("3.00F");
		
		//Convertendo de bin�rio para decimal
		//("VALOR NA BASE DESEJADA", BASEDESEJADA(2,8,16))
		int i2 = Integer.valueOf("101010101111",2);
		System.out.println("O valor em decimal �: "+i2);
		
	}
}
