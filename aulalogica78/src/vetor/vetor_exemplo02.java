package vetor;

import java.util.Arrays;
import java.util.Scanner;

public class vetor_exemplo02 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		// criação de um vetor vazio
		int vetorInteiros[] = new int[5];

		for (int i = 0; i < vetorInteiros.length; i++) {
			System.out.println("Digite o " + (i + 1) + "º número: ");
			vetorInteiros[i] = leia.nextInt();

		}

		for (int i = 0; i < vetorInteiros.length; i++) {
			System.out.println((i + 1) + "º Elemento: " + vetorInteiros[i]);
			

	}
		System.out.println("Tamanho do vetor: " + vetorInteiros.length);
		//chamou a array 
		Arrays.sort(vetorInteiros);
		
		for (int i = 0; i < vetorInteiros.length; i++) {
			System.out.println((i + 1) + "º Elemento: " + vetorInteiros[i]);
			

}
}
}