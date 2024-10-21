package Iphone;

import AparelhoTelefônico.AparelhoTelefonico;
import NavegadorInternet.NavegadorInternet;
import ReprodutorMusical.ReprodutorMusical;


public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

	//Aparelho Telefônico
	public void ligar() {
		System.out.println("ligando pelo Iphone...");
	}

	public void atender() {
		System.out.println("atendendo pelo Iphone...");
	}

	public void iniciarCorreioVoz() {
		System.out.println("iniciando correio de voz pelo Iphone...");
	}


	//Navegador de Internet
	public void exibirPagina() {
		System.out.println("exibindo página pelo Iphone...");
	}
	
	public void adicionarNovaPagina() {
		System.out.println("adicionando nova página no Iphone...");
	}
	
	public void atualizarPagina() {
		System.out.println("atualizando página do Iphone...");	
	}
	
	
	//Reprodutor Musical
	public void tocar() {
		System.out.println("tocando música do Iphone...");
	}

	public void pausar() {
		System.out.println("pausando música do Iphone...");
	}

	public void selecionarMusica() {
		System.out.println("Selecionando música pelo Iphone...");
	}
}
