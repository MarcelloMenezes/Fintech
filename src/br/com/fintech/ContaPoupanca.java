package br.com.fintech;

public class ContaPoupanca extends Conta {
	private String tipo;

	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(String nome, int numero, int agencia, double saldo, String tipo) {
		super(nome, numero, agencia, saldo);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public void rendimentoPoupancaMes() {
		double valor = super.verificarSaldo() * 0.005;
		super.depositar(valor);
	}
}
