package sistema.servico;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import sistema.crud.LojaCRUD;
import sistema.interfaces.Loja;

public class LojaService {

	public void cadastrar() {
		Scanner scan = new Scanner(System.in);
		Loja lj = new Loja();

		System.out.print("NOME: ");
		lj.setNome(scan.nextLine());

		System.out.print("TELEFONE: ");
		lj.setTelefone(scan.nextLine());

		System.out.print("ENDEREÇO: ");
		lj.setEndereco(scan.nextLine());

		new LojaCRUD().adicionar(lj);

	}

	public void listarTodos() {
		List<Loja> lista = new ArrayList<>();
		lista = new LojaCRUD().consultar();

		if (!lista.isEmpty()) {

			System.out.println("********** IMPRIMINDO A LISTA DE LOJAS ********");
			for (Loja item : lista) {
				System.out.println(item.getNome() + " | " + item.getTelefone() + " | " + item.getEndereco());

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

		List<Loja> listaLoja = new LojaCRUD().consultar();
		Scanner scan = new Scanner(System.in);
		String op;

		System.out.println("Informe o NOME da LOJA para alterar os dados");
		String nomeLoja = scan.nextLine();

		for (int i = 0; i < listaLoja.size(); i++) {
			if (listaLoja.get(i).getNome().equalsIgnoreCase(nomeLoja)) {
				int idLoja = i;

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

				System.out.print("ALTERAR ENDEREÇO? [S/N]? ");
				op = scan.nextLine();
				if (op.equalsIgnoreCase("s")) {
					String novaInformacao = scan.nextLine();
					listaLoja.get(i).setEndereco(novaInformacao);
				}

				System.out.println("Alteração feita!");

				Loja LojaAtualizada = listaLoja.get(i);

				new LojaCRUD().alterar(idLoja, LojaAtualizada);

			}
		}
	}

	public void ConsultarNomeTelefone() {

		List<Loja> listaLoja = new LojaCRUD().consultar();
		List<Loja> lojasLocalizadas = new ArrayList<Loja>();
		Scanner scan = new Scanner(System.in);
		boolean valido = true;

		System.out.println("Informe a NOME ou TELEFONE para localizar uma Loja ");
		String nomeTelefone = scan.next();

		for (int i = 0; i < listaLoja.size(); i++) {
			if (listaLoja.get(i).getNome().equalsIgnoreCase(nomeTelefone)
					|| listaLoja.get(i).getTelefone().equalsIgnoreCase(nomeTelefone)) {
				lojasLocalizadas.add(listaLoja.get(i));
			}
		}
		if (!lojasLocalizadas.isEmpty())
			for (Loja item : lojasLocalizadas) {
				System.out.println("\n********** LOJAS LOCALIZADO ********)");
				System.out.println(item.getNome() + " | " + item.getTelefone() + " | " + item.getEndereco());
			}
		else {
			System.err.println(" Não foi possivel localizar a LOJA por nome/telefone = " + nomeTelefone);

		}
	}

	public void remover() {

		List<Loja> listLoja = new LojaCRUD().consultar();
		Scanner scan = new Scanner(System.in);

		System.out.println("\n Informe o NOME DA LOJA a para REMOVER ");
		String nomeLoja = scan.nextLine();

		for (int i = 0; i < listLoja.size(); i++) {
			if (listLoja.get(i).getNome().equalsIgnoreCase(nomeLoja)) {
				new LojaCRUD().remover(i);
				System.err.println("\n Item removido com exito");
			}
		}
	}

}