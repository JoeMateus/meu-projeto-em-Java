package sistema.crud;

import java.util.ArrayList;
import java.util.List;

import sistema.interfaces.Loja;
import sistema.interfaces.Veiculo;

public class LojaCRUD {

	static List<Loja> listLoja = new ArrayList<>();

	public void adicionar(Loja lj) {
		listLoja.add(lj);
	}

	public void alterar(int id, Loja LojaAtualizado) {
		// id é a posição
		// Veiculo veiculoAntigo = listVeiculos.get(id);
		listLoja.set(id, LojaAtualizado);

	}

	public List<Loja> consultar() {
		return listLoja;

	}

	public void remover(int id) {
		listLoja.remove(id);
	}

}