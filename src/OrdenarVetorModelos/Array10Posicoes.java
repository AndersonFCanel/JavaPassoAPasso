package OrdenarVetorModelos;

import java.util.Scanner;
public class Array10Posicoes
{
   public static void main (String args []){
       Scanner vet = new Scanner (System.in);
        int elementos[] = new int[10];
        for (int i=0; i<10; i++){
            System.out.printf ("Informe o numero %d:",i);
            elementos[i] = vet.nextInt();
        }
        
        ordena(elementos);
        exibir(elementos);
    }
   public static void ordena(int elementos[]){
        int cont1, cont2,aux;
            for(cont1 =0; cont1<10; cont1++){
                for(cont2 =0; cont2 <9; cont2++){
                   if(elementos[cont2]> elementos[cont2+1]){
                        aux = elementos[cont2];
                        elementos[cont2] = elementos[cont2+1];
                        elementos[cont2+1] = aux;
                    }
                }
            }            
   }
    public static void exibir(int elementos[]) {
       int i;
       System.out.println("");
        System.out.println("EXIBIÇÃO EM ORDEM CRESCENTE: ");
        for(i=0;i<elementos.length;i++){
            System.out.println(""+ elementos[i]); 
        }
        
        
    }
}