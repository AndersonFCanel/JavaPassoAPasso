package Ex01VetorMod;

public class CriarEMostrarVetor{
    static void criarVetor(int[] v) {
        int i;

        v[0] = 0;
        for(i = 1; i < v.length; i++)
        	v[i] = v[i - 1] + 1;
    }

    static void mostrarVetor(int[] v) {
        int i;

        for(i = 0; i < v.length; i++)
            System.out.println(v[i]);
    }

    public static void main(String[] args) {
        int[] vet;
        vet = new int[51];
        
        criarVetor(vet);
        mostrarVetor(vet);
    }
}