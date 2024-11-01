package exercicios_lacos_condicionais;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {

		int cargo;
		String nome;
		float salario, novosalario, reajuste;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("# ## ### #### #########   >^º.º^<   ########## #### ### ## #");
		System.out.println("\n Digite Seu nome completo: ");
		nome = leia.nextLine();
		
		System.out.println("\n Digite [1] se o cargo é Gerente: ");
		System.out.println(" Digite [2] se o cargo é vendedor: ");
		System.out.println(" Digite [3] se o cargo é Supervisor: ");
		System.out.println(" Digite [4] se o cargo é Motorista: ");
		System.out.println(" Digite [5] se o cargo é Estoquista: ");
		System.out.println(" Digite [6] se o cargo é Técnico de TI: ");
		
		cargo = leia.nextInt();
		
		switch (cargo) {
		
		case 1:
			System.out.println("\nGerente");
			reajuste = 0.10f;
			break;
		case 2:
			System.out.println("Vendedor");
			reajuste = 0.07f;
			break;
		case 3:
			System.out.println("Supervisor");
			reajuste = 0.09f;
			break;
		case 4:
			System.out.println("Motorista");
			reajuste = 0.06f;
			break;
		case 5:
			System.out.println("Estoquista");
			reajuste = 0.05f;
			break;
		case 6:
			System.out.println("Técnico de TI");
			reajuste = 0.08f;
			break;
			
		   default:
               System.out.println("Código de cargo inválido!");
               return;

		}
		
		System.out.println ("\nDigite seu salário: ");
		salario = leia.nextFloat();
		
		novosalario = salario + (reajuste*salario);

		System.out.println("\nFuncionário: " + nome);
		System.out.println("cargo: " + cargo);
		System.out.println("Salário antigo (Sem reajuste): R$ " + salario);
		System.out.printf("Salário novo (Com reajuste): R$ " + novosalario);
		
	}

}
