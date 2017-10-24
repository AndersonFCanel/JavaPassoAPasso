package n_aClasseMathSeusMetodos.ClasseMath;
/*
Calculando logaritmos naturais em Java através da classe Math
Calcula logaritmos naturais (ou seja, de base 'e') através do método: log()
que recebe e retorna um double.
Por exemplo, um programa que mostra o logaritmo de natural de 10 e do número 'e':
*/
public class logaritmos {
    
    public static void main(String[] args){
        System.out.println("O logaritmo natural de 10 é = "+ Math.log(10) );
        System.out.println("O logaritmo natural de 'e' é = "+ Math.log( Math.E ) );
    }

}