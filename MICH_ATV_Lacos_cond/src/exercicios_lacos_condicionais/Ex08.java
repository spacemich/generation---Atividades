package exercicios_lacos_condicionais;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		String nome;
		float saldo = 1000.00f, valor = 0.0f;
		int operacao;

		System.out.println("# ## ### #### #########   CONTA BANCARIA  ########## #### ### ## #");
		System.out.println("\n Digite Seu nome completo: ");
		nome = leia.nextLine();

		System.out.println("\n Seja bem vindo(a) " + nome + " Ao nosso BANCO!");
		System.out.println("\n " + nome + " Escolha a opção abaixo para continuar");
		System.out.println("\n Digite [1] para saldo: ");
		System.out.println(" Digite [2] para saque: ");
		System.out.println(" Digite [3] para depósito: ");
		operacao = leia.nextInt();

		switch (operacao) {

		case 1:
			System.out.println("Operação - Saldo");
			System.out.printf("Saldo: R$ %.2f%n", saldo);
			saldo = leia.nextFloat();
			break;
		case 2:
			System.out.println("Operação - Saque");
			System.out.print("Digite o valor a ser sacado: ");
			valor = leia.nextFloat();

			if (valor <= saldo) {
				saldo -= valor;
				System.out.printf("Saque realizado com sucesso! Novo saldo: R$ %.2f%n", saldo);
			} 
			else {
				System.out.println("Saldo insuficiente para realizar o saque.");
			}
			break;
		case 3:
			System.out.println("Operação - Depósito");
			System.out.print("Digite o valor a ser depositado: ");
			valor = leia.nextFloat();

			saldo += valor;
			System.out.printf("Depósito realizado com sucesso! Novo saldo: R$ %.2f%n", saldo);
			break;

		default:
			System.out.println("Operação Inválida!");
			break;

		}
		leia.close();
	}

}
