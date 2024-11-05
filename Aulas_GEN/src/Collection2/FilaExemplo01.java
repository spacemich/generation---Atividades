package Collection2;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class FilaExemplo01 {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<String> ();
		//PARA CRIAR UMA FILA
		
		Collections.addAll(fila, "Gabriel","Priscila", "Kaue");
		//ADD NOMES A FILA
		
		System.out.println(fila);
		//CHAMA A FILA
		
		System.out.println("\nAdicionar novo elemento:" + fila.add("Geandro"));
		//ADICIONA UM NOVO ELEMENTO A FILA
		
		System.out.println(fila);
		//IMPRIME A FILA ATUALIZADA
		
		System.out.println("\nExibir o Primeiro Elemento da fila" + fila.peek());
		//EXIBI O PRIMEIRO ELEMENTO CRIADO DA FILA?
		
		System.out.println(fila);
		
		System.out.println("\nRemover Elemento"+ fila.remove());
		
		System.out.println(fila);
		// REMOVE O ULTIMO ELEMENTO DA FILA.
		
		
	}

}
