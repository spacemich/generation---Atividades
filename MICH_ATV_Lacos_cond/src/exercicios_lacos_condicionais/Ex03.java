package exercicios_lacos_condicionais;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		String nome, doador;
		int idade;
		boolean doacao = false;

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite seu nome: ");
		nome = leia.nextLine();

		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();

		System.out.println("Ja doou sangue? : (sim ou não) ? ");
		doador = leia.next();

		switch (doador) {

		case "sim":
			doacao = true;
			break;

		case "não":
			doacao = false;
			break;

		default:
			System.out.println("Opção inválida!");
			return;
		}

		if ((idade >= 18 && idade <= 59) || (idade >= 60 && idade <= 69 && doacao)) {
			System.out.print(nome + " Está apto para doar Sangue!");
		} else {
			System.out.print(nome + " Não está apto(a) para doar Sangue!");
		}
	}
}
