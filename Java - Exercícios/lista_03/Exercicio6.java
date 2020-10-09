package LacosRepeticao;

import java.util.*;

public class Exercicio6 {
	public static void main(String[] args) {
		int num = 0, x = 1, soma = 0, contador = 0;
		float media = 0;

		Scanner ler = new Scanner(System.in);

		do {
			System.out.printf("Digite o " + x + "° número: ");
			num = ler.nextInt();
			x++;

			if (num % 3 == 0 && num != 0) {
				soma = soma + num;
				contador++;
			}
			media = soma / contador;
		} while (num != 0);

		System.out.println("A média dos números multiplos de 3: " + media);
	}

}
