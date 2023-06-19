package NPC;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Q4 {
	static Scanner leia = new Scanner (System.in);
	
	public static void main (String[] args) {
		//variaveis
		int n = 0;
		
		
		//Inicio
		do {
			System.out.println("============= NOVA MATRIZ =============");
			System.out.printf("====== Digite o tamanho N x N da matriz: ");
			n = leia.nextInt();
		}while(n >= 20 || n <= 1);
		
		System.out.printf("\nGerando Matriz.......");
		int [][] matriz = new int [n][n];
		
		System.out.println("\n");
		
	
	        for(int i = 0; i < n; i++) {
	            for(int j = 0; j < n; j++) {
	                matriz[i][j] = ThreadLocalRandom.current().nextInt(0,9);
	                System.out.printf("| %d | ", matriz[i][j]);
	            }System.out.printf("%n");
	        }
	        
	        System.out.printf("%n");
		
	      //Laço diagonal
	       
	        int [] diag1 = new int[n];
	        int [] diag2 = new int[n];
	        
	      //laço diagonal 01 (left to right)
	        for(int i = 0; i < n; i++){
	        	diag1[i] = matriz[i][i];
	        	diag2[i] = matriz[i][n - i - 1];
	        }
	        
	      //laço diagonal 02 (right to left)
	      
	        for(int i = 0; i < n; i++) {
        		matriz[i][n - i - 1] = diag1[i]; 
        		matriz[i][i] = diag2[i];
	        }
	        
	        
	
	   //   matriz[i][i] = aux[n-i];
	        for(int i = 0; i < n; i++) {
	        	for(int j = 0; j < n; j++) {
                System.out.printf("| %d | ", matriz[i][j]);
            }System.out.printf("%n");
        }
        
        System.out.printf("%n");		
		
	}
}
		
		
		



