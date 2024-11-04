package AtividadeVetores1e2;

import java.util.Scanner;

public class Ex01Vetor {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int num, valor = -1;
		int vetnum[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };

		System.out.println("Digite o número para identificar sua posição: ");
		num = leia.nextInt();

		for (int count = 0; count < vetnum.length; count++) {

			if (vetnum[count] == num) {
				valor = count;
			}
		}
		if (valor != -1) {

			System.out.println(" O Número " + num + " Se encontra na posição " + (valor) + "!");

		} else {

			System.out.println("Valor não encontrado");

		}
	}

}