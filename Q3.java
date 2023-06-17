/*
 * Proponha um algoritmo que:
 * 1- preencha um vetor de 10 elementos inteiros, com valores gerados
aleatoriamente no intervalo de 1 a 100, 
 * 2-apresente-o e, em seguida, ordene-o em ordem crescente
do valor dos elementos e apresente-o novamente.
 */
package NPC;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Arrays;

public class Q3 {
	public static void main (String[] args) {
	
		//vetores
		int [] elementos  = new int [10];
		
		for(int i = 0; i < elementos.length; i++) {
			elementos [i] = ThreadLocalRandom.current().nextInt(1,100);
		}
		for(int i = 0; i < elementos.length; i++) {
			System.out.printf("\nPosição %d: %d ", i+1, elementos[i]);
		}Arrays.sort(elementos);
		
		System.out.println("\n");
		System.out.println("\nVetor na ordem crescente");
		
		for(int i = 0; i < elementos.length; i++) {
			System.out.printf("\nPosição %d: %d ", i+1, elementos[i]);
		}
		
		
		
		
	
		
		
	}

}
