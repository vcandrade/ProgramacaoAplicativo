package aula03.associacaoclasses;

public enum EstadoCivil {

	SOLTEIRO("Solteiro(a)"),
	CASADO("Casado(a)"),
	DIVORCIADO("Divorciado(a)"),
	VIUVO("Viúvo(a)");
	
	private String estadoCivil;
	
	private EstadoCivil(String estadoCivil) {
		
		this.estadoCivil = estadoCivil;
	}
	
	public String getEstadoCivil() {
		
		return this.estadoCivil;
	}
}
