package Collection2;

import java.util.Iterator;
import java.util.Stack;

public class pilhaExemplo01 {

	public static void main(String[] args) {

		//Uma pilha é uma estrutura de dados do tipo LIFO
		//"O ULTIMO ELEMENTO INSERIDO NA PILHA É O PRIMEIRO
		//ELEMENTO QUE SERA RETIRADO DA PILHA".
		//"ULTIMO QUE ENTRA PRIMEIRO QUE SAI"
		
		Stack<String> pilha = new Stack<String>();
		 		
		pilha.push("Prato Verde");
		pilha.push("Prato Azul");
		pilha.push("Prato Branco");
		pilha.push("Prato Branco");
		pilha.push("Prato Amarelo");
		pilha.push("Prato Vermelho");

		System.out.println("\nElementos da Pilha: " + pilha);
		
		System.out.println("\nRetirar elemento: " + pilha.pop());
		
		System.out.println("\n Elementos da Pilha: " + pilha);
	
		pilha.push("Prato Roxo");
		
		System.out.println("\nElementos da Pilha: " + pilha);
		
		Iterator<String> iterator = pilha.iterator();
		
		while(iterator.hasNext()) {
			//percorre a informação
			System.out.println(iterator.next());
			//pega a informação
		}
	}

}
