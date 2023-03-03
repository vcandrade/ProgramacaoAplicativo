package aula02.encapsulamentodados;

public class ContaBancariaTeste {

	public static void main(String[] args) {
		
		ContaBancaria conta = new ContaBancaria(111, "João da Silva");

		conta.imprimirSaldo();
		
		conta.depositar(50.00);
		conta.imprimirSaldo();
		
		conta.sacar(56.00);
	}
}
