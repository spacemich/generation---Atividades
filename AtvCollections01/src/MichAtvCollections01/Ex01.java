package MichAtvCollections01;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		ArrayList<String> cores = new ArrayList<String>();

		Scanner leia = new Scanner(System.in);

		for (int i = 1; i <= 5; i++) {
			System.out.println("Digite a " + i + "º cor: ");
			cores.add(leia.next());
			
		}
		System.out.println(cores); // printa as cores digitadas
		cores.sort(null); // Cores.sor com (Null) serve para organizar em ordem crescente

		System.out.println("#################### CORES ORDENADAS #################");
		
		for (String cor : cores) {
			System.out.println(cor);

		}

	}

}
