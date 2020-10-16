package listasJava;

import entidades.Operario;

/*
 * Exercício 5
 * Implemente a classe Operario como subclasse da 
 * classe Pessoa. Um determinado operário tem como 
 * atributos da classe Pessoa e também os atributos 
 * próprios como valorProducao (que corresponde ao 
 * valor monetário dos artigos efetivamente produzidos 
 * pelo operário) e comissao (que corresponde à 
 * porcentagem do valorProducao que será adicionado 
 * ao vencimento base do operário). 
 */
public class Exercicio05 {

	public static void main(String[] args) {
		Operario op = new Operario("Sr PLANCTON", "4003-85658996", 1458.00, 20);
		
		System.out.println("DADOS DO OPERÁRIO");
		System.out.println("Nome: " + op.getNome());
		System.out.println("Telefone: " + op.getTelefone());
		System.out.printf("Valor de Produção: R$ %.2f", op.getValorProducao());
		System.out.println();
		System.out.printf("Comissão: %.2f%%", op.getComissao());
		System.out.println();
		System.out.printf("Vencimento Base: R$ %.2f", op.calcularVencimentoBase());
	}

}