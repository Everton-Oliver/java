package portugol;

import java.util.Scanner;

public class Exercicio1 {

	private static Scanner sc;

	public static void main(String[] args) {
		
		int anos, meses, dias, total = 0;
		
		sc = new Scanner(System.in);
		
		System.out.println("Digite os anos:");
		
		anos = sc.nextInt();
		
		System.out.println("Digite os meses:");
		
		meses = sc.nextInt();
		
		System.out.println("Digite os dias: ");
		
		dias = sc.nextInt();
		
		total = ((anos*365)+(meses*30)+dias);
				
				
		System.out.println("A pessoa viveu " + total + " dias");

	}
}
