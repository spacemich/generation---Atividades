package operadores;

import java.util.Scanner;

public class LogicoDisjuncao {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		boolean idade, mae_presente, resposta;
		
		System.out.println("Vamos verificar acesso ao cinema: ");
		System.out.println("Idade maior ou igual a 18? ");
		idade = ler.nextBoolean();
		
		System.out.println("Sua mãe está presente? ");
		mae_presente = ler.nextBoolean();
		
		resposta = idade || mae_presente;

	}

}
