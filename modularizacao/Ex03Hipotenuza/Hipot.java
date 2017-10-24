package Ex03Hipotenuza;

/*	Exercício 3) 
Crie uma função (um método em Java) de nome hipotenusa que possui 
dois parâmetros reais: cateto1 e cateto2. Essa função retorna o valor 
da hipotenusa (a hipotenusa é raiz quadrada da soma dos quadrados dos 
catetos). Faça também um módulo principal (método main) que leia dois 
valores, chame a função hipotenusa utilizando esses valores como 
parâmetros e mostre na tela o resultado dessa função.
*/

public class Hipot {
   
    public double hipotenusa(double cateto1, double cateto2) {
        
		double hipot;

        hipot = Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2);
        
		return hipot;
    }

}