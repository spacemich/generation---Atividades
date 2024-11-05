package Collection01;
import java.util.ArrayList;
import  java.util.Collections;

public class Exemplo01Collection {

	public static void main(String[] args) {

		ArrayList <Double> notas = new ArrayList<>();
		
		notas.add(7.0);
		notas.add(5.0);
		notas.add(4.0);
		notas.add(10.0);
		
		//mostra na tela todas as notas inseridas
		System.out.println("\nNOtas cadastradas: " + notas.toString());
		System.out.println("\nNotas cadastradas: " +notas.contains(notas));
	}

}
