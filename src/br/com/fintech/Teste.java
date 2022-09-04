package br.com.fintech;

public class Teste {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente("Marcelo", 21, 8828, 20.0, "Conta Corrente");
		
		cc.retirar(10);
		cc.depositar(20);
		System.out.println(cc.getNome());
		System.out.println(cc.getAgencia() + " " + cc.getNumero() + " - " + cc.getTipo());
		System.out.println("Saldo: R$" + cc.verificarSaldo());
		
		System.out.println("---------------------------------");
		
		ContaPoupanca cp = new ContaPoupanca("Pedro", 355, 8828, 800.0, "Conta Poupança");
		
		cp.retirar(100);
		cp.depositar(2000);
		cp.rendimentoPoupancaMes();
		System.out.println(cp.getNome());
		System.out.println(cp.getAgencia() + " " + cp.getNumero() + " - " + cp.getTipo());
		System.out.println("Saldo: R$" + cp.verificarSaldo());
		
	}

}
