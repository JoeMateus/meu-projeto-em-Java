package sistema.menu.frenteloja;

import java.util.Scanner;

import sistema.menu.manutencao.Manutencaocadastro;
import sistema.servico.LojaService;

public class Loja {

	public void init() {

		FrenteLoja frenteloja = new FrenteLoja();
		Manutencaocadastro cadastro = new Manutencaocadastro();

		Scanner sc = new Scanner(System.in);
		boolean loop = true;

		while (loop) {
			System.out.println("\n******** GERENCIAR LOJA *******");
			System.out.println(" [ 1 ] Listar todas as lojas ");
			System.out.println(" [ 2 ] Consultar Loja por Nome ou Telefone ");
			System.out.println(" [ 3 ] Voltar ao Menu anterior ");

			int opcao = sc.nextInt();

			switch (opcao) {

			case 1:
				new LojaService().listarTodos();
				break;

			case 2:
				new LojaService().ConsultarNomeTelefone();
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
