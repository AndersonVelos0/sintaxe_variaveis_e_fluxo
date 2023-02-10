package sintaxe_variaveis_e_fluxo;

public class TesteIfElse {

	public static void main(String[] args) {

		double salario = 38000.0;

		if (salario >= 1900.0 && salario <= 2800.0) {
			System.out.println("O IR é de 7.5% e pode deduzir na declaração" + "o valor de R$ 142 ");
		} else {
			if (salario >= 2800.01 && salario <= 3751.0) {
				System.out.println("O IR de 15% e pode deduzir R$350");
			} else {
				System.out.println("O IR de 22.5% e pode deduzir R% 636");
			}

		}
	}

}
