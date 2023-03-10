package aula03.associacaoclasses;

public class Pessoa {

	private String nome;
	private String dataNascimento;
	private String sexo;
	private String email;
	private Endereco endereco;
	private EstadoCivil estadoCivil;
	
	public Pessoa(String nome, String dataNascimento, String sexo, String email, String logradouro, int numero, String bairro, String cidade, String unidadeFederativa, EstadoCivil estadoCivil) {
		
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.email = email;
		this.endereco = new Endereco(logradouro, numero, bairro, cidade, unidadeFederativa);
		this.estadoCivil = estadoCivil;
	}
	
	public void setEstadoCivil(EstadoCivil estadoCivil) {
		
		this.estadoCivil = estadoCivil;
	}
	
	public void imprimirDados() {
		
		System.out.println("==============================================================");
		System.out.println("Nome:" + this.nome);
		System.out.println("Data de Nascimento: " + this.dataNascimento);
		System.out.println("Sexo: " + this.sexo);
		System.out.println("E-mail: " + this.email);
		System.out.println("Estado Civil: " + this.estadoCivil.getEstadoCivil());
		System.out.println("Endereço: " + this.endereco.getLogradouro() + ", " + this.endereco.getNumero() + ". " + this.endereco.getBairro() + ". " + this.endereco.getCidade() + " - " + this.endereco.getUnidadeFederativa());
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", dataNascimento=" + dataNascimento + ", sexo=" + sexo + ", estadoCivil=" + estadoCivil + ", email=" + email
				+ ", endereco=" + endereco + "]";
	}
}
