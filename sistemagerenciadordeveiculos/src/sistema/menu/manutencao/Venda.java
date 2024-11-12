package sistema.menu.manutencao;

import java.util.Scanner;

import sistema.menu.frenteloja.FrenteLoja;

public class Venda {

	public void init() {

		FrenteLoja frenteloja = new FrenteLoja();
		Manutencaocadastro cadastro = new Manutencaocadastro();

		Scanner sc = new Scanner(System.in);
		boolean loop = true;

		while (loop) {
			System.out.println("\n******** MANUTENÇÃO GERENCIAR VENDA *******");
			System.out.println(" [ 1 ] Cadastrar venda");
			System.out.println(" [ 2 ] Excluir venda ");
			System.out.println(" [ 3 ] Alterar dados do venda  ");
			System.out.println(" [ 4 ] Voltar ao Menu anterior ");

			int opcao = sc.nextInt();

			switch (opcao) {

			case 1:
				System.out.println("Chama metódo Cadastrar venda");
				break;

			case 2:
				System.out.println("Chama metódo Excluir venda");
				break;

			case 3:
				System.out.println("Chama metódo Alterar dados da venda");
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