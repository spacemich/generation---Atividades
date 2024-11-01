package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class exemplo01 {

	public static void main(String[] args) {

		ArrayList<Double> notas = new ArrayList<>();
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite primeira nota: ");
		notas.add(leia.nextDouble());
		// notas e colection, essa uma forma de adcionar algo em nossa nota
		
		notas.add(7.0); // Nesse pra vc colocar algo na nota sem pedir ao usuario
		notas.add(5.0);
        notas.add(4.0);
        notas.add(10.0);
        notas.add(4.0);
        
        System.out.println("\nNotas cadastradas - Laço Fpr...Each");
        for (Double nota : notas) { // variavel que nota guardara informações em notas
        	System.out.println(nota); // Ate pode não usar o FOr each ele traz uma lista em pé
        	//porém se não tivesse o for ele printava em forma de vetor exempo: [8.0, 7.0, 5.0, 4.0.... Etc]
        }

        notas.add(1,10.5); // o vetor começa sempre do 0 então por isso coloquei 1 para ele ir pra posição 2 no
        //lugar do 7.0
		System.out.println(notas);
		System.out.println("\n A posição da nota 5 é: " + notas.indexOf(5.0));
		System.out.println("\n A posição da nota 5 é: " + notas.contains(11d));
		System.out.println("\n A posição da nota 5 é: " + notas.indexOf(12.0));
	}

}