package sintaxe_variaveis_e_fluxo;

public class TesteLacosComBreak {

	public static void main(String[] args) {

		for (int linha = 0; linha < 10; linha++) {
			for (int coluna = 0; coluna < 10; coluna++) {
				if (coluna > linha) {
					break;
				}
				System.out.print("*");
			}
			System.out.println();
		}

	}
}


/* public class ProgramaComBreak {
 *   public static void main(String args[]) {
 *       for(int linha = 0; linha < 5; linha++) {
 *           for (int coluna = 0; coluna < 5; coluna++) {
 *               if ( coluna > linha ) {
 *                   break;
 *               }
 *               System.out.print( coluna ++ );
 *           }
 *           System.out.println();
 *       }
 *   }
}*\