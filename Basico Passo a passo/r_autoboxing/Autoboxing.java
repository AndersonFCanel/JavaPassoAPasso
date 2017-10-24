package r_autoboxing;

public class Autoboxing {
	public static void main(String[] args) {
		
		//Forma mais antiga de se fazer:
		
		Integer x = new Integer(555);//empacotando
		int a = x.intValue();//desempacotar
		a++;
		x=new Integer(a);//reempacotar
		System.out.println(x.intValue());
		
		//Forma mais atual
		Integer y = 555;
		y++;//desenpacota, incrementa , reenpacota
		System.out.println(y);
		
		
	}
}
