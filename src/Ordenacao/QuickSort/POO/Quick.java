
package Ordenacao.QuickSort.POO;

public class Quick {
   public static void main(String[] args) {
        
   int[] vetNum ;
       vetNum = new int[6];
   int inicio, fina;

   vetNum[0]=28;
   vetNum[1]=22;
   vetNum[2]=27;
   vetNum[3]=42;
   vetNum[4]=46;
   vetNum[5]=24;
    
    inicio=0;
    fina =5;
    QuickSort quick=new QuickSort();
    quick.quickSort(vetNum,inicio,fina);

    
    
   } 
}
