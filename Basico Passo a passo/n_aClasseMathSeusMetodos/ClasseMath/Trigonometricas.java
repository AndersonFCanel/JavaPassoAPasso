package n_aClasseMathSeusMetodos.ClasseMath;

/*
Calculando senos, cossenos, tangentes e outras funções trigonométricas em Java através da classe Math
As principais funções trigonométricas são seno, cosseno e tangente, e são calculadas através dos métodos:
Math.sin()
Math.cos()
Math.tan()

Que recebem e retornam valores do tipo double. Porém, os valores que estas funções recebem devem ser em RADIANOS!
*/
public class Trigonometricas {
    
    public static void main(String[] args){
        System.out.println("O seno de 90 é = "+ Math.sin( (Math.PI)/2 ) );
        System.out.println("O cosseno de 0 é = "+ Math.cos(0) );
        System.out.println("A tangente de 45 é= "+ Math.tan( (Math.PI)/4 ));
    }

}