package AEXEMPLOS.simuladofila;
import javax.swing.JOptionPane;
import java.io.*;
class EstruturaDeDados{
	public static void main(String[] args){
		Fila sacola;
		Fruta fru;
		String resposta;
		boolean fresco;
		int sementes;
		FileInputStream fi;
		FileOutputStream fo;
		ObjectInputStream oi;
		ObjectOutputStream oo;

		sacola = new Fila();
		try{
			fi = new FileInputStream("c:\\aulas\\sacola.obj");
			oi = new ObjectInputStream(fi);
			sacola = (Fila)oi.readObject();
			oi.close();
		}catch(Exception e){
			JOptionPane.showMessageDialog(null,"Error -"+e.toString());}
		
		resposta = JOptionPane.showInputDialog(null,"Frescura:");
		fresco = Boolean.parseBoolean(resposta);
		resposta = JOptionPane.showInputDialog(null,"QNT sementes:");
		sementes = Integer.parseInt(resposta);
		fru = new Fruta(fresco,sementes);
		try{
                        //JOptionPane.showMessageDialog(null,"oi");
			sacola.inserir(fru);
                        //JOptionPane.showMessageDialog(null,"tchau");
		}catch(FilaCheiaException e){
			JOptionPane.showMessageDialog(null,"Fila Cheio!");}
		
		try{
			fo = new FileOutputStream("c:\\aulas\\sacola.obj");
			oo = new ObjectOutputStream(fo);
			oo.writeObject(sacola);
			oo.close();
		}catch(IOException e){
			JOptionPane.showMessageDialog(null,"Error - "+e.toString());}
		
		try{
			fru = sacola.remover();
			JOptionPane.showMessageDialog(null,"Frescura: "
			+fru.getFresco()+"\nSementes: "+fru.getSementes());
		}catch(FilaVaziaException e){
			JOptionPane.showMessageDialog(null,"Fila Vazio!");}
	}
}





