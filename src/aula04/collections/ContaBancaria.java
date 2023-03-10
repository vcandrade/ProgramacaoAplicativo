package aula04.collections;

public class ContaBancaria {

	private int numeroConta;
	private double saldo;
	private Cliente titularConta;
	
	public ContaBancaria(int numeroConta, Cliente titularConta) {
		
		this.numeroConta = numeroConta;
		this.saldo = 0.00;
		this.titularConta = titularConta;
	}
	
	public void realizarSaque(double valor) {
		
		if(this.saldo >= valor) {
			
			this.saldo -= valor;
			System.out.println("Saque realizado com sucesso.");
			
		} else {
			
			System.out.println("Saldo insuficiente.");
		}
		System.out.println("====================================");
	}
	
	public void realizarDeposito(double valor) {
		
		this.saldo += valor;
		System.out.println("Depósito realizado com sucesso.");
		System.out.println("====================================");
	}
	
	public void emitirSaldo() {
		
		System.out.println("Número da Conta: " + this.numeroConta);
		System.out.println("CPF do Titular: " + this.titularConta.getCpf());
		System.out.println("Nome do Titular: " + this.titularConta.getNome());
		System.out.println("Saldo: R$" + String.format("%.2f", this.saldo));
		System.out.println("====================================");
	}

	public int getNumeroConta() {
		return numeroConta;
	}
}
