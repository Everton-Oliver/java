package LacosRepeticao;

import java.util.*;

public class Exercicio5 {
	public static void main(String[] args) {
		
		int num, soma = 0;
		
		Scanner ler = new Scanner(System.in);
		
		do { 
			System.out.printf("Digite um n�mero: ");
			num = ler.nextInt();
			
			soma = soma + num;
			
		} while (num != 0);
		
		System.out.println("A soma dos n�meros inseridos �: " + soma);
	
		
		
	}
}