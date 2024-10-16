import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		
		//inicialização do Scanner:
		Scanner teclado = new Scanner(System.in);
		
		//Captura das variáveis:
		System.out.println("Digite o primeiro parâmetro: ");
		int parametroUm = teclado.nextInt();
		
		System.out.println("Digite o segundo parâmetro: ");
		int parametroDois = teclado.nextInt();
		
		try {
			String conta = contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException e) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro!");
		}
		
	}
	static String contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		
		int contagem = parametroDois - parametroUm;
		
		if (contagem <0) {
			throw new ParametrosInvalidosException();
		}
		
		contagem(parametroUm, parametroDois);
		return null;
	}
	
	
	static void contagem(int parametroUm, int parametroDois) {
		System.out.println("\nContagem númerica do " + parametroUm + " ao " + parametroDois + ":");
		
		for (int i = parametroUm; i <= parametroDois; i++) {
			
			if (i == parametroDois) {
				System.out.println(i + ".");
			} else {
				System.out.print(i +", ");
			}
		}
	}
}
