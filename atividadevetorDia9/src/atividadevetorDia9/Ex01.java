package atividadevetorDia9;

import java.util.Arrays;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		// criação de um vetor vazio
		int vetorInteiros[] = new int[10];

		for (int i = 0; i < vetorInteiros.length; i++) {
			System.out.println("Digite o " + (i+1) + "º número: ");
			vetorInteiros[i] = leia.nextInt();

		}

		for (int i = 0; i < vetorInteiros.length; i++) {
			System.out.println((i + 1) + "º Elemento: " + vetorInteiros[i]);

		}
		System.out.println("Tamanho do vetor: " + vetorInteiros.length);
		// chamou a array
		Arrays.sort(vetorInteiros);

		for (int i = 0; i < vetorInteiros.length; i++) {
			System.out.println((i + 1) + "º Elemento: " + vetorInteiros[i]);

		}
	}
}

//Dado um vetor contendo 10 números inteiros não ordenados e não repetidos, construa um algoritmo 
//que consiga pesquisar dados no vetor, onde o usuário irá digitar um número e o programa deve exibir
//na tela a posição deste número no vetor. Caso o número não seja encontrado, a mensagem: “Não foi 
//encontrado!” deve ser exibida na tela. Veja os exemplos abaixo:
