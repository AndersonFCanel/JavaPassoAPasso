package Temperaturas;

/*
 21) Em uma cidade do interior, sabe-se que, de janeiro a abril de 1976 (121 dias), não
ocorreu temperatura inferior a 15ºC nem superior a 40ºC. As temperaturas verificadas
em cada dia estão disponíveis em uma unidade de entrada de dados.
Fazer um algoritmo em PORTUGOL que calcule e imprima:
- A menor temperatura ocorrida;
- A maior temperatura ocorrida;
- A temperatura média;
- O número de dias nos quais a temperatura foi inferior à temperatura média.
 */


import java.util.Scanner;

public class ExercicioVetor21Temperatura {
    
    public static void leitura(float[] temp){
        Scanner s = new Scanner(System.in);
        
        int i;
        
        for(i=0;i<temp.length;i++){
             System.out.println("Entre com a temperatura: ");  
             temp[i]=s.nextFloat();
        } 
    }
    
    public static float menor(float[] temp){
        int i;
        float min;
        min = temp[0];
        
        for (i=1;i<temp.length;i++){
            if(temp[i]<min) {
                min=temp[i];
            }   
        }
        return min;
    }

    
    
    public static float maior(float[] temp){
              int i;
        float max;
        max = temp[0];
        
        for (i=1;i<temp.length;i++){
            if(temp[i]>max) {
                max=temp[i];
            } 
        }
        return max;
    }    
    
    public static float media(float[] temp){
        int i;
        float soma;
        soma =0.0f;
       
        for (i=1;i<temp.length;i++) {
            soma= soma+temp[i];
        }
            return soma/temp.length;
    }
    
    public static int quantos(float[] temp, float val){
        int i, quant;
        quant=0;
        
        for(i=0;i<temp.length;i++) {
            if(temp[i]<val) {
                quant++;
            }
        }
        return quant;
    }
    public static void main(String[] args) {
        float[] temperatura;
        float resultado;
        int numeroDeDias;
        
        temperatura = new float[4];  //4 colocado para teste  valor correto é 121
        leitura(temperatura);
      
        resultado = menor(temperatura);
        System.out.println("Menor temperatura: "+resultado);
        
        resultado = maior(temperatura);
        System.out.println("Maior temperatura: "+resultado);
       
        resultado = media(temperatura);
        System.out.println("Média das temperatura: "+resultado);
   
        numeroDeDias = quantos(temperatura,resultado);
        System.out.println("Dias com temperatura menor que a média: "+numeroDeDias);
    }
    
}
