package e_classesWrapper;

/*
 * Conversão em wrappers
 * Para fazer a conversão de tipos primitivos para classes wrapperssão 
 * usados os seguintes métodos:
 */

/*	xxxValue() – Esse tipo de método não contém argumentos e é utilizado 
	quando precisa realizar uma conversão do valor de um objeto wrapper 
	para um objeto primitivo.
*/
//Listagem 3. Exemplo de conversão xxxValue() - wrapper para tipo primitivo.

public class ConvertWrapper {
 
    public static void main(String[] args) {
        //cria um objeto wrapper
        Integer velocidade = new Integer(587);
         
        //converte a variável velocidade para tipo primitivo
        double total = velocidade.doubleValue();
        short total1 = velocidade.shortValue();
        byte total2 = velocidade.byteValue();
         
        Float pi = new Float(3.14f);
        int valorPi = pi.intValue();
         
        System.out.println("Valor de PI arredondado: "+valorPi);    
        System.out.println("Total: "+total);
 
    


//Saída do código da Listagem 3:
//Valor de PI arredondado: 3
//Total: 587.0
/*   parseXxx(String s) – Método do tipo primitivo usado para converter um 
 * objeto String para um tipo primitivo, sendo que retorna um primitivo 
 * nomeado.
*/
//Listagem 4. Conversão de uma String para o tipo primitivo.
    
    double soma = Double.parseDouble("685.65");
    System.out.println("Soma: "+soma);
    //Saída do código da Listagem 4:
    //Soma: 685.65
/*     valueOf(String s) – Método do tipo wrapper usado para converter um 
 * objeto String para um objeto wrapper, sendo que retorna um objeto wrapper
 * recém criado do tipo que chamou o método.
 */
//Listagem 5. Exemplo do método valueOf com a classe String.

    Integer idade = new Integer(39);
    String idadeString = String.valueOf(idade);
    String velocidade1 = new String("568.55");
    Double velocidadeDouble = Double.valueOf(velocidade1);
         
    System.out.println("Idade string: "+idadeString);
    System.out.println("Velocidade double: "+velocidadeDouble); 

/*    toString() – Retorna a representação de um objeto 
 * (tipo primitivo encapsulado).
 */
//Listagem 6: Exemplo da sobrescrição do método toString().

/*Classe Testadora
 
    Cliente cliente = new Cliente();
    cliente.setNome("Maria");
    cliente.setEndereco("Av. dos Mares, 321");
 
    System.out.println(cliente.toString());
 
//Classe Cliente
    @Override
	public String toString() {
    return "Nome: "+getNome() + "\nEndereço: "+getEndereco();
*/
  
    }
}
