package michAtv01;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		float nota01, nota02, nota03, nota04, mf;
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Digite a sua nota 1: ");
		nota01 = ler.nextFloat();
						
		System.out.println("Digite a sua nota 2: ");
		nota02 = ler.nextFloat();
		
		System.out.println("Digite a sua nota 3: ");
		nota03 = ler.nextFloat();
		
		System.out.println("Digite a sua nota 4: ");
		nota04 = ler.nextFloat();
		
		mf = (nota01+nota02+nota03+nota04)/4;
		System.out.println("Sua média é:  " + mf);
		
	}

}
