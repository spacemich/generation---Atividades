package AtividadePraticaJava8;

import java.util.Scanner;

public class EX01 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int num1, num2;
		System.out.println("Digite o 1º número : ");
		num1 = leia.nextInt();

		System.out.println("Digite o 2º número : ");
		num2 = leia.nextInt();

		if (num1 > num2) {
			System.out.println("intervalo invalido!");

		} else {
			for (int i = num1; i < num2; i++) {
				if (i % 3 == 0 && i % 5 == 0) {
					System.out.println(i + " é multiplo de 3 e 5");
					
				}

			}
		}

	}
}

//Escreva um algoritmo em Java, que leia 2 números inteiros via teclado, onde o primeiro número deve ser menor 
//do que o segundo número. Caso contrário, deve ser exibida uma mensagem na tela informando que o intervalo é inválido e sair do programa. 
//No intervalo informado, mostre na tela todes os números que são múltiplos de 3 e 5. Veja os exemplos abaixo 
//se num1 % 3 == 0