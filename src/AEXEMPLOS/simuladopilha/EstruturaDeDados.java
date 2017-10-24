package AEXEMPLOS.simuladopilha;
import javax.swing.JOptionPane;
import java.io.*;
class EstruturaDeDados{
	public static void main(String[] args){
		Pilha baralho;
		Carta car;
		String resposta;
		int numero;
		String naipe;
		FileInputStream fi;
		FileOutputStream fo;
		ObjectInputStream oi;
		ObjectOutputStream oo;
		
		baralho = new Pilha();
		try{
			fi = new FileInputStream("c:\\aulas\\baralho.obj");
			oi = new ObjectInputStream(fi);
			baralho = (Pilha)oi.readObject();
			oi.close();
		}catch(Exception e){
			JOptionPane.showMessageDialog(null,"Error -"+e.toString());}
		
		resposta = JOptionPane.showInputDialog(null,"Numero:");
		numero = Integer.parseInt(resposta);
		naipe = JOptionPane.showInputDialog(null,"Naipe:");
		car = new Carta(numero,naipe);
		try{
			baralho.inserir(car);
		}catch(PilhaCheiaException e){
			JOptionPane.showMessageDialog(null,"Baralho Cheio!");}
		
		try{
			fo = new FileOutputStream("c:\\aulas\\baralho.obj");
			oo = new ObjectOutputStream(fo);
			oo.writeObject(baralho);
			oo.close();
		}catch(IOException e){
			JOptionPane.showMessageDialog(null,"Error - "+e.toString());}
		
		try{
			car = baralho.remover();
			JOptionPane.showMessageDialog(null,"Numero da carta: "
			+car.getNumero()+"\nNaipe: "+car.getNaipe());
		}catch(PilhaVaziaException e){
			JOptionPane.showMessageDialog(null,"Baralho Vazio!");}
	}
}