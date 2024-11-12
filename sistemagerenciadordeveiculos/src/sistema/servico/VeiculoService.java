package sistema.servico;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import sistema.crud.VeiculoCRUD;
import sistema.interfaces.TipodeVeiculo;
import sistema.interfaces.Veiculo;

public class VeiculoService {

	public void cadastrar() {
		Scanner scan = new Scanner(System.in);

		Veiculo v = new Veiculo();

		System.out.print("ANO: ");
		v.setAno(scan.nextInt());
		// está bugando o cód por conta q é NextInt, ai utiliza..
		scan.nextLine();

		System.out.print("MARCA: ");
		v.setMarca(scan.nextLine());

		System.out.print("MODELO: ");
		v.setModelo(scan.nextLine());

		System.out.print("PLACA: ");
		v.setPlaca(scan.nextLine());

		System.out.print("VALOR: ");
		v.setValor(scan.nextDouble());

		TipodeVeiculo tipo = new TipodeVeiculo();

		System.out.print("TIPO DE VEICULO: ");
		tipo.setCategoria(scan.next());

		System.out.print("DESCRIÇÃO DO VEICULO: ");
		tipo.setCategoria(scan.next());

		v.setTipo(tipo);

		System.out.println("\nVEÍCULO CADASTRADO!");

		new VeiculoCRUD().adicionar(v);

	}

	public void listarTodos() {
		List<Veiculo> lista = new ArrayList<>();
		lista = new VeiculoCRUD().consultar();

		if (!lista.isEmpty()) {

			System.out.println("********** IMPRIMINDO A LISTA DE VEÍCULOS ********)");
			for (Veiculo item : lista) {
				System.out.println(item.getAno() + " | " + item.getMarca() + " | " + item.getModelo() + " | "
						+ item.getPlaca() + " | " + item.getValor() + "| " + item.getTipo().getCategoria());

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

		List<Veiculo> listaVeiculos = new VeiculoCRUD().consultar();
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe a placa do veiculo para alterar os dados");
		String placa = scan.next();

		for (int i = 0; i < listaVeiculos.size(); i++) {
			if (listaVeiculos.get(i).getPlaca().equalsIgnoreCase(placa)) {
				int idVeiculo = i;

				System.out.print("ALTERAR ANO? [S/N]? ");
				listaVeiculos.get(i)
						.setAno(scan.next().equalsIgnoreCase("s") ? scan.nextInt() : listaVeiculos.get(i).getAno());
				// está bugando o cód por conta q é NextInt, ai utiliza..
				scan.nextLine();

				System.out.print(" ALTERAR MARCA? [S/N]?");
				listaVeiculos.get(i)
						.setMarca(scan.next().equalsIgnoreCase("s") ? scan.next() : listaVeiculos.get(i).getMarca());

				System.out.print(" ALTERAR MODELO? [S/N]? ");
				listaVeiculos.get(i)
						.setModelo(scan.next().equalsIgnoreCase("s") ? scan.next() : listaVeiculos.get(i).getModelo());

				System.out.print("ALTERAR VALOR? [S/N]? ");
				listaVeiculos.get(i).setValor(
						scan.next().equalsIgnoreCase("s") ? scan.nextDouble() : listaVeiculos.get(i).getValor());

				System.out.println("Alteração feita!");

				Veiculo veiculoatualizado = listaVeiculos.get(i);

				new VeiculoCRUD().alterar(idVeiculo, veiculoatualizado);

			}
		}
	}

	public void ConsultarPlaca() {

		List<Veiculo> listaVeiculos = new VeiculoCRUD().consultar();
		List<Veiculo> veiculosLocalizados = new ArrayList<Veiculo>();
		Scanner scan = new Scanner(System.in);
		boolean valido = true;

		System.out.println("Informe a placa ou o modelo para localizar um veiculo ");
		String placaModelo = scan.next();

		for (int i = 0; i < listaVeiculos.size(); i++) {
			if (listaVeiculos.get(i).getPlaca().equalsIgnoreCase(placaModelo)
					|| listaVeiculos.get(i).getModelo().equalsIgnoreCase(placaModelo)) {
				veiculosLocalizados.add(listaVeiculos.get(i));
			}
		}
		if (!veiculosLocalizados.isEmpty())
			for (Veiculo item : veiculosLocalizados) {
				System.out.println("\n********** VEÍCULO LOCALIZADO ********)");
				System.out.println(item.getAno() + " | " + item.getMarca() + " | " + item.getModelo() + " | "
						+ item.getPlaca() + " | " + item.getValor() + " | " + item.getTipo().getCategoria());
			}
		else {
			System.err.println(" Não foi possivel localizar o veiculo de placa/modelo = " + placaModelo);

		}
	}

	public void remover() {

		List<Veiculo> listaVeiculos = new VeiculoCRUD().consultar();
		Scanner scan = new Scanner(System.in);

		System.out.println("\n Informe a placa a para REMOVER ");
		String placaModelo = scan.next();

		for (int i = 0; i < listaVeiculos.size(); i++) {
			if (listaVeiculos.get(i).getPlaca().equalsIgnoreCase(placaModelo)) {
				new VeiculoCRUD().remover(i);
				System.err.println("\n Item removido com exito");
			}
		}
	}

}