package NPC;
import java.util.Scanner;

public class Q1 {
	//Scanner
	static Scanner leia = new Scanner (System.in);
	
	//Inicio
	public static void main(String[] args) {
	
		//Variaveis
		int a = 1, b = 1, i, n;
		System.out.println("Digite o valor de n: ");
		n = leia.nextInt();
		
		//Laço
		for(i = 3; i < n; i++) {
			a = b - a;
			b = a + b;
		}
		
		//Resultado
		System.out.printf("Resultado: %d", b);
	}
	
	
}
