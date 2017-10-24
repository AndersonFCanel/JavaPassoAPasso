package n_aClasseMathSeusMetodos.ClasseMath;

import javax.swing.JOptionPane;

/*
Módulo, máximo, mínimo e arredondamento em Java através da classe Math
Para calcular o módulo de um número 'numero' usamos: Math.abs(numero)
Para calcular o valor mínimo de dois números 'num1' e 'num2', usamos: Math.min(num1,num2)
Para calcular o valor máximo de dois números 'num1' e 'num2', usamos: Math.max(num1,num2)

Para arredondar um número 'numero' para cima, usamos: Math.ceil(numero)
Para arredondar um número 'numero' para baixo, usamos: Math.floor(numero)

Estes métodos, assim como todos os outros, recebem e retornam double. Caso deseje receber a passar outro tipo, 
use cast conforme foi explicado no método pow().
*/
public class MaxMinAbs {
    public static void main(String[] args) {
        double numero= 65.46, num1=64,num2=5;
        
        JOptionPane.showMessageDialog(null,"Absoluto de "+numero+" é: "+Math.abs(numero));
         JOptionPane.showMessageDialog(null,"max "+Math.max(num1,num2));
        JOptionPane.showMessageDialog(null,"min "+Math.min(num1,num2));
                
            
                
    }
}