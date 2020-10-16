package listasJava;

import entidades.Vendedor;

/*
 * Exercício 6
 * Implemente a classe Vendedor como subclasse da 
 * classe Pessoa. Um determinado vendedor tem como 
 * atributos da classe Pessoa e também os atributos 
 * próprios como valorVendas (correspondente ao valor 
 * monetário dos artigos vendidos) e o atributo comissao 
 * (porcentagem do valorVendas que será adicionado ao 
 * vencimento base do Vendedor). 
 */
public class Exercicio06 {

	public static void main(String[] args) {
		Vendedor v = new Vendedor("SEU SIRIGUEJO", "4005-6655", 3550.00, 9);
		
		System.out.println("DADOS DO VENDEDOR");
		System.out.println("Nome: " + v.getNome());
		System.out.println("Telefone: " + v.getTelefone());
		System.out.printf("Valor de Vendas: R$ %.2f", v.getValorVendas());
		System.out.println();
		System.out.printf("Comissão: %.2f%%", v.getComissao());
		System.out.println();
		System.out.printf("Vencimento Base: R$ %.2f", v.calcularVencimentoBase());

	}

}