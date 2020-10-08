package Condicional;

import java.util.*;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a, b, c, valorMaior = 0;
		
		System.out.printf("Insira o primeiro número: ");
		a = ler.nextInt();
		
		System.out.printf("Insira o segundo número: ");
		b = ler.nextInt();
		
		System.out.printf("Insira o terceiro número: ");
		c = ler.nextInt();
		
		if (a>b && a>c) {
		
			valorMaior = a;
		
		}
		
		 if (b>a && b>c) {
			
			valorMaior = b;
		
		}
		
		 else {
			
			valorMaior = c;
		
		}
		
		System.out.printf("O maior valor é: %d", valorMaior);
	}

}
