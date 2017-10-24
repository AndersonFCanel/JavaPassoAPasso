package h_JOptionPane_Exemplos;


import javax.swing.JOptionPane;

public class ExemploDeJanelas{
   public static void main( String args[]){
      String resposta; //Variável para ler o conteúdo da linha 14 do código (A ImputDialog somente le Strings).
      int vali;
      float valf;
      double vald;

//comando para armazenar(imput = inserir) o valor lido na String resposta.      
      resposta = JOptionPane.showInputDialog("Digite um inteiro:");
//comando responsável pela conversão do valor lido na string para inteiro, float ou double   
      vali = Integer.parseInt(resposta);
//comando para exibir(show = mostrar) valor lido na variável resposta      
      JOptionPane.showMessageDialog(null, "Você digitou "+ vali);
      
      resposta = JOptionPane.showInputDialog("Digite um real:");
      valf = Float.parseFloat(resposta);
      JOptionPane.showMessageDialog(null, "Você digitou " + valf);

      resposta = JOptionPane.showInputDialog("Digite um real:");
      vald = Double.parseDouble(resposta);
      JOptionPane.showMessageDialog(null, "Você digitou " + vald);

      JOptionPane.showMessageDialog(null, vali + " é um inteiro", "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
      JOptionPane.showMessageDialog(null, valf + " é um real", "Mensagem de informação", JOptionPane.INFORMATION_MESSAGE);
      JOptionPane.showMessageDialog(null, vald + " é um real", "Mensagem de aviso", JOptionPane.WARNING_MESSAGE);
      JOptionPane.showMessageDialog(null, "Este é o fim?", "Mensagem de questão", JOptionPane.QUESTION_MESSAGE);
   }
}
