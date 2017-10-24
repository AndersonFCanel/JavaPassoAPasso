package h_JOptionPane_Exemplos.ExemplosJoptionPane;


/*
Input Dialog com lista de opções
Outra forma de caixa de diálogo de entrada de dados é a Input Dialog com lista de opções.

É o mesmo método showInputDialog, mas com mais argumentos, sendo um deles uma lista de objetos. Esta lista de objetos fará com que a caixa de diálogo venha com um combo box ao invés de um campo de texto.

Para criar um Input Dialog com um combo box devemos usar os seguintes argumentos na respectiva ordem:

De qual frame a caixa de diálogo é dependente, ou seja, qual a janela principal que chamou a caixa Input Dialog. Caso a caixa de diálogo não dependa de nenhum frame ou janela principal, basta utilizarmos o valor null para este argumento.
A mensagem que deve ser exibida ao usuário.
O título da caixa de texto.
Que tipo de mensagem é. O tipo de mensagem define qual o ícone será utilizado, podendo ser utilizados os números inteiros representados pelas constantes da mesma forma como foi mostrada anteriormente.
O quinto argumento é representado pelo objeto Icon, que é um ícone que podemos criar a partir de um jpg, gif, png, etc. O objeto Icon será comentado com mais detalhes nos próximos artigos.
O segredo do combo box está neste argumento. Aqui virá um array (vetor) de objetos que serão nossos valores pré-definidos.
O último argumento serve apenas para indicar qual elemento do array (vetor) deve vir selecionado no início. Caso não desejarmos que um ítem seja selecionado no início basta utilizarmos null.
O array (vetor) de objetos deve ser genérico, portanto, utilizamos a classe Object para criar este array.

O método showInputDialog com combo box se diferencia do showInputDialog com caixa de texto pelo seguinte fato: o que é retornado dessa vez não será uma string, mas um objeto. Isso faz sentido se percebermos que agora estamos escolhendo um item dentro de uma lista de objetos. Portanto, o que será retornado será um objeto dessa lista, não uma string como acontecia com o Input Dialog com caixa de texto.

Então, se quisermos utilizar o objeto genérico como algum outro tipo de dado, devemos antes fazer uma indução de tipo ou typecasting.

Vejamos o exemplo abaixo:
*/

import javax.swing.JOptionPane;
public class InputDialogComListaDeOpcoes {
        public static void main(String[] args) {

            Object[] opcoes = { "sim", "não" };

            Object resposta;
            do {

                resposta = JOptionPane.showInputDialog(null,"Deseja finalizar o programa?","Finalização",
                JOptionPane.PLAIN_MESSAGE,null,opcoes,"não");
            } while (resposta == null || resposta.equals("não"));

        }
}

