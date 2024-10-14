import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		//inicialização do scanner:
		Scanner teclado = new Scanner(System.in);
		
		
		//captura de informações:
		System.out.println("Vamos atualizar os seus dados bancários: ");
		
		System.out.println("Digite o número da sua conta: ");
		int numero = teclado.nextInt();
		
		System.out.println("Digite a agência da sua conta: ");
		String agencia = teclado.next();
		
		System.out.println("Digite o seu nome: ");
		String nome = teclado.next();
		
		System.out.println("Digite o seu sobrenome: ");
		String sobrenome = teclado.next();
		
		System.out.println("Digite o seu saldo atual: ");
		double saldo = teclado.nextDouble();
		
		teclado.close();
		
		
		//concatenação do nome + sobrenome;
		String nomeCliente = nome.concat(" ").concat(sobrenome);
		nomeCliente = nomeCliente.toUpperCase();
		
		
		//atualização das informações + print delas:
		ContaTerminal conta1 = new ContaTerminal(numero, agencia, nomeCliente, saldo);
		
		System.out.println(conta1.Informacoes());
	}

}
