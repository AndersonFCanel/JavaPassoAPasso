package e_classesWrapper;

//Comparando variáveis primitivas com wrappers
/*Na linguagem Java a comparação entre variáveis primitivas, referências e 
 * objetos gera certa confusão, pois é necessário tomar cuidados entre o 
 * operador de igualdade (==) e o método equals.
 */
/*Quando existe a comparação apenas com tipos primitivos é utilizado o 
 * operador de igualdade (==) e se caso o trabalho for com classes wrappers
 *  é invocado o método equals, pois serve para comparação de objetos. 
 *  Porém, tem algumas restrições com a comparação de classes wrappers e 
 *  tipos primitivos descritas abaixo:
 */
/*Tipos primitivos não conseguem invocar o método equals;
Classes Wrappes não podem ser comparadas com o operador de igualdade (==);
*/
//Listagem 7. Comparação com tipos primitivos e classes wrappers.
public class ComparandoWrappers {
    public static void main(String[] args) {
        int num1 = 21;
        double num2 = 21.0;
         
        Double num3 = new Double(282.22);
        Integer num4 = new Integer(232);
         
        System.out.println(num1 == num2); //true
  //      System.out.println(num3 == num4); //erro de compilação
        System.out.println(num1 == num3); //false
        System.out.println(num4.equals(num2)); //false
    }
} 

