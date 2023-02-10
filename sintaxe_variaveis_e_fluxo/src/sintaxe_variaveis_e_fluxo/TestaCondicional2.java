package sintaxe_variaveis_e_fluxo;

public class TestaCondicional2 {

	public static void main(String[] args) {

		System.out.println("Testando condicionais (Controle de fluxo)");

		int idade = 20;
		int quantidadePessoas = 3;
		boolean acompanhado = quantidadePessoas >= 2;

		if (idade >= 18 && acompanhado) {

			System.out.println("Voce tem mais de 18 anos!");

		} else {

			System.out.println("Infelizmente, você não pode entrar!");
		}

	}
}
