package sintaxe_variaveis_e_fluxo;

public class TesteSwitchCase {

	public static void main(String[] args) {

		int variavelASerTestada = 5;

		switch (variavelASerTestada) {
		case 1:
			System.out.println("Esse é o mes certo!");
			break;
		case 2:
			System.out.println("Esse é o mes certo!");
			break;
		case 3:
			System.out.println("Esse é o mes certo");
			break;
		default:
			System.out.println("Esse não é o mes certo!");
		}

	}

}