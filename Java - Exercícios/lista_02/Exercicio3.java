package Condicional;

import java.util.*;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int idade = 0;
		
		System.out.println("Digite sua idade:");
		idade = ler.nextInt();
		
		if (idade >= 10 && idade<= 14) {
			System.out.println("Sua categoria é infantil");
			
		}
		
		else if (idade >= 15 && idade<= 17) {
			System.out.println("Sua categoria é juvenil");
			
		}
		
		else if (idade >= 18 && idade<= 25) {
			System.out.println("Sua categoria é adulto");
		
		
		}
		
		else {
			System.out.println("Você não está em nenhuma das categorias!");
		}
		
}
}