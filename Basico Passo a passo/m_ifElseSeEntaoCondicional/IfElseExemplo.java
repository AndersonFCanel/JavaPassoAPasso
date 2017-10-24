package m_ifElseSeEntaoCondicional;


import java.io.Console;

import java.util.*;

public class IfElseExemplo {   


	public static void main(String[] args) {


		int codigo = 461012;

		String nome = "Mario Pereira Araujo";

		Boolean ativo = true;

		Double salario = 1556.0;


		System.out.format("O Conteudo de codigo é: %d%n", codigo);

		System.out.format("O Conteudo de nome é: %s%n", nome);

		System.out.format("O Conteudo de ativo é: %b%n", ativo);

		System.out.format("O Conteudo de ativo é: %4.2f%n", salario);

		System.out.println("\n Digite o valor do desconto : ");


		Scanner pergunta = new Scanner (System.in);


		String desconto = pergunta.nextLine();

		salario = salario - Double.parseDouble(desconto);

		System.out.format("Valor do salario liquido %4.2f\n", salario);


		if (salario >= 1000)

		{  System.out.println(nome+": emprestimo desabilitado"); }

		else

		{  System.out.println(nome+": emprestimo habilitado"); }


	}
}

