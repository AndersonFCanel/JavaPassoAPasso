package AEXEMPLOS.pilhaencadeada;
import java.io.*;
import javax.swing.JOptionPane;
class EstruturaDeDados{
	public static void main(String[] args){
		Pilha churrasco;
		Carne car;
		String resposta, tipo;
		boolean cozido;
		FileInputStream fi;
		FileOutputStream fo;
		ObjectInputStream oi;
		ObjectOutputStream oo;
		churrasco = new Pilha();
		try{
			fi = new FileInputStream("c:\\aulas\\churrasco.obj");
			oi = new ObjectInputStream(fi);
			churrasco=(Pilha)oi.readObject();
			oi.close();
		}catch(Exception e){
			JOptionPane.showMessageDialog(null,"Esta errado : - "+e.toString());
		}
		resposta = JOptionPane.showInputDialog(null,"Cozido: ");
		cozido = Boolean.parseBoolean(resposta);
		tipo = JOptionPane.showInputDialog(null,"Tipo: ");
		car = new Carne(cozido,tipo);
		churrasco.inserir(car);
		try{
			fo = new FileOutputStream("c:\\aulas\\churrasco.obj");
			oo = new ObjectOutputStream(fo);
			oo.writeObject(churrasco);
			oo.close();
		}catch(IOException e){
			JOptionPane.showMessageDialog(null,"Error - "+e.toString());
		}
		try{
			car = churrasco.remover();
			JOptionPane.showMessageDialog(null,"Cozido: "+car.getCozido()+"\nTipo: "+car.getTipo());
		}catch(PilhaVaziaException e){
			JOptionPane.showMessageDialog(null,"Churrasco Vazio!");
		}
	}
}