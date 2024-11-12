package sistema.servico;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import sistema.crud.ClienteCRUD;
import sistema.crud.LojaCRUD;
import sistema.interfaces.Cliente;

public class ClienteService {

	public void cadastrar() {
		Scanner scan = new Scanner(System.in);
		Cliente c = new Cliente();

		System.out.print("NOME: ");
		c.setNome(scan.nextLine());

		System.out.print("TELEFONE: ");
		c.setTelefone(scan.nextLine());

		System.out.print("CPF: ");
		c.setCpf(scan.nextLine());

		new ClienteCRUD().adicionar(c);

	}

	public void listarTodos() {
		List<Cliente> lista = new ArrayList<>();
		lista = new ClienteCRUD().consultar();

		if (!lista.isEmpty()) {

			System.out.println("********** IMPRIMINDO A LISTA DE CLIENTES ********");
			for (Cliente item : lista) {
				System.out.println(item.getNome() + " | " + item.getTelefone() + " | " + item.getCpf());

			}

		} else {
			System.err.println("\n A LISTA ESTÁ VAZIA");
		}
		System.err.println("--------Total de itens: " + lista.size());

	}

	public void atualizar() {
		// List<Veiculo>listaVeiculos = new ArrayList<Veiculos>(); ao inves de fazer os
		// dois, eu acabei juntando para polpar linha.
		// listaVeiculos = new VeiculoCRUD().consultar();

		List<Cliente> listaLoja = new ClienteCRUD().consultar();
		Scanner scan = new Scanner(System.in);
		String op;

		System.out.println("Informe o CPF do Cliente para alterar os dados");
		String cpfCliente = scan.nextLine();

		for (int i = 0; i < listaLoja.size(); i++) {
			if (listaLoja.get(i).getCpf().equalsIgnoreCase(cpfCliente)) {
				int idCliente = i;

				System.out.print("ALTERAR NOME? [S/N]? ");
				op = scan.nextLine();
				if (op.equalsIgnoreCase("s")) {
					String novaInformacao = scan.nextLine();
					listaLoja.get(i).setNome(novaInformacao);
				}

				// listaLoja.get(i).setNome(scan.nextLine().equalsIgnoreCase("s")?
				// scan.nextLine(): listaLoja.get(i).getNome());
				// está bugando o cód por conta q é NextInt, ai utiliza..
				// scan.nextLine();

				System.out.print("ALTERAR TELEFONE? [S/N]?");
				op = scan.nextLine();
				if (op.equalsIgnoreCase("s")) {
					String novaInformacao = scan.nextLine();
					listaLoja.get(i).setTelefone(novaInformacao);
				}

				System.out.print("ALTERAR CPF? [S/N]? ");
				op = scan.nextLine();
				if (op.equalsIgnoreCase("s")) {
					String novaInformacao = scan.nextLine();
					listaLoja.get(i).setCpf(novaInformacao);
				}

				System.out.println("Alteração feita!");

				Cliente clienteAtualizado = listaLoja.get(i);

				new ClienteCRUD().alterar(idCliente, clienteAtualizado);

			}
		}
	}

	public void remover() {

		List<Cliente> listLoja = new ClienteCRUD().consultar();
		Scanner scan = new Scanner(System.in);

		System.out.println("\n Informe o CPF DO CLIENTE para REMOVER ");
		String cpfCliente = scan.nextLine();

		for (int i = 0; i < listLoja.size(); i++) {
			if (listLoja.get(i).getNome().equalsIgnoreCase(cpfCliente)) {
				new ClienteCRUD().remover(i);
				System.err.println("\n Item removido com exito");
			}
		}
	}

}