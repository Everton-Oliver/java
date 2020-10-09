package LacosRepeticao;

import java.util.*;

public class Exercicio2 {

	public static void main(String[] args) {

		int valorPar = 0, valorImpar = 0, y;

		Scanner ler = new Scanner(System.in);
		
		for (int x = 1; x <= 10; x++) {
			System.out.println("Digite o " + x + "° número: ");
			y = ler.nextInt();

			if (y % 2 == 0) {
				valorPar++;

			} else {
				valorImpar++;
			}
		}
		System.out.println("Quantidade de número(s) par(es): " + valorPar);
		System.out.println("Quantidade de número(s) impar(es): " + valorImpar);
	}

}
