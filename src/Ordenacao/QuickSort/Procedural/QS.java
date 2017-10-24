
package Ordenacao.QuickSort.Procedural;

public class QS {
    static void qs(int[] vet, int ini, int fim){
        int aux;
        int i=ini;
        int j =fim;
        int pivo = vet[(ini+fim)/2];
        
        while(i<j){
            while(vet[i]<pivo){
                i++;
            }
            while(vet[j]>pivo){
                j--;
            }
            if(i<=j){
                aux=vet[i];
                vet[i]=vet[j];
                vet[j]=aux;
                i++;
                j--;
            }
        }
        //IFS RECURSIVOS
        if(j>ini){
            qs(vet,ini,j);
        }
        if(i<fim){
            qs(vet,i,fim);
        }
    }

    public static void main(String[] args) {
        int[] vetor = {45,55,0,-8,10,9};
        
       int inicio=1;
       int fim = 6;
       
       qs(vetor,inicio,fim);
       
       for(int cont=0;cont<vetor.length;cont++){
           System.out.println(cont+" - ");
       }
       
    }
}
