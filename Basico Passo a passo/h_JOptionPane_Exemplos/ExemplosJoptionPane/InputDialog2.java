/*
Obter valor de showInputDialog
O método showInputDialog pode retornar dois valores: ou uma string ou null.

Se o botão OK for clicado a string contida na caixa de texto será retornada,
se o botão Cancel for clicado o valor null será retornado. 
Sabendo disso, podemos usar uma variável string para obter o valor e tratarmos 
da forma que quisermos. Vejamos o exemplo abaixo:
*/
package h_JOptionPane_Exemplos.ExemplosJoptionPane;


import javax.swing.JOptionPane;
public class InputDialog2 {
    public static void main(String[] args) {
     
        String nome = null;
        
        while (nome == null || nome.equals("")) {
            nome = JOptionPane.showInputDialog("Qual o seu nome?");
            if (nome == null || nome.equals("")) {
                JOptionPane.showMessageDialog(null,"Você não respondeu a pergunta.");
            }

        }
        
        JOptionPane.showMessageDialog(null, "Seu nome é " + nome+" ?");
    }
}
