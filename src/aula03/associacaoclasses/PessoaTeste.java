package aula03.associacaoclasses;

public class PessoaTeste {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa("Jo�o da Silva", "10/05/1980", "Masculino", "joao@email.com", "Vicente Machado", 1024, "Centro", "Ponta Grossa", "Paran�", EstadoCivil.SOLTEIRO);
		pessoa.imprimirDados();
		
		pessoa.setEstadoCivil(EstadoCivil.CASADO);
		pessoa.imprimirDados();
	}
}
