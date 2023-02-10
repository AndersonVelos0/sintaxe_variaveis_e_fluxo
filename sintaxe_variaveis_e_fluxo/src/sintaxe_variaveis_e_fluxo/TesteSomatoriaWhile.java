package sintaxe_variaveis_e_fluxo;

public class TesteSomatoriaWhile {
	
	public static void main(String[] args) {
		
		int count = 0;
		int total = 0; 
 
		while (count <= 10) {
			
			total = total + count;
			
			System.out.println(total);
			count++;
		}
	}

}
