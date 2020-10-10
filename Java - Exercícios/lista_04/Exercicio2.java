package VetorMatriz;

import java.util.*;

public class Exercicio2 {

	public static void main(String args[]) {

		Scanner ler = new Scanner(System.in);

		int[] valor = new int[6];
		int valorPar = 0, valorImpar = 0, somaPar = 0, quantImpar = 0;

		for (int x = 0; x < 6; x++) {
			System.out.printf("Digite um número inteiro positivo: ");
			valor[x] = ler.nextInt();

		}
		System.out.println("\n---------------PARES---------------");
		System.out.printf("Números pares digitados: ");
		for (int x = 0; x < 6; x++) {
			if (valor[x] % 2 == 0) {
				System.out.printf("[" + valor[x] + "]");
				somaPar = somaPar + valor[x];
			}

		}

		System.out.println("\nSoma dos pares: " + "[" + somaPar + "]");
		System.out.println("\n---------------IMPARES---------------");
		System.out.printf("Números impares digitados: ");
		for (int x = 0; x < 6; x++) {
			if (valor[x] % 2 == 1) {
				System.out.printf("[" + valor[x] + "]");
				quantImpar++;
			}

		}

		System.out.println("\nQuantidade de números impares: " + "[" + quantImpar + "]");
	}
}