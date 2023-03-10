package aula04.collections;

public class ContaTeste {

	public static void main(String[] args) {
		
		Banco banco1 = new Banco(16758, "NewBank");
		
		banco1.criarNovaConta(111, 123456, "João da Silva");
		banco1.criarNovaConta(222, 987654, "Maria de Oliveira");
		banco1.criarNovaConta(333, 159483, "Ricardo Carvalho");
		
		banco1.realizarDeposito(222, 150.00);		
		banco1.listarContas();
		
		banco1.realizarSaque(222, 130.00);
		banco1.listarContas();
	}
}
