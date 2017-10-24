package AEXEMPLOS.filaencadeada;
import javax.swing.JOptionPane;
import java.io.*;
class EstruturaDeDados{
    public static void main(String[] args){
	Fila estado;
	Cidade cid;
	String resposta;
	float territorio;
	int habitantes;
	FileOutputStream fo;
	FileInputStream fi;
	ObjectOutputStream oo;
	ObjectInputStream oi;
	estado = new Fila();
	try{
		fi = new FileInputStream("c:\\aulas\\estado.obj");
		oi = new ObjectInputStream(fi);
		estado = (Fila)oi.readObject();
		oi.close();
	}catch(Exception e){
		JOptionPane.showMessageDialog(null,"Error = "+e.toString());}
	resposta = JOptionPane.showInputDialog(null,"Territorio: ");
	territorio = Float.parseFloat(resposta);
	resposta = JOptionPane.showInputDialog(null,"Habitantes: ");
	habitantes = Integer.parseInt(resposta);
	cid = new Cidade(habitantes,territorio);
	estado.inserir(cid);
	try{
		fo = new FileOutputStream("c:\\aulas\\estado.obj");
		oo = new ObjectOutputStream(fo);
		oo.writeObject(estado);
		oo.close();
	}catch(Exception e){
		JOptionPane.showMessageDialog(null,"Error = "+e.toString());}
	try{
		cid = estado.remover();
		JOptionPane.showMessageDialog(null,"Habitantes: "+cid.getHabitantes()+"\nTerritorio: "+cid.getTerritorio());
	}catch(FilaVaziaException e){
		JOptionPane.showMessageDialog(null,"Estado Vazio! "+e.toString());
	}
	
	
}
}