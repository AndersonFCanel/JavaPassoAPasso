package j_arrays;

import java.util.Random;

public class JogoDeCartasUsandoArrays{

	public static void main (String [] args){

		String [] faces = new String[]
				{"As", "2", "3", "4", "5", "6", "7", "8", "9", "10", 
						"Valete", "Dama", "Rei"};

		String [] nipes = new String[]
				{"Espadas", "Paus", "Copas", "Ouros"};

		////////////////////////// Determinando a carta
		System.out.println("ESCOLHA DETERMINADA "
				+ "A carta escolhida sera " + faces[8] + " de " + nipes[2]);

				////////////////////////// ESCOLHA ALEATORIA - RANDOM
				Random r = new Random();
				System.out.println("ESCOLHA ALEATORIA 01 ( �ndice = "
						+ r.nextInt(10) + " )"); //numero m�ximo - (entre 0 e 10)

				//////// escolha aleatoria de um indice
				int i = r.nextInt(faces.length);
				//////// usando o indice para escolher a face
				String face = faces[i];

				/////// fixando so o nipe
				System.out.println("ESCOLHA ALEATORIA 02 ( " + face + " de "
						+ nipes[0] + " )");

				int j = r.nextInt(nipes.length);
				String nipe = nipes[j];

				////// totalmente aleatorio
				System.out.println("ESCOLHA ALEATORIA 03 ( " + face + " de "
						+ nipe + " )");

	}

}