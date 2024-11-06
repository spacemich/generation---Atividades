package metodos;

import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {

		System.out.println("Idade: ");

		Scanner leia = new Scanner(System.in);
		String Classifiq = classificarIdade(leia.nextInt());
		System.out.println(Classifiq);
	}

	public static String classificarIdade(int idade) {
		if (idade <= 0) {
			return "Inválido";

		} else if (idade < 18) {
			return "Adolescente";
		} else if (idade <= 65) {
			return "Adulto";
		} else if (idade <= 13) {
			return "Criança";

		}
	
}

