Algoritmo processador de Autômatos Finitos Determinísticos
Daniel M. Maia - 2010
Trabalho apresentado na disciplina "Fundamentos Teóricos da Computação" no curso de Ciência da Computação da Universidade Fumec



Um   programa   capaz   de   simular  Autômatos Finitos Determinísticos feito em Java

    O programa deverá receber como parâmetros de LINHA DE COMANDO o caminho para dois arquivos, da seguinte forma:
        simulador arquivo1 arquivo2
    Onde, arquivo1 indica o caminho para o arquivo de descrição do autômato (conforme padrão a seguir) e arquivo2 indica o caminho para um arquivo que contem uma palavra por linha, que o programa deve informar se é reconhecida ou não pelo autômato definido pelo arquivo1.

    O padrão do arquivo segue o padrão do programa graphviz e contém a seguinte estrutura:
1. digraph D{
2. rankdir=LR;
3. start [shape=point];
4.      start > 0;
5.      0 > 0 [label=a];
6.      0 > 1 [label=b];
7.      1 > 0 [label=a];
8.      1 > 1 [label=b];
9.      0 [peripheries=2];
10. }

    As 3 primeiras linhas são ignoradas pelo algoritmo. A linha 4 define o estado inicial. As linhas 5 a 8 as transições dos estados. A linha 9 define o estado final. E a linha 10, o caractere } encerra a descrição do autômato.
    O arquivo de lista de palavras é um arquivo simples, onde cada linha corresponde a uma palavra. Não existe nenhuma outra informação no   arquivo. Linhas vazias devem ser interpretadas como a palavra vazia (λ). A seguir está um exemplo do conteúdo de um arquivo de lista de palavras com 2 palavras:
        abbaabbbbba
        bbababbb

    O programa tem como saída apenas a indicação se cada palavra do arquivo de lista de palavras é reconhecida ou não pelo AFD definido:
                aceita
        rejeita

Algoritmo

- Arquivo Ftc.java do pacote usr:

package usr;
import io.Io;
import java.io.IOException;
import java.util.Vector;
import model.Afd;
public class Ftc {
 /**
  * @param args <arquivo1> <arquivo2>
  */
 public static void main(String[] args) {
 Afd afd;
 Vector<String> words = new Vector<String>();
 switch(args.length){
 case 2: 
 try {
 afd = Io.readAFD(args[0]);
 words = Io.readWords(args[1]);
 for(String word : words)
 System.out.println(afd.verifyWordToString(word));
 } catch (IOException e) {
 System.out.println(e.getMessage());
 }
 break;
 default: System.out.println("Parâmetros não definidos. (Ftc <arquivo1> <arquivo2>).");
 }
 }
}


- Arquivo Afd.java do pacote model:

package model;
/**
 * Esta classe define cada AFD.
 * Atributos:
 *   start: estado inicial
 *   trans: lista de transições
 *   end  : lista de estados finais
 */
import java.util.Vector;
public class Afd {
 private int start;
 private Vector<Transition> trans = new Vector<Transition>();
 private Vector<Integer> end = new Vector<Integer>();
 public Afd(int start, Vector<Transition> trans, Vector<Integer> end) {
 this.start = start;
 this.trans = trans;
 this.end = end;
 }
 
 /**
  * Adiciona uma nova transição ao AFD
  * @param stateA estado partida
  * @param stateB estado chegada
  * @param label símbolo de transição
  */
 public void addTransition(int stateA, int stateB, char label){
 trans.add(new Transition(stateA, stateB, label));
 }
 
 /**
  * Adiciona um novo estado final ao AFD
  * @param end estado final
  */
 public void addEnd(int end){
 this.end.add(end);
 }
 
 public int getStart() {
 return start;
 }
 public void setStart(int start) {
 this.start = start;
 }
 public Vector<Transition> getTrans() {
 return trans;
 }
 public void setTrans(Vector<Transition> trans) {
 this.trans = trans;
 }
 public Vector<Integer> getEnd() {
 return end;
 }
 public void setEnd(Vector<Integer> end) {
 this.end = end;
 }
 
 public String toString(){
 String res = "Inicial: " + start;
 for(Transition objTrans : trans)
 res += "\n" + objTrans.toString();
 res += "\nFinal: ";
 for(int objEnd : end)
 res += objEnd + " ";
 return res;
 }
 
 public String verifyWordToString(String word){
 if(verifyWord(word))
 return "aceita";
 else
 return "rejeita";
 }
 
 public boolean verifyWord(String word){
 int e = start;
 char s;
 
 if(word.length()>0){
 for(int i = 0; i < word.length(); i ++){
 s = word.charAt(i);
 e = processTransition(e, s);
 }
 }
 if(end.contains(e))
 return true;
 else
 return false;
 }
 
 private int processTransition(int e, char s){
 int res = -1;
 for(Transition objTrans : trans)
 if(objTrans.getStateA() == e && objTrans.getLabel() == s)
 return objTrans.getStateB();
 return res;
 }
}


- Arquivo Transition.java do pacote model:

package model;

/**
 * Esta classe define cada transição.
 * Atributos:
 *   stateA: estado partida
 *   stateB: estado chegada
 *   label : símbolo de transição
 */
public class Transition {
 private int stateA;
 private int stateB;
 private char label;
 
 public Transition(int stateA, int stateB, char label) {
 super();
 this.stateA = stateA;
 this.stateB = stateB;
 this.label = label;
 }
 
 public int getStateA() {
 return stateA;
 }
 public void setStateA(int stateA) {
 this.stateA = stateA;
 }
 public int getStateB() {
 return stateB;
 }
 public void setStateB(int stateB) {
 this.stateB = stateB;
 }
 public char getLabel() {
 return label;
 }
 public void setLabel(char label) {
 this.label = label;
 }
 
 public String toString(){
 return stateA + " -> " + stateB + " [label=" + label + "]";
 }
 
}


- Arquivo Io.java do pacote io:

package io;
import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;
import model.Afd;
import model.Transition;

public class Io {

 /**
  * Realiza a leitura do arquivo que define o AFD.
  * @param filename nome do arquivo de entrada
  * @return AFD
  * @throws IOException
  */
 public static Afd readAFD(String filename) throws IOException{
 BufferedReader in = new BufferedReader(new FileReader(filename));
 String current = "";
 int start = -1;
 Vector<Transition> trans = new Vector<Transition>();
 Vector<Integer> end = new Vector<Integer>();
 
 for(int i = 0; i < 4; i ++)
 current = in.readLine();
 while(current.charAt(0)!='}'){
 current.trim();
 String elements[] = current.split("->");
 switch(elements.length){
 case 1: if(elements[0].contains("peripheries"))
 end.add(Integer.parseInt(""+elements[0].charAt(0)));
 break;
 case 2: if(elements[0].contains("start")){
 start = Integer.parseInt(""+elements[1].trim().charAt(0));
 }
 else if(elements[1].contains("label="))
 trans.add(new Transition(
 Integer.parseInt(""+elements[0].charAt(0)),
 Integer.parseInt(""+elements[1].trim().charAt(0)),
 elements[1].charAt(elements[1].indexOf("=")+1)));
 break;
 default: break;
 }
 current = in.readLine();
 }
 
 return new Afd(start, trans, end);
 }
 
 public static Vector<String> readWords(String filename) throws IOException{
 BufferedReader in = new BufferedReader(new FileReader(filename));
 Vector<String> res = new Vector<String>();
 String temp = in.readLine();
 try {
 while(temp !=null){
 res.add(temp);
 temp = in.readLine();
 }
 } catch (EOFException e) { }
 return res;
 }
 
}


Autômato para testes:
digraph D{
rankdir=LR
start [shape=point];
start -> 0;
0 -> 0 [label=0];
0 -> 1 [label=1];
1 -> 2 [label=0];
1 -> 3 [label=1];
2 -> 4 [label=0];
2 -> 5 [label=1];
3 -> 0 [label=0];
3 -> 1 [label=1];
4 -> 2 [label=0];
4 -> 3 [label=1];
5 -> 4 [label=0];
5 -> 5 [label=1];
0 [peripheries=2];
}



Palavras para teste do autômato acima:

1001

01001011

110



1100


Arquivos de saída do algoritmo:

rejeita
rejeita
aceita
aceita
aceita
