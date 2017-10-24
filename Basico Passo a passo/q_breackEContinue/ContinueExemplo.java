package q_breackEContinue;

public class ContinueExemplo {
	public static void main(String[] args) {
		
		for(int i = 0; i<10; i++) {
			if( i == 5) {
				System.out.println("O numero 5 será pulado graças ao CONTINUE");
				continue;//iteração atual
				//O continue somente funciona no laço mais interno, ou seja, caso houvessem dois for um dentro do outro somente o laço de dentro seria pulado.
			}
			System.out.println(i);
		}
	}
}
