package q_rotulos;

public class Rotulos {
	public static void main(String[] args) {

		laco_um: //EIS UM ROTULO
			for(int j=0; j<=2; j++) {
				laco_dois: //OUTRO ROTULO
					for(int i = 0; i<10; i++) {
						if( i == 5) {
							break laco_um ;//iteração atual
						}
						System.out.println(i);
					}
			}

	laco_um: //EIS UM ROTULO
		for(int j=0; j<=2; j++) {
			laco_dois: //OUTRO ROTULO
				for(int i = 0; i<10; i++) {
					if( i == 5) {
						break laco_dois ;//iteração atual//somente será pausado o laço dois
					}
					System.out.println(i);
				}
		}
	}
}
