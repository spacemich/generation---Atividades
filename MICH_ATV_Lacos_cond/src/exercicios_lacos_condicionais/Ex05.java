package exercicios_lacos_condicionais;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		int codprod, qtd;
		double valor = 0, total;
		
		Scanner leia = new Scanner(System.in);

		System.out.println("# ## ### #### #########   ESCOLHA O PRODUTO   ########## #### ### ## #");
		System.out.println("\n Digite o código do produto: ");
		codprod = leia.nextInt();

		switch (codprod) {

		case 1:
			System.out.println("cachorro Quente");
			valor = 10.00;
			break;

		case 2:
			System.out.println("X-Salada");
			valor = 15.00;

			break;
		case 3:
			System.out.println("X-Bacon");
			valor = 18.00;
			break;

		case 4:
			System.out.println("Bauru ");
			valor = 12.00;
			break;

		case 5:
			System.out.println("Refrigerante");
			valor = 8.00;
			break;

		case 6:
			System.out.println("Suco de Laranja");
			valor = 13.00;
			break;

		default:
			System.out.println("Opção invalida!");
			return;

		}
		System.out.println();
		System.out.println("Digite a quantidade: ");
		qtd = leia.nextInt();
		
		total = qtd * valor;

		System.out.println("Produto " + codprod);
		System.out.printf("valor total: R$ %.2f%n", total);

	}

}
