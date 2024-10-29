package michAtv01;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		float salario =10, abono, novosalario; 
		
		
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Digite o salário:  ");
		salario = ler.nextFloat();
		
		System.out.println("Possui abono:  ");
		abono = ler.nextFloat();
		
		System.out.println("Seu novo salário é:  " + (salario + abono));
		
	}

}
