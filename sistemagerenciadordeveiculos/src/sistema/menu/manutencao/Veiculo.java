package sistema.menu.manutencao;

import java.util.Scanner;

import sistema.menu.frenteloja.FrenteLoja;
import sistema.servico.VeiculoService;

public class Veiculo {

	public void init() {

		FrenteLoja frenteloja = new FrenteLoja();
		Manutencaocadastro cadastro = new Manutencaocadastro();

		Scanner sc = new Scanner(System.in);
		boolean loop = true;

		while (loop) {
			System.out.println("\n******** GERENCIAR VEICULOS *******");
			System.out.println(" [ 1 ] Cadastrar veículo ");
			System.out.println(" [ 2 ] Excluir veículo ");
			System.out.println(" [ 3 ] Alterar dados do veículo  ");
			System.out.println(" [ 4 ] Voltar ao Menu anterior ");

			int opcao = sc.nextInt();

			switch (opcao) {

			case 1:
				new VeiculoService().cadastrar();
				break;

			case 2:
				new VeiculoService().remover();
				break;

			case 3:
				new VeiculoService().atualizar();
				break;

			case 4:
				loop = false;
				break;

			default:
				System.err.println(" informação inválida");
			}
		}
	}
}