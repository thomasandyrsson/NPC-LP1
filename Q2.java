/*Elabore um algoritmo que:
 * 01 - leia as duas notas obtidas por um aluno (valores reais de 0 a 10) na
disciplina de Linguagem de Programação I, o número total de aulas ministradas e 
o número de aulas que ele assistiu. 
 * 02 - Calcule e apresente a média final e a sua frequência, ambas com duas
casas decimais. 
 * 03 - Ao final, o seu algoritmo deve apresentar o resultado do aluno na disciplina.
 * 04 - Ele estará aprovado somente se obtiver frequência igual ou superior a 75% e média final 
 * igual ou superior a 7:00.*/
package NPC;
import java.util.Scanner;

public class Q2 {
	static Scanner leia = new Scanner (System.in);
	
	public static void main (String[] args) {
		//variaveis
		String situacaoAluno = new String();
		int totalAulas, aulasPre;
		float frequencia = 0, mediaAluno = 0, npc1, npc2;
		
		//Inicio
		System.out.println("============= SisUece ==============");
		System.out.println("Disciplina: Linguagem de Programação I");
		System.out.println("Semestre 2023.1");
		System.out.println("Este sistema funciona apenas para consultas rápidas, devendo o operador digitar manualmente as informações requeridas");
		System.out.printf("Digite a quantidade de aulas ministradas da disciplina no semestre corrente: ");
		totalAulas = leia.nextInt();
		System.out.printf("Agora informe a frequência do aluno (Considere apenas a quantidade de aulas que o aluno assistiu): ");
		aulasPre = leia.nextInt();
		System.out.printf("Digite a NPC 1 do aluno: ");
		npc1 = leia.nextFloat();
		System.out.printf("Digite a NPC 2 do aluno: ");
		npc2 = leia.nextFloat();
		
	//Teste modulo	mediaCalc(npc1, npc2, mediaAluno, frequencia, aulasPre, totalAulas);
	//Teste modulo	situacaoDoAluno(mediaAluno, frequencia);
		
		//Calculo da media
		mediaAluno = (npc1 + npc2) / 2;
		frequencia = aulasPre * 100 / totalAulas;
		
		System.out.printf("A média deste aluno ao final da disciplina é: %.2f", mediaAluno);
		System.out.printf("\nE sua frequência representa : %.2f%%, do total de aulas ministradas", frequencia);
		
		if(mediaAluno >= 7 && frequencia >= 75) {
			situacaoAluno = "Aprovado";
		}else {
			situacaoAluno = "Reprovado";
		}
		System.out.printf("\n");
		System.out.printf("\nO aluno está %S", situacaoAluno);
	
	}


//Apenas teste
	public static void mediaCalc (float nota1, float nota2, float media, float frequencia, int aulasPres, int aulasTotal) {
		media = (nota1 + nota2) / 2;
		frequencia = aulasPres * 100 / aulasTotal;
		
		System.out.printf("A média deste aluno ao final da disciplina é: %.2f", media);
		System.out.printf("\nE sua frequência representa : %.2f%%, do total de aulas ministradas", frequencia);
	}
	//Apenas teste
	public static void situacaoDoAluno(float notaMedia, float valorFrequencia) {
		String situacaoAluno = new String();
		if(notaMedia >= 7 && valorFrequencia >= 75) {
			situacaoAluno = "Aprovado";
		}else {
			situacaoAluno = "Reprovado";
		}
		System.out.printf("\n");
		System.out.printf("\nO aluno está %S", situacaoAluno);
	}
	
}
