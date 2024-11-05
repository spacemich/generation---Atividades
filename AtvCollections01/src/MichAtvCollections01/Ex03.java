package MichAtvCollections01;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Ex03 {

	public static void main(String[] args) {

		Set<Integer> valores = new HashSet<>();
		Scanner leia = new Scanner(System.in);
		int num = 0;
		for (int i = 1; i <= 10; i++) {
			System.out.println("Digite o " + i + "º número: ");
			num = leia.nextInt();

			valores.add(num);

		}

		System.out.println("\nListar dados do set: ");
		
		Iterator<Integer> it = valores.iterator();
		
		while(it.hasNext()){//hasNex(Enquanto há um próximo ele trampa)
		System.out.println(it.next());
		}
	}

}

// Escreva um programa Java para criar uma Collection Set de Objetos da Classe
 // Wrapper Integer. O programa deverá solicitar ao usuário, que ele digite via
 //teclado 10 valores inteiros não repetidos adicione-os individualmente na
 // Collection Set. Em seguida, faça o que se pede: Mostre na tela todos os
 // elementos da Collection Set, utilizando a Classe Iterator. Veja o exemplo
 // abaixo:
 //O INTERATOR SERVE COMO FOR, MAS NO CASO GERALMENTE É USADO PARA UMA LISTA
 //PRONTA/
