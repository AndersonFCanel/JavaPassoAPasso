package Ex11VetorMod;

import java.util.Scanner;

class ExercicioVetor11Modu {
    static void lerVetor(double[] vetor) {
        Scanner s;
        int i;
        double val;

        s = new Scanner(System.in);
        for(i = 0; i < vetor.length; i++)
        {
            System.out.print("Digite um real: ");
            val = s.nextDouble();
            vetor[i] = val / 2;
        }
    }

    static void mostrarVetor(double[] vetor) {
        int i;

        for(i = 0; i < vetor.length; i++)
            System.out.print(vetor[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        double[] vet;

        vet = new double[10];
        lerVetor(vet);
        mostrarVetor(vet);
    }
}