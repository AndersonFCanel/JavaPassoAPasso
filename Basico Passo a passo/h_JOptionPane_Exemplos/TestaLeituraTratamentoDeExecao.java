package h_JOptionPane_Exemplos;

import javax.swing.JOptionPane;

class TestaLeituraTratamentoDeExecao {
    public static void main(String[] args) {
    	
        int valor;
        boolean erro;
        String resposta;

        valor = 0;
        do {
            erro = false;
            resposta = JOptionPane.showInputDialog("Digite um inteiro");
           
//VERIFICAÇÃO DE ERROS
            try {      //TRATAMENTO DE EXEÇÃO
                valor = Integer.parseInt(resposta);
            } catch(Exception e) {
                JOptionPane.showMessageDialog(null,"Valor Incorreto!");
                erro = true; //coloca true na variável erro não permitindo a saída do laço;
            }
        } while(erro);
        JOptionPane.showMessageDialog(null,"Você digitou " + valor);
    }
}
