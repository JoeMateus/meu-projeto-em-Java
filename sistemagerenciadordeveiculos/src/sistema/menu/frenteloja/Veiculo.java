package sistema.menu.frenteloja;

import java.util.Scanner;

import sistema.menu.manutencao.Manutencaocadastro;
import sistema.servico.VeiculoService;

public class Veiculo {

	public void init() {

		FrenteLoja frenteloja = new FrenteLoja();
		Manutencaocadastro cadastro = new Manutencaocadastro();

		Scanner sc = new Scanner(System.in);
		boolean loop = true;

		while (loop) {
			System.out.println("\n******** GERENCIAR VEICULOS *******");
			System.out.println(" [ 1 ] Consultar veiculo por placa/modelo ");
			System.out.println(" [ 2 ] Listar todos os veículos ");
			System.out.println(" [ 3 ] Voltar ao Menu anterior ");

			int opcao = sc.nextInt();

			switch (opcao) {

			case 1:
				new VeiculoService().ConsultarPlaca();
				break;

			case 2:
				new VeiculoService().listarTodos();
				break;

			case 3:
				loop = false;
				break;

			default:
				System.err.println(" informação inválida");
			}
		}
	}
}