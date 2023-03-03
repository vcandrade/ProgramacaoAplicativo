package aula02.encapsulamentodados;

public class ContaBancaria {

	private int numeroConta;
	private String nomeTitular;
	private double saldo;
	
	public ContaBancaria(int numeroConta, String nomeTitular) {
		
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		this.saldo = 0.0;
	}
	
	public void sacar(double valor) {
		
		if(this.saldo >= valor) {
			
			this.saldo -= valor;
			System.out.println("Saque realizado com sucesso.");
			
		} else {
			
			System.out.println("Saldo insuficiente.");
		}
	}
	
	public void depositar(double valor) {
		
		this.saldo += valor;
		System.out.println("Depósito realizado com sucesso.");
		
		this.calcularRendimento();
	}
	
	public void imprimirSaldo() {
		
		System.out.println("====================================");
		System.out.println("Número da Conta: " + this.numeroConta);
		System.out.println("Nome do titular: " + this.nomeTitular);
		System.out.println("Saldo Atual: R$" + String.format("%.2f",this.saldo));
		System.out.println("====================================");
	}
	
	private void calcularRendimento() {
		
		this.saldo *= 1.10;
		System.out.println("Rendimento calculado.");
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		
		if(!nomeTitular.equals("")) {
			
			this.nomeTitular = nomeTitular;
		}
	}

	public int getNumeroConta() {
		return numeroConta;
	}
}
