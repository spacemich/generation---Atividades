package AtividadePraticaJava8;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int  numpar=0, numimpar=0;
		
		System.out.println("Digite 10 números inteiros : ");
		
		for  (int count  = 1; count <= 10; count++) {
			System.out.println("Número" + count + ": ");
			int num =  leia.nextInt();
			
		    if (num % 2 == 0) {
                numpar++;
            } else {
                numimpar++;
            }
        }
        
        System.out.println("Total de números pares: " + numpar);
        System.out.println("Total de números ímpares: " + numimpar);

}
}

//Escreva um algoritmo em Java, que leia 10 números inteiros via teclado e mostre na tela quantos números são pares 
//e quantos número são ímpares. Veja o exemplo abaixo: