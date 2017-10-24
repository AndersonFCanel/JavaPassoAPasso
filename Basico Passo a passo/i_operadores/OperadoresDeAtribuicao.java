package i_operadores;

/*Operadores de atribui��o em Java

 Se voc� j� sabe como funciona o: a = a + 1
J� parou pra pensar se existe e como funcionaria o: a = a * a ?

Vamos l�, seja a = 2
Quanto seria: a = a * a?
Pela l�gica, o 'a' receberia o produto de seus antigo valores, 2*2 = 4. Correto

Voc� j� estudou PG, progress�o geom�trica?
Esse seria um belo exemplo onde usar�amos essa atribui��o. Note que o valor era 'a', agora � 'a�'
E seu professor, que ficava mandando voc� calcular PA, PG...logo logo voc� programar o computador pra fazer isso para voc� atrav�s do bendito Java.
Usaremos atribui��o para fazer um aplicativo que calcula juros tamb�m.

Eu tenho um que, embora simples, � bem �til. Ele pergunta o tanto que vou botar no banco, o juros, o tanto de meses que vou deixar, e ele me informa o que vai render.
Ou eu digo o quanto que quero que renda e ele me diz os meses que devo deixar l�, para que renda o que eu preciso.

Sabendo programa��o, voc� vai fazer as coisas que voc� necessita. Esse foi meu exemplo.
Qual o seu? O que voc� precisa calcular todo dia?
Em que voc� perde tempo fazendo conta, perguntando pra algu�m ou pesquisando?
Ao t�rmino da se��o de Controle de Fluxo voc� j� ser� capaz de fazer uma gama enorme de aplicativos em Java para seu prop�sito.

Atalhos que salvam vidas
Voc� j� aprendeu que � bem melhor escrever a++ ao inv�s de a = a + 1
E em rela��o as outras atribui��es? N�o achou que ir�amos perder tempo escrevendo tanto assim n�? Claro, que n�o.
Veja s� os truques que s�o usados em Java, e em outras linguagens:

a = a + b, fazemos: a +=b
a = a - b, fazemos: a -=b
a = a * b, fazemos: a *=b
a = a / b, fazemos: a /=b
a = a % b, fazemos: a %=b

A l�gica � simples. Voc� sempre vai ver dois n�meros, x e y, por exemplo.
E um operador matem�tico, vamos chamar de []
E vai ver o sinal de igualdade, =, que � o sinal de atribui��o.

E vai ver a f�rmula: x [] = y
Isso sempre vai representar isso: x = x [] y

Ou seja, o primeiro n�mero, sempre vai receber a opera��o matem�tica [] de seu antigo valor com o n�mero y.

E para n�o perder o costume, um c�digo em Java para mostrar como � que se faz:
*/

public class OperadoresDeAtribuicao {
    public static void main(String[] args) {
        int a=1;
        int b=2;
        System.out.println("Valor inicial a = " + a);
        System.out.println("Valor inicial b = " + b);
        System.out.println("Fazendo a +=b");
        a +=b;
        System.out.println("Agora a = " + a);
        System.out.println();
        
        System.out.println("Fazendo a -=b");
        a -=b;
        System.out.println("Agora a = " + a);
        System.out.println("Fazendo a *=b");
        a *=b;
        System.out.println("Agora a = " + a);
        System.out.println("Fazendo a +=2 ");
        a +=2;
        System.out.println("Agora a = " + a);
        System.out.println();
        
        System.out.println("Fazendo a /=b");
        a /=b;
        System.out.println("Agora a = " + a);
        System.out.println();
    }

}