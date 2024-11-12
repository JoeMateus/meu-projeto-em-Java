package sistema.crud;

import java.util.ArrayList;
import java.util.List;

import sistema.interfaces.Veiculo;

public class VeiculoCRUD {

	static List<Veiculo> listVeiculos = new ArrayList<>();

	public void adicionar(Veiculo v) {
		listVeiculos.add(v);
	}

	public void alterar(int id, Veiculo veiculoAtualizado) {
		// id é a posição
		// Veiculo veiculoAntigo = listVeiculos.get(id);
		listVeiculos.set(id, veiculoAtualizado);

	}

	public List<Veiculo> consultar() {
		return listVeiculos;

	}

	public void remover(int id) {
		listVeiculos.remove(id);
	}

}