package exercicios_lacos_condicionais;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		float num=0;
				
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		num = leia.nextFloat();

		
		if (num > 0) {
			System.out.printf("O número é positivo e ");
			} else 	{
			System.out.println("O número é negativo e ");
			}
			
			if (num % 2 == 0) {
				System.out.printf(" par.");
			} else {
				System.out.println (" impar. ");
			
					}
	}
}
