package Ex11;

public class Ex11Estrelas {
   public static void estrelas(int n) {
        int i;

        i = 1;
        while(i <= n)
        {
            System.out.print("*");
            i = i + 1;
        }
        System.out.println("");
        estrelas(n - 1);
    }

    public static void main(String[] args) {
        estrelas(5);
    }
}
