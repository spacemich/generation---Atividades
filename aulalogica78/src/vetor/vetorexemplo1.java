package vetor;

public class vetorexemplo1 {

	public static void main(String[] args) {

		String vetorString [] = {"Boxer","Pastor Alemão","Pinscher","Husky Siberiano", "Corgi"};
		
		for (int i=0; i < vetorString.length; i++) {
			
			System.out.println((i+1)+"º Elemtento " + vetorString [i]);
		}
		
		System.out.println();
		System.out.println("Elemento 3º :"+ vetorString[2]);
	}

}
