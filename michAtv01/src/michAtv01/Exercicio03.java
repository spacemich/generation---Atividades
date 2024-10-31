package michAtv01;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		float salariobruto, adicionalnoturno, horaextra, desconto, salarioliquido;
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Digite o salário bruto: ");
		salariobruto = ler.nextFloat();
		
		System.out.println("Digite o adicional noturno: ");
		adicionalnoturno = ler.nextFloat();
		
		System.out.println("Digite a hora extra: ");
		horaextra = ler.nextFloat();
		
		System.out.println("Digite o desconto do Funcionário: ");
		desconto = ler.nextFloat();
		
		salarioliquido = salariobruto + adicionalnoturno + (horaextra * 5) - desconto;
		
		System.out.println(" O Funcionário irá receber :  " + salarioliquido);
	}

}
