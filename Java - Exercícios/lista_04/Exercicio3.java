package VetorMatriz;

import java.util.*;

public class Exercicio3 {

	public static void main(String[] args) {
		int[][] matriz = new int[3][3];
		int contador = 0;
		Scanner ler = new Scanner(System.in);

		for (int ln = 0; ln < 3; ln++) {
			for (int cl = 0; cl < 3; cl++) {
				System.out.printf("Digite os valores da matriz [Linha %d] - [Coluna %d]: ", ln+1, cl+1);
				matriz[ln][cl] = ler.nextInt();

			}
		}
		System.out.println("\n-------------Valores Maiores Que 10-------------");
		for (int ln = 0; ln < 3; ln++) {
			for (int cl = 0; cl < 3; cl++) {
				if (matriz[ln][cl] > 10) {
					System.out.printf("[" + matriz[ln][cl] + "]");
					contador++;

				}
			}
		}
		System.out.println("\n------------------------------------------------");
		System.out.println("Total de números maiores que 10: " +contador);
	}
}