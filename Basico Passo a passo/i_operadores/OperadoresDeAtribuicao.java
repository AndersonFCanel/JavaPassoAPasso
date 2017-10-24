package i_operadores;

/*Operadores de atribuição em Java

 Se você já sabe como funciona o: a = a + 1
Já parou pra pensar se existe e como funcionaria o: a = a * a ?

Vamos lá, seja a = 2
Quanto seria: a = a * a?
Pela lógica, o 'a' receberia o produto de seus antigo valores, 2*2 = 4. Correto

Você já estudou PG, progressão geométrica?
Esse seria um belo exemplo onde usaríamos essa atribuição. Note que o valor era 'a', agora é 'a²'
E seu professor, que ficava mandando você calcular PA, PG...logo logo você programar o computador pra fazer isso para você através do bendito Java.
Usaremos atribuição para fazer um aplicativo que calcula juros também.

Eu tenho um que, embora simples, é bem útil. Ele pergunta o tanto que vou botar no banco, o juros, o tanto de meses que vou deixar, e ele me informa o que vai render.
Ou eu digo o quanto que quero que renda e ele me diz os meses que devo deixar lá, para que renda o que eu preciso.

Sabendo programação, você vai fazer as coisas que você necessita. Esse foi meu exemplo.
Qual o seu? O que você precisa calcular todo dia?
Em que você perde tempo fazendo conta, perguntando pra alguém ou pesquisando?
Ao término da seção de Controle de Fluxo você já será capaz de fazer uma gama enorme de aplicativos em Java para seu propósito.

Atalhos que salvam vidas
Você já aprendeu que é bem melhor escrever a++ ao invés de a = a + 1
E em relação as outras atribuições? Não achou que iríamos perder tempo escrevendo tanto assim né? Claro, que não.
Veja só os truques que são usados em Java, e em outras linguagens:

a = a + b, fazemos: a +=b
a = a - b, fazemos: a -=b
a = a * b, fazemos: a *=b
a = a / b, fazemos: a /=b
a = a % b, fazemos: a %=b

A lógica é simples. Você sempre vai ver dois números, x e y, por exemplo.
E um operador matemático, vamos chamar de []
E vai ver o sinal de igualdade, =, que é o sinal de atribuição.

E vai ver a fórmula: x [] = y
Isso sempre vai representar isso: x = x [] y

Ou seja, o primeiro número, sempre vai receber a operação matemática [] de seu antigo valor com o número y.

E para não perder o costume, um código em Java para mostrar como é que se faz:
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