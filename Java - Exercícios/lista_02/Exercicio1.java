package Condicional;

import java.util.*;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a, b, c, valorMaior = 0;
		
		System.out.printf("Insira o primeiro n�mero: ");
		a = ler.nextInt();
		
		System.out.printf("Insira o segundo n�mero: ");
		b = ler.nextInt();
		
		System.out.printf("Insira o terceiro n�mero: ");
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
		
		System.out.printf("O maior valor �: %d", valorMaior);
	}

}
