package Condicional;

import java.util.*;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a, b, c, valorMaior = 0;
		
		System.out.printf("Insira o primeiro n�mero: ");
		a = ler.nextInt();
		
		System.out.printf("Insira o segundo n�mero: ");
		b = ler.nextInt();
		
		System.out.printf("Insira o terceiro n�mero: ");
		c = ler.nextInt();
		
		if (a>b && b>c) {
			
			System.out.println("A ordem crescente dos n�mero �: ["+ a +"]" + "["+ b +"]" + "["+ c +"]");
		
		}
		else if (a>c && c>b) {
			
			System.out.println("A ordem crescente dos n�mero �: ["+ a +"]" + "["+ c +"]" + "["+ b +"]");
		
		}
		else if (b>a && a>c) {
			
			System.out.println("A ordem crescente dos n�mero �: ["+ b +"]" + "["+ a +"]" + "["+ c +"]");
					
		}
		else if (b>c && c>a) {
			
			System.out.println("A ordem crescente dos n�mero �: ["+ b +"]" + "["+ c +"]" + "["+ a +"]");
		
		}
		else if (c>a && a>b) {
			
			System.out.println("A ordem crescente dos n�mero �: ["+ c +"]" + "["+ a +"]" + "["+ b +"]");
		
		}
		else{
		
		System.out.println("A ordem crescente dos n�mero �: ["+ c +"]" + "["+ b +"]" + "["+ a +"]");
	
		}
		
	}

}
