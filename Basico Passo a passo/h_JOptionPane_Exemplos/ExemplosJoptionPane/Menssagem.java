package h_JOptionPane_Exemplos.ExemplosJoptionPane;


import javax.swing.JOptionPane;
public class Menssagem {
    public static void main(String[] args) {
        String nome = null;
        int resposta;
        nome = JOptionPane.showInputDialog("Qual seu nome? ");
        resposta = JOptionPane.showConfirmDialog(null, "O seu nome é ? "+nome);
        
        if(resposta==JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null,"O seu nome é: "+nome);
        }else
            {
            JOptionPane.showMessageDialog(null, "O seu nome não é: "+nome);
            }
    }
    
}
