package aula01.revisaoclasse;

public class Carro {

	// atributos
	String modelo;
	String marca;
	int ano;
	String placa;
	String cor;
	
	// método construtor
	public Carro(String modelo, String marca, int ano, String placa, String cor) {
		
		this.modelo = modelo;
		this.marca = marca;
		this.ano = ano;
		this.placa = placa;
		this.cor = cor;
	}
	
	// métodos
	public void acelerar() {
		
	}
	
	public void frear() {
		
	}
	
	public void ligar() {
		
	}
	
	public void desligar() {
		
	}

	@Override
	public String toString() {
		return "Carro [modelo=" + modelo + ", marca=" + marca + ", ano=" + ano + ", placa=" + placa + ", cor=" + cor
				+ "]";
	}
}
