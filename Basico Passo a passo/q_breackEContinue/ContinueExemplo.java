package q_breackEContinue;

public class ContinueExemplo {
	public static void main(String[] args) {
		
		for(int i = 0; i<10; i++) {
			if( i == 5) {
				System.out.println("O numero 5 ser� pulado gra�as ao CONTINUE");
				continue;//itera��o atual
				//O continue somente funciona no la�o mais interno, ou seja, caso houvessem dois for um dentro do outro somente o la�o de dentro seria pulado.
			}
			System.out.println(i);
		}
	}
}
