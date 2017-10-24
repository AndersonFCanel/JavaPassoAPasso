package p_lacosEstruturasDeRepeticao.FOR;
/*	
Essa é uma modalidade de loop equivalente ao for ... each de outras linguagens.

Como você suspeitou, ele itera o array arrayDeStrings, pegando sequencialmente cada um de seus ítens e devolvendo em novaString, executando a parte interior do loop com o valor de cada ítem respectivamente.

Imagine a seguinte array de Strings:

String[] arrayDeStrings = { "Banana", "Maçã", "Pera" };
Com essa array, fazendo tanto assim:

// Sintaxe foreach
for (String novaString : arrayDeStrings) {
   System.out.println( novaString );
}
quanto assim:

// Sintaxe for com iterador
for (Iterator<String> i = arrayDeStrings.iterator(); i.hasNext(); ) {
   String novaString = i.next();
   System.out.println( novaString );
}
ou assim:

// Sintaxe for convencional
for(int i = 0; i < arrayDeStrings.length; i++) {
   System.out.println( arrayDeStrings[i] );
}
Você terá o resultado esperado:

Banana
Maçã
Pera

------------------------------------------------
Você usa um loop for em um ArrayList por vários motivos:
[list]quando deseja recuperar um objeto da lista por seu atributo.[/list][list]quando deseja percorrer todos os objetos e recuperar atributos.[/list][list]etc...[/list]

Exemplo 1

//recuperar um objeto da lista por seu atributo
public Cliente getClientePorCPF( String cpf ) {
for (Cliente cli : listaClientes) {   //no exemplo: listaClientes é um ArrayList <Cliente>, ou seja uma lista utilizando Generics
    if (cli.getCpf().equals(cpf))
         return cli;
}
}
Exemplo 2

//detectar objetos Pedidos onde estejam com pendência de entrega
public ArrayList getPedidosPendentes( ) {
ArrayList pedidosPendentes = new ArrayList();
for (int i = 0; i < listaPedidos.size(); i++) {   //listaPedidos é um ArrayList comum
    Pedido pedido = (Pedido) listaPedidos.get(i);
    if (pedido.isPendente() == true)
         pedidosPendentes.add(pedido);
}
return pedidosPendentes;
}

 * 
 * */
public class ForESuasFormas {

}
