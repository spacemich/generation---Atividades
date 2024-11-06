package metodos;

public class MetodosExemplo03 {

	public static void main(String[] args) {


		mensagem ();
		somarNumeros(5,6);
	}

	public static void mensagem () {
		System.out.println("Método sem retorno (void)!");
	}
	
	public static void somarNumeros (int a, int b) {
		int resultado = a+b;
		System.out.println("A Soma é: " + resultado);
	}
}
/*system.in é uma versão computadora
 * resultado . s. da
 * 	public static void somarNumeros (int a, int b) {
		int resultado = a+b;
		System.out.println("A Soma é: " + resultado); */


