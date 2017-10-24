package j_arrays.VetoresExercios;

public class Ex01DeUmA100 {
	public static void main(String[] args) {
		int[] vet;
		int i;

		vet = new int[51];
		vet[0] = 0;
		for (i = 1; i < vet.length; i++)
			vet[i] = vet[i - 1] + 1;
		System.out.print("vet = { ");
		for (i = 0; i < vet.length; i++)
			System.out.print(vet[i] + ", ");
		System.out.println("}");
	}
}