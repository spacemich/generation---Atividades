package AtividadePraticaJava8;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		int num, soma=0;
		
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println("Digite um num: ");
			num = leia.nextInt();
					if (num > 0) {
						soma = (soma + num);
						
					}
	} while(num!=0);
		System.out.println("A somas dos números positivos é igual á: " + soma);
	}
}

//Escreva um algoritmo em Java, que leia números inteiros via teclado, 
//até que o número zero seja digitado. Ao final, mostre na tela a soma de todos os números digitados, 
//que sejam positivos. Veja o exemplo abaixo:
