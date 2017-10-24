package Ordenacao.QuickSort.POO;

public class QuickSort {
    //Algoritmo “ordenção por QuickSort” 
 public void quickSort(int[] vet,int ini,int fim){
    
    int i, j, pivo, aux,cont; 
    i=ini;
    j=fim;
    pivo = (ini+fim)/2;
    for(cont=0;i<vet.length;cont++){
        System.out.println(""+vet[cont]);
    }
    System.out.println("O valor do pivo é: "+ vet[pivo]+" posicao do vetor: "+pivo);
    
	while (i<=j){
            while(vet[i]<=vet[pivo]){
                  i++;
                 System.out.println("Teste loop 1>> Variável i incrementada, agora vale: "+i);
            }
            while(vet[j]>=vet[pivo]){
                 j--;
                System.out.println("Teste loop 2>> variavel j decrementada, agora vale:"+j); 
            }     
           
            if(i<=j){
		aux=vet[i];
		vet[i]=vet[j];
		vet[j]=aux;
              	 i++ ;
                 j--;
                 System.out.println("Entrou no if, Trocou "+vet[i]+" por "+vet[j]);
            }
 }		       
   //recursividade
     /*if(j>ini) {
         System.out.println("INICIO DA RECURSIVIDADE PRIMEIRO IF ");
          quickSort(vet,ini,j);
     }
     if(i<fim){
         System.out.println("INICIO DA RECURSIVIDADE SEGUNDO IF ");
          quickSort(vet,i,fim);
     }*/
 
  }
}
 


    

