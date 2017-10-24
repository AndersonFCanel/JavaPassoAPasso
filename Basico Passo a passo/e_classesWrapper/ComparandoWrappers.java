package e_classesWrapper;

//Comparando vari�veis primitivas com wrappers
/*Na linguagem Java a compara��o entre vari�veis primitivas, refer�ncias e 
 * objetos gera certa confus�o, pois � necess�rio tomar cuidados entre o 
 * operador de igualdade (==) e o m�todo equals.
 */
/*Quando existe a compara��o apenas com tipos primitivos � utilizado o 
 * operador de igualdade (==) e se caso o trabalho for com classes wrappers
 *  � invocado o m�todo equals, pois serve para compara��o de objetos. 
 *  Por�m, tem algumas restri��es com a compara��o de classes wrappers e 
 *  tipos primitivos descritas abaixo:
 */
/*Tipos primitivos n�o conseguem invocar o m�todo equals;
Classes Wrappes n�o podem ser comparadas com o operador de igualdade (==);
*/
//Listagem 7. Compara��o com tipos primitivos e classes wrappers.
public class ComparandoWrappers {
    public static void main(String[] args) {
        int num1 = 21;
        double num2 = 21.0;
         
        Double num3 = new Double(282.22);
        Integer num4 = new Integer(232);
         
        System.out.println(num1 == num2); //true
  //      System.out.println(num3 == num4); //erro de compila��o
        System.out.println(num1 == num3); //false
        System.out.println(num4.equals(num2)); //false
    }
} 

