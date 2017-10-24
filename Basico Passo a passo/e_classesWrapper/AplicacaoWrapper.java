package e_classesWrapper;

//Onde utilizar classes wrappers?
/*No c�digo da Listagem 8 mostramos a import�ncia da utiliza��o 
 * das classesWrappers no desenvolvimento de um sistema.
 */
//Listagem 8. Aplica��o das classes Wrappers em um sistema.
import javax.swing.JOptionPane;
 
public class AplicacaoWrapper {
 
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome(JOptionPane.showInputDialog("Digite o nome do funcion�rio: "));
         
        //invocado as classes Wrappers para fazer a convers�o, pois o argumento JOptionPane.showInputDialog � um objeto string
        //e para ser inserido nos outros tipos primitivos � necess�rio fazer a convers�o
        funcionario.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do funcion�rio: ")));
        funcionario.setSalario(Float.parseFloat(JOptionPane.showInputDialog("Digite o sal�rio do funcion�rio: ")));
         
        //exibi��o em tela dos dados digitados
        JOptionPane.showMessageDialog(null, "Funcion�rio: "+funcionario.getNome() + 
                                            "\n " +"Idade: "+funcionario.getIdade() +
                                            "\n " + "Sal�rio: "+funcionario.getSalario(),
                "Detalhes Funcion�rio",JOptionPane.INFORMATION_MESSAGE);
         
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

