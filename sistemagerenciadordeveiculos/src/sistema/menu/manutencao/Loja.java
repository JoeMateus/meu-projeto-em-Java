package sistema.menu.manutencao;

import java.util.Scanner;

import sistema.menu.frenteloja.FrenteLoja;
import sistema.servico.ClienteService;

public class Loja {

	public void init() {

		FrenteLoja frenteloja = new FrenteLoja();
		Manutencaocadastro cadastro = new Manutencaocadastro();

		Scanner sc = new Scanner(System.in);
		boolean loop = true;

		while (loop) {
			System.out.println("\n******** MANUTENÇÃO GERENCIAR LOJA *******");
			System.out.println(" [ 1 ] Cadastrar loja ");
			System.out.println(" [ 2 ] Excluir loja ");
			System.out.println(" [ 3 ] Alterar dados da loja  ");
			System.out.println(" [ 4 ] Voltar ao Menu anterior ");

			int opcao = sc.nextInt();

			switch (opcao) {

			case 1:
				new ClienteService().cadastrar();
				System.out.println("\nCadastrado com Sucesso!");
				break;

			case 2:
				new ClienteService().remover();
				break;

			case 3:
				new ClienteService().atualizar();
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