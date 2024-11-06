package AtividadePratica;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class EX02 {

	public static void main(String[] args) {

		Stack<String> pilha = new Stack<String>();
		Scanner scanner = new Scanner(System.in);
		int opcao = 1;
		String livro;

		do {
			System.out.println("Digite a opção desejada: ");
			System.out.println("\n[1] Adicionar Livro na Pilha");
			System.out.println("[2] Listar Todos os Livros");
			System.out.println("[3] Retirar Livros da Pilha");
			System.out.println("[0] Sair");
			opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {

			case 1:
				System.out.println("Digite o Nome do Livro: ");
				livro = scanner.nextLine();
				pilha.push(livro);

				System.out.println("O livro: " + livro + " foi adicionado á Pilha com sucesso !");
				System.out.println("\nPress Enter para continuar");
				livro = scanner.nextLine(); // parar1 tela

				break;

			case 2:
				if (pilha.isEmpty()) {

					System.out.println("Pilha Vazia!");
				} else {
					System.out.println("\nLista de Livros na Fila: ");
					Iterator<String> iterator = pilha.iterator();
					while (iterator.hasNext()) {
						System.out.println(iterator.next());

					}
					System.out.println("\nPress Enter para continuar");
					livro = scanner.nextLine();

				}
				break;

			case 3:
				if (pilha.isEmpty()) {
					System.out.println("Pilha vazia!");

				} else {
					System.out.println(pilha.pop() + " retirada da pilha de livros");
				}

				System.out.println("\nPress Enter para continuar");
				livro = scanner.nextLine();
				break;

			case 0:
				System.out.println("Programa Finalizado!");
				break;

			default:
				System.out.println("Opção Inválida! Tente novamente.");

			}

		} while (opcao != 0);

	}
}

		
