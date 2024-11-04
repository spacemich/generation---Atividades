package AtividadeVetores1e2;

import java.util.Scanner;

public class Ex02Vetor {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int num, count = 0, numvetor[] = new int[10];
		float media, soma = 0;
		String guardari = " ", guardarp = "";

		for (count = 0; count < numvetor.length; count++) {

			System.out.println(" Digite o " + (count + 1) + "º número: ");
			numvetor[count] = leia.nextInt();

		}
		for (count = 1; count < numvetor.length; count += 2) {
			guardari += numvetor[count];
		}

		for (count = 0; count < numvetor.length; count++) {

			if (numvetor[count] % 2 == 0) {
				guardarp += numvetor[count];
			}
		}
		for (count = 0; count < numvetor.length; count++) {

			soma = (soma + numvetor[count]);
		}
		media = (soma / 10);

		System.out.println("Elementos de índices ímpares:" + guardari);
		System.out.println("Elementos de índices pares: " + guardarp);
		System.out.println("Soma de todos os elementos: " + soma);
		System.out.println("Média dos elementos: " + media);
	}
}
