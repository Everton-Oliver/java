package LacosRepeticao;

import java.util.*;

public class Exercicio4 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int idade, contador = 1, totalF, totalM, totalO;
		final int LIMITE = 2;
		byte sexo;
		byte humor;
		int pessoasCalmas = 0, mulheresNervosas = 0, homensAgressivos = 0, outrosCalmos = 0, nervosas40 = 0, Calmas18 = 0;
		
		while(contador <=LIMITE) {
			System.out.println("Digite a sua idade: ");
			idade = ler.nextInt();
			
			System.out.println("Digite 1 - Feminino / 2 - Masculino / 3 - Outros: ");
			sexo = ler.nextByte();
			
			System.out.println("Digite otipo de humor 1 - Calma / 2 - Nervosa / 3 - Agressiva: ");
			humor = ler.nextByte();
			ler.nextLine();
			
			if (humor == 1) {
				pessoasCalmas = pessoasCalmas + 1;
			}
			
			if (humor == 2) {
				mulheresNervosas = mulheresNervosas + 1;
			}
			
			contador++;
			
			
		}
		System.out.println("Total de pessoas calmas: " + pessoasCalmas);
		System.out.println("Total de mulheres nervosas: " + mulheresNervosas);
}
}