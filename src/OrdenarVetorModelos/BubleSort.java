package OrdenarVetorModelos;


import java.util.Scanner;



public class BubleSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] numVet = new int[10];
        int aux,i,j;
        boolean controle = true; //variável responsável pelo corte do laçõ assim que estiver ordenado
        
        for(i=0;i<numVet.length;i++){
            System.out.println("Entre com um número posição "+(i+1)+": " );
            numVet[i]=s.nextInt();
        }
        for (i=0;i<numVet.length;i++){
            for(j=0;j<((numVet.length)-1);j++){
                if(numVet[j]>numVet[j+1]){
                    aux=numVet[j];
                    numVet[j]= numVet[j+1];
                    numVet[j+1]=aux;
                }    
            }
        }   
        if(controle)
            for(i=0;i<numVet.length;i++){
                System.out.println("Posição "+(i+1)+" = "+numVet[i]);
            }
    }
}
