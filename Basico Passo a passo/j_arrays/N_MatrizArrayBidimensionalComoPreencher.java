package j_arrays;
/*
mat <- {{2.1, 3.4},
        {0.0, 1.2},
        {1.1, 3.9}}

mat é um array (ou matriz) bidimensional.
*/

public class N_MatrizArrayBidimensionalComoPreencher {
    public static void main(String[] args) {
        double[][] mat;

        mat = new double[3][2];
        mat[0][0] = 2.1;
        mat[0][1] = 3.4;
        mat[1][0] = 0.0;
        mat[1][1] = 1.2;
        mat[2][0] = 1.1;
        mat[2][1] = 3.9;
   
    //Outra forma:
        
        String[][] exemplo = {{"Ricardo","M","RJ"},{"Clesia","F","Bh"}};//Inserindo no primeiro e no segundo elemendp do array(Linha/Coluna)
        System.out.println(exemplo[0][0]);//linha 0 e coluna 0
        System.out.println(exemplo[1][0]);//linha 0 e coluna 1
        System.out.println(exemplo[0][0]+" /  "+ exemplo[0][2]);//linha 0 e coluna 0 e linha 0 e coluna 2
        System.out.println("A quantidade de dimençoes do array: "+ exemplo.length);
        System.out.println("A quantidade de elementos existentes dentro do array interno do array bidemencional: (Na linha 1): "+ exemplo[0].length);
        //O array bidimensional é um vetor de vetores
        System.out.println("A quantidade de elementos existentes dentro do array interno do array bidemencional: (Na linha 2): "+ exemplo[1].length);
        
    }
    
}

