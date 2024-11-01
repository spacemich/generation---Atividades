package AtividadePraticaJava8;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		int idade = 0;
		int maioridade = 0;
		int menoridade = 0;

		Scanner leia = new Scanner(System.in);

		while (idade >= 0) {
			System.out.println("Digite sua idade");
			idade = leia.nextInt();

			if (idade < 21 && idade > 0 ) {
				menoridade++;

			} else if(idade>50)  {
				maioridade++;
			}
			
		}
		System.out.println("Total de idades maior idade: " + maioridade);
		System.out.println("Total de idades menor idade: " + menoridade);
	}
}

