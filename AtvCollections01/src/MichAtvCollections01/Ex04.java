package MichAtvCollections01;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex04 {

	public static void main(String[] args) {

		Set<Integer> valorint = new HashSet<>();

		Scanner leia = new Scanner(System.in);
		int num = 0;
		boolean resposta = true;
		String continuar;

		Collections.addAll(valorint, 2, 5, 1, 3, 4, 9, 7, 8, 10, 6);

		while (resposta) {
			System.out.println("Digite um número: ");

			num = leia.nextInt();

			if (valorint.contains(num)) {
				System.out.println("Valor encontrado! <3 ");
			} else {
				System.out.println(" Nº " + num + "não encontrado! ");

			}
			System.out.println("\nDeseja testar mais um número? :3 \n Sim ou nao ");
			continuar = leia.next();

			if (continuar.equalsIgnoreCase("nao")) {
				System.out.println("Processo finalizado!");
				resposta = false;
			}
		}
	}
}
