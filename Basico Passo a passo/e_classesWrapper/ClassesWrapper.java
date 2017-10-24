package e_classesWrapper;

public class ClassesWrapper {
	/*Os Wrapper são conhecidos na linguagem Java como classes especiais 
	 * que possuem métodos capazes de fazer conversões em variáveis 
	 * primitivas e também de encapsular tipos primitivos para serem 
	 * trabalhados como objetos, ou seja, é feita um embrulho de streams 
	 * que são fluxo de dados através de canais.
	 * Sendo assim, existe uma classe Wrapper para cada tipo primitivo
	 *  identificado pelo mesmo nome do tipo que possui e tendo a 
	 *  primeira letra maiúscula. Essa regra de declaração é aplicada a 
	 *  todos os tipos, exceto aos que sãochar classificados como Character
	 *   e boolean como Boolean.
	 *   Cada tipo wrapper numérico em Java são subclasses da superclasse 
	 *   abstrataNumber (Java.lang.Number) que consegue acessar todos os 
	 *   métodos values que são: doubleValue(), floatValue(), longValue(),
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
		
		//CONVERSÂO ESTÀTICA
		double d1 =Double.parseDouble("123.45");
		int i1 = Integer.parseInt("123");
		float f1 = Float.parseFloat("3.00F");
		
		//Convertendo de binário para decimal
		//("VALOR NA BASE DESEJADA", BASEDESEJADA(2,8,16))
		int i2 = Integer.valueOf("101010101111",2);
		System.out.println("O valor em decimal é: "+i2);
		
	}
}
