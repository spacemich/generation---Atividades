package lacoscondicionais;

import java.util.Scanner;

public class IFEncadeado {

	public static void main(String[] args) {

Scanner leia = new Scanner(System.in);
		
		float nota1, nota2, media;
		
		System.out.println ("Digite a nota da P1");
		nota1 = leia.nextFloat();
		
		System.out.println ("Digite a nota da P2");
		nota2 = leia.nextFloat();

		media = (nota1 + nota2)/2;
			
			if (media >= 6) {
				System.out.printf("Parabéns você foi aprovado!: " , media );
				
			}else if (media == 5) {
					System.out.printf("Voce ficou de recuperação! %.2f" , media);
				}
										
			 else {
				System.out.println("Sua nota é: " + media + " Você foi reprovado precisa estudar mais!");
		
		
			}
			
			leia.close();
		
	}

}
