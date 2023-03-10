package aula04.collections;

import java.util.ArrayList;
import java.util.List;

public class ExemploListas {

	public static void main(String[] args) {

		int busca = 22222;

		Cliente cliente1 = new Cliente(11111, "João da Silva");
		Cliente cliente2 = new Cliente(22222, "Maria de Oliveira");
		Cliente cliente3 = new Cliente(33333, "Ricardo Carvalho");

		List<Cliente> listaClientes = new ArrayList<Cliente>();

		listaClientes.add(cliente1);
		listaClientes.add(cliente2);
		listaClientes.add(cliente3);

		for (Cliente cliente : listaClientes) {

			if (cliente.getCpf() == busca) {

				System.out.println("CPF: " + cliente.getCpf());
				System.out.println("Nome: " + cliente.getNome());

				break;
			}
		}
	}
}
