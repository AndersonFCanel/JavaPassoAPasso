import java.util.Scanner;

public class ExercicioModularizacao8 {
    static int genma(int n) {
        if(n < 4)
            return -n;
        else
            if(n == 4)
                return - genma(4 - n);
            else
                return n + 11 * genma(n - 2);
    }

    public static void main(String[] args) {
        Scanner s;
        int valor, resultado;

        s = new Scanner(System.in);
        System.out.print("Digite um inteiro: ");
        valor = s.nextInt();
        resultado = genma(valor);
        System.out.println("O resultado é " + resultado);
    }
}
