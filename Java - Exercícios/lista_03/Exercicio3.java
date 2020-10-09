package LacosRepeticao;

import java.util.*;

public class Exercicio3 {
	public static void main(String[] args) {
		
		int idade = 0, menorIdade = 0, maiorIdade = 0;
		
		Scanner ler = new Scanner(System.in);

		while (idade != -99) {
			System.out.printf("Entre com sua idade: ");
			idade = ler.nextInt();
			
			if(idade > 0 && idade <21) {
				menorIdade++;
				
			}
			
			if (idade > 50) {
				maiorIdade++;
			}
			
		}
		
			System.out.println("A soma de pessoas com menos de 21 anos é: " + menorIdade);
			System.out.println("A soma de pessoas com mais de 50 anos é: " + maiorIdade);
				
	}
}