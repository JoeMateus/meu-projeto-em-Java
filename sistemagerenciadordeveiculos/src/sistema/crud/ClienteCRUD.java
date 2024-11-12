package sistema.crud;

import java.util.ArrayList;
import java.util.List;

import sistema.interfaces.Cliente;
import sistema.interfaces.Loja;
import sistema.interfaces.Veiculo;

public class ClienteCRUD {

	static List<Cliente> listCliente = new ArrayList<>();

	public void adicionar(Cliente c) {
		listCliente.add(c);
	}

	public void alterar(int id, Cliente ClienteAtualizado) {
		// id é a posição
		// Veiculo veiculoAntigo = listVeiculos.get(id);
		listCliente.set(id, ClienteAtualizado);

	}

	public List<Cliente> consultar() {
		return listCliente;

	}

	public void remover(int id) {
		listCliente.remove(id);
	}

}