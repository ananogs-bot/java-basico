
public class ContaTerminal {
	int numero;
	String agencia;
	String nomeCliente;
	double saldo;
	
	ContaTerminal(int numero, String agencia,String nomeCliente, double saldo) {
		this.numero = numero;
		this.agencia = agencia;
		this.nomeCliente = nomeCliente;
		this.saldo = saldo;
	}
	
	public String Informacoes() {
		return
				"\nOlá " + nomeCliente + "!"
				+ "\nObrigado por criar uma conta em nosso banco!\n"
				+ "\nSuas informações são: \n"
				+ "- Número da agência é: " + agencia + "\n"
				+ "- Número da conta: " + numero + "\n"
				+ "- Saldo de: " + saldo + "\n"
				+ "\nSeu saldo já está disponível para saque pela sua conta!";		
	}
}
