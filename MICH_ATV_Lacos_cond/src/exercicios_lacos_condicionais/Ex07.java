package exercicios_lacos_condicionais;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float num;
		
		System.out.print("Digite um número: ");
		num = leia.nextFloat();
		
		System.out.println ("O número equivale a tabuada do " + num + " :");
		
		for (int count = 1; count <= 10; count++) {
			System.out.println(num + "x" + count + "=" + (num * count));
		}
		
	}
 
}