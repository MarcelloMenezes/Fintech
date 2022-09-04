package br.com.fintech;

public class ContaCorrente extends Conta {
	private String tipo;

	public ContaCorrente() {
		super();
	}

	public ContaCorrente(String nome, int numero, int agencia, double saldo, String tipo) {
		super(nome, numero, agencia, saldo);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
