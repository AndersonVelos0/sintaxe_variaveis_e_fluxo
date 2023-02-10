package sintaxe_variaveis_e_fluxo;

public class TestaEscopo {
	
	public static void main(String[] args) {

				System.out.println("Testando condicionais (Controle de fluxo)");

				int idade = 20;
				int quantidadePessoas = 3;
				
				
				boolean acompanhado = quantidadePessoas >= 2;

				if (idade >= 18 && acompanhado) {
					System.out.println("Voce tem mais de 18 anos!");

				} else {
						// aqui não existe mais pois está com escopo local 
					System.out.println("Infelizmente, você não pode entrar!");
				}

			}

	}

