	
	package portugol;

	import java.util.Scanner;

	public class Exercicio3 {

		public static void main(String[] args) {
			
			int segundos, horas, minutos, tempoDuracao;
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Digite o tempo em segundos: ");
			tempoDuracao = sc.nextInt();
			horas = tempoDuracao / 3600;
			minutos = (tempoDuracao % 3600) / 60;
			segundos = (tempoDuracao % 3600) % 60;
					
			System.out.println("Hora: " + horas
					 		+  "\n Minuto: " + minutos
					 		+  "\n Segundos: " + segundos);
	}

}
