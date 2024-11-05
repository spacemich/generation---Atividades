package MichAtvCollections01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		ArrayList<Integer> valorint = new ArrayList<Integer>();

		Scanner leia = new Scanner(System.in);

		Collections.addAll(valorint, 2, 5, 1, 3, 4, 9, 7, 8, 10, 6); // Adiciona varias entrada de dados de uma vez
		// Collections.addAll(1º Null, 2º Null) 1º NUll minha variavel, 2º NUll é o dado
		// dentro da var

		System.out.println("Digite um número se ele esta dentro do ArrayList: ");
		int num = leia.nextInt();

		if (valorint.contains(num)) {
			System.out.println(valorint.indexOf(num));// printa a posição do valorint mostrando dentro
			// do indexoff(pega o que o usuario digitou e mostra o que a posição)
		} else {
			System.out.println(" Número não encontrado!");
		}

	}

}

//Escreva um programa Java para criar uma Collection ArrayList de Objetos da Classe Wrapper Integer, 
//inicializada com 10 valores inteiros. O programa deverá solicitar ao usuário, que ele digite via 
//teclado 1 número inteiro e caso ele seja encontrado no ArrayList, exiba na tela a posição deste
//número na Collection. Caso o número não seja encontrado, ele deverá exibir na tela a mensagem: O 
//número NN não foi encontrado!
