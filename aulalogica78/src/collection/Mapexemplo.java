package collection;

import java.util.HashMap;

public class Mapexemplo {

	public static void main(String[] args) {
		
		HashMap <Long, String> pessoa = new HashMap <>();
		
		pessoa.put(12345678911L, "Felipe");
		pessoa.put(12345678913L, "Sassão");
		pessoa.put(12345678912L, "Sassão");
		
		
		System.out.println("" + pessoa.get(12345678911L));

	}
	
}
