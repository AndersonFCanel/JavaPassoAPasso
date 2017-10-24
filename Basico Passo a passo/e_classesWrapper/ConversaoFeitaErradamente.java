package e_classesWrapper;

public class ConversaoFeitaErradamente{
	
}
 class ExceWrap {
    public static void main(String[] args) {
      int z= Integer.parseInt("dois");
      System.out.println(z);
      /* codigo compila sem problemas mais uma excecao vai acontecer
       * nao há nada de errado na sintaxe
       * porem a jvm nao consegue converter uma string literal
       * em um numero inteiro
       */
   }
 }
   
 //Exception in thread "main" java.lang.NumberFormatException: For input string: "dois"
   
  //Por outro lado, a classe abaixo irá compilar e executar normalmente
  class Par {
    public static void main(String[] args) {
       //String - primitivo
       double d = Double.parseDouble("10");
       System.out.println(d);
    }
   }
   
  //A classe abaixo também apresentará erro
   
  class NoValue {
   public static void main(String[] args) {
      Long l = new Long(8);
  //    int lh = l.longValue();
      /* nao compila o to tentando colocar um long
       * dentro de um int nao é valido isso
       */
     }
   }
   
  //Esta funcionará normalmente
  class OfVal {
   public static void main(String[] args) {
      //String --> OBJETOS
      Float f = Float.valueOf("10");
      System.out.println(f);
      Integer i = new Integer(10);
      //Objeto --> Primitivo
      int g = i.intValue();
    }
   }
   
    //Veja um exemplo de teste de referência
   class WrpObjt {
      public static void main(String[] args) {
        Integer g = new Integer (10);
        Integer h = new Integer(10);
        System.out.println(g==h);//false
         /* aqui dois objetos diferentes
          * porem com mesmo valor
          * == testa a referencia e nao valores dos 
          * objetos */
        }
      }  

    /*Atente também que tipos primitivos não podem ser utilizados em 
 * Collections, só objetos. Sendo assim, a solução é usar Wrappers. 
 * E já que estamos no assunto de Wrappers, não poderíamos falar da 
 * novidade trazida pelo Java 5, o Autoboxing que será explicado na 
 * próxima seção.
 */