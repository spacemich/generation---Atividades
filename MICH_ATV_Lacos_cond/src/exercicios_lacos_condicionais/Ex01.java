package exercicios_lacos_condicionais;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		float a, b, c, valor;

		System.out.println("Digite o número a: ");
		a = leia.nextFloat();

		System.out.println("Digite o número b: ");
		b = leia.nextFloat();
		
		System.out.println("Digite o número: ");
		c = leia.nextFloat();
		
		valor = (a+b);
		
		if (valor > c) {
			System.out.printf("A soma de A + B é Maior que C" );
			
		}else if (valor == c) {
			System.out.printf("A soma de A + B é igual a C");
		}
									
		 else {
			System.out.println("A soma de A + B é menor do que C");
	
	
		}
		
		leia.close();
		
	
	}

}
