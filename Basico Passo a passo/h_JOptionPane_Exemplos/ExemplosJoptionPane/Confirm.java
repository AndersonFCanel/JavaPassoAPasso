package h_JOptionPane_Exemplos.ExemplosJoptionPane;

import javax.swing.JOptionPane;

public class Confirm {
    public static void main(String[] args) {
        
     String nome= null;
     nome = JOptionPane.showInputDialog("Qual seu nome?");
     JOptionPane.showConfirmDialog(null, "O seu nome é: "+nome+" ?");
    }    
}
