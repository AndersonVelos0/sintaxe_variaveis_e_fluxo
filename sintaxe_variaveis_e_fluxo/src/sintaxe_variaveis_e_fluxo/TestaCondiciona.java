package sintaxe_variaveis_e_fluxo;

public class TestaCondiciona {

	public static void main(String[] args) {

		System.out.println("Testando condicionais (Controle de fluxo)");

		int idade = 16;
		int quantidadePessoas = 3;

		if (idade >= 18) {

			System.out.println("Voce tem mais de 18 anos!");

		} else {

			if (quantidadePessoas >= 2) {
				System.out.println("Você pode entrar, por estar acompanhado");

			} else {

				System.out.println("Infelizmente, você não pode entrar");
			}
		}

	}
}
