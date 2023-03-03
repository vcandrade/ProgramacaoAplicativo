package aula01revisaoclasse;

public class CarroTeste {

	public static void main(String[] args) {
		
		Carro carro1 = new Carro("Gol", "Volks", 2022, "ABC-1234", "Vermelho");
		Carro carro2 = new Carro("Onix", "Chevrolet", 2015, "MNO-9876", "Preto");
		Carro carro3 = new Carro("Fiesta", "Ford", 2018, "XYZ-6543", "Verde");
		
		System.out.println(carro1);
		System.out.println(carro2);
		System.out.println(carro3);
	}
}
