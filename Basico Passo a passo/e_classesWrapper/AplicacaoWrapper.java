package e_classesWrapper;

//Onde utilizar classes wrappers?
/*No código da Listagem 8 mostramos a importância da utilização 
 * das classesWrappers no desenvolvimento de um sistema.
 */
//Listagem 8. Aplicação das classes Wrappers em um sistema.
import javax.swing.JOptionPane;
 
public class AplicacaoWrapper {
 
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome(JOptionPane.showInputDialog("Digite o nome do funcionário: "));
         
        //invocado as classes Wrappers para fazer a conversão, pois o argumento JOptionPane.showInputDialog é um objeto string
        //e para ser inserido nos outros tipos primitivos é necessário fazer a conversão
        funcionario.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do funcionário: ")));
        funcionario.setSalario(Float.parseFloat(JOptionPane.showInputDialog("Digite o salário do funcionário: ")));
         
        //exibição em tela dos dados digitados
        JOptionPane.showMessageDialog(null, "Funcionário: "+funcionario.getNome() + 
                                            "\n " +"Idade: "+funcionario.getIdade() +
                                            "\n " + "Salário: "+funcionario.getSalario(),
                "Detalhes Funcionário",JOptionPane.INFORMATION_MESSAGE);
         
        System.exit(0);
    }
}
 
class Funcionario{
    private String nome;
    private int idade;
    float salario;
     
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }   
}

