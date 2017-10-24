package Ordenacao.QuickSort.Procedural;
/*
Procedimento QUICKSORT(var A, INIVET, FIMVET)
I <-INIVET
J <-FIMVET
PIVO <-A[(INIVET + FIMVET) div 2]
enquanto I <= J faça
enquanto A[I] < PIVO faça
I <-I + 1
fim_enquanto
enquanto A[j] > PIVO faça
J <-J -1
fim_enquanto
se (I <= j) então
AUX <-A[I]
A[I] <-A[j]
A[j] <-AUX
I <-I + 1
J <-J -1
fim_se
fim_enquanto
se J > INIVET então
QUICKSORT(A, INIVET, J)
fim_se
se I < FIMVET então
QUICKSORT(A, I, FIMVET)
fim_se
fim_procedimento
*/
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class QuickSortProcedural
{   static int contador;

   static int contador(){
       contador++;
       return contador;
   }
    
    //PROCEDIMENTO QUICKSORT
	static void quickSort(int[] vet,int ini,int fim){
                System.out.println("INICIO DO PROCEDIMENTO QUICKSORT\n");
                System.out.println("Valor atual das variáveis e do vetor: ");
		int i, j, pivo, aux,cont; 
		i=ini;
		j=fim;
		pivo = vet[(ini + fim) / 2];
		System.out.println("i vale:"+i);
		System.out.println("j vale: "+j);
                //System.out.println("Pivo está na posicao :"+pivo+". Com valor:  "+vet[pivo]);
                System.out.println("O vetor atualmente: ");
           
		for(cont=0;cont<vet.length;cont++){
			System.out.printf(cont+ ")"+vet[cont]+" * \n");
		}
            System.out.println("\n");
		while (i<j){
			System.out.println("INICIO DO LACO WHILE i<j(LACO DE FORA) ");
                        while(vet[i]<pivo){
				i++;
				System.out.println("Teste loop 1>> Variável i incrementada, agora vale: "+i);
                         }
                        while(vet[j]>pivo){
                                j--;
                                System.out.println("Teste loop 2>> variavel j decrementada, agora vale:"+j); 
                        }     
                        System.out.println("\n");
                        if(i<=j){
                            System.out.println("Entrou no if");
                            System.out.println("AQUI vai trocar valor: "+vet[i]+" na posição: "+i+" por valor: "+vet[j]+" posição: "+j);
                            aux=vet[i];
                            vet[i]=vet[j];
                            vet[j]=aux;
                            System.out.println("Trocou, esta assim: "+vet[i]+" na posisao: "+i+ "por valor: "+vet[j]+" na posisao: "+j);
                            i++ ;
                            j--;
                            System.out.println("Fim do if i<=j, i e j mudam de valor i: "+i+" e j: "+j);
                             contador();           
                        }	
                        
			System.out.println("\n");
			System.out.println("I e J agora valem respectivamente: I = "+i+" J="+j);
                        System.out.println("Atualmente o vetor esta assim: ");
                        for(cont=0;cont<vet.length;cont++){
                                System.out.printf(cont+ ")"+vet[cont]+" * \n");
                         } 
                        System.out.println("Fim do laco maior(WHILE i<j).\n");
                }             
		//recursividade
		/**/if(j>ini) {
                        System.out.println("PRIMEIRO IF ");
                        System.out.println("i vale:"+i);
                        System.out.println("j vale: "+j);
                        System.out.println("pivo vale :"+pivo);
			System.out.println("RECURSIVIDADE DO PRIMEIRO IF: \n");
			quickSort(vet,ini,j);
                        System.out.println("TERMINOU PRIMEIRO IF(recursividade) \n");
                    }
                    System.out.println("\n");
                    if(i<fim){
                        System.out.println("SEGUNDO IF ");
                        System.out.println("i vale:"+i);
                        System.out.println("j vale: "+j);
                        System.out.println("pivo vale :"+pivo);
			System.out.println(" RECURSIVIDADE DO SEGUNDO IF: \n");
			quickSort(vet,i,fim);
                        System.out.println("TERMINOU SEGUNDO IF (recursividade)\n");
                    }/**/
                    System.out.println("\n");
                }   
        
        	

      //método imprimir.
        static void imprimir(int[] vet){
                System.out.println("Apresentação do vetor organizado: \n");
                int cont;
                System.out.println("POSIÇÃO:         VALOR DA POSIÇÃO:");
                for(cont=0;cont<vet.length;cont++)
			System.out.printf((cont+1)+ ")               "+vet[cont]+" * \n");
                System.out.println("");
        }
	//método main.
       
	public static void main(String[] args) {
            
              Scanner s = new Scanner(System.in);int TAMANHO;
               Random r =new Random();
              System.out.println("Quantos numeros ira digitar: ");
              TAMANHO=s.nextInt();
                
		int[] vetNum=new int[TAMANHO] ;
		int x = 0, inicio, fina;
           
		/*vetNum[0]=28;
		vetNum[1]=22;
		vetNum[2]=27;
		vetNum[3]=42;
		vetNum[4]=46;
		vetNum[5]=24;*/
                System.out.println("Entre com "+TAMANHO+" números: ");
                while(x<vetNum.length){
                    //vetNum[x]=s.nextInt();
                    vetNum[x]=r.nextInt(10000);
                    x++;
                }
                
		inicio=(TAMANHO-TAMANHO);
		fina =TAMANHO-1;
                quickSort(vetNum,inicio,fina);
                imprimir(vetNum);
                //JOptionPane.showMessageDialog(null,"Qtd de vezes que houve troca: "+QuickSortProcedural.contador());
                System.out.println("Qtd de vezes que houve troca: "+QuickSortProcedural.contador());
        }
	
	}

