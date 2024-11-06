package AtividadePratica;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<String>();
		Scanner scanner = new Scanner(System.in);
		int opcao = 1;
		String cli;

		do {
			System.out.println("Digite abaixo a opção desejada:");
			System.out.println("[1] Adicionar Cliente na Fila");
			System.out.println("[2] Listar Todos os Clientes");
			System.out.println("[3] Retirar Cliente da Fila");
			System.out.println("[0] Sair");

			opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {

			case 1:
				System.out.println("Digite o Nome do Cliente: ");
				cli = scanner.nextLine();
				fila.add(cli);

				System.out.println("Cliente " + cli + " Adicionado a fila!");
				System.out.println("\nPress Enter para continuar");
				cli = scanner.nextLine(); // parar1 tela

				break;

			case 2:
				if (fila.isEmpty()) {

					System.out.println("Lista Vazia!");
				} else {
					System.out.println("\nLista de Clientes na Fila: ");
					Iterator<String> iterator = fila.iterator();
					while (iterator.hasNext()) {
						System.out.println(iterator.next());

					}
					System.out.println("\nPress Enter para continuar");
					cli = scanner.nextLine();

				}
				break;

			case 3:
				if (fila.isEmpty()) {
					System.out.println("Fila vazia!");

				} else {
					System.out.println(fila.remove() + " Comparecer ao caixa!");
				}

				System.out.println("\nPress Enter para continuar");
				cli = scanner.nextLine();
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
