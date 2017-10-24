package n_aClasseMathSeusMetodos.ClasseMath;

/*
Exponencial e potenciação na classe Math
Para calcular valores do tipo: e^x
usamos o método: exp() , que recebe um double e retorna um double.

numero = Math.exp(argumento)

Para calcular qualquer tipo de potências, da forma: a^b
onde a e b são do tipo double, usamos o método pow() da classe Math

numero = Math.pow(a,b)

Veja:
*/

public class ExponencialPotenciacao {
    
    public static void main(String[] args){
        System.out.println("'e' elevado ao quadrado = "+ Math.exp(2));
        System.out.println("2 elevado ao cubo = " + Math.pow(2, 3));
    }

}

/*
Lembre-se que estes métodos retornam double.
Caso você tenha declarado um float e queira receber o resultado no sua variável float, use o cast.
Por exemplo, no caso dos nossos methods para o cálculo de IMC, o 'quadrado' retorna um float, então fazemos:
(float)Math.pow(altura,2);

Assim, o método Math.pow() irá retorna um float, ao invés do double.
Veja como ficariam os nossos métodos:
*/