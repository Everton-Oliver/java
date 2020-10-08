package Condicional;

import java.util.*;

import java.math.*;

public class Exercicio4 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double num, resultado;
		
		System.out.println("Digite um número positivo:");
		num = ler.nextInt();
		
		if (num<=0) {
			System.out.println("Você digitou um número inválido");
		} 
		else {
			
		
		if (num %2 == 0) {
			resultado = Math.sqrt(num);
			System.out.println("O número " + num + " é par, e a raiz quadrada é " + resultado);
		}
		
		else {
			
			resultado = Math.pow(num,2);
			System.out.println("O número " + num + " é impar, e ao quadrado é " + resultado);
		}
		
	}
  }
}