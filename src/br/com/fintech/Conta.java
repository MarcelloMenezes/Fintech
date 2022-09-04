package br.com.fintech;

public class Conta {
	private String nome;
	private int numero;
	private int agencia;
	private double saldo;
	
	public Conta() {
		
	}
		
	public Conta( String nome, int numero, int agencia, double saldo) {
		this.nome = nome;
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = saldo;
	}
	
	
	public String getNome() {
		return nome;
	}
	public int getNumero() {
		return numero;
	}
	public int getAgencia() {
		return agencia;
	}

	public void depositar(double valor){
		this.saldo += valor;
	}		
	public void retirar(double valor){
		this.saldo -= valor;
	}	
	public double verificarSaldo(){
		return saldo;
	}
			
}
