package sistema.menu.frenteloja;

import java.util.Scanner;

import sistema.menu.manutencao.Manutencaocadastro;

public class Venda {

	public void init() {

		FrenteLoja frenteloja = new FrenteLoja();
		Manutencaocadastro cadastro = new Manutencaocadastro();

		Scanner sc = new Scanner(System.in);
		boolean loop = true;

		while (loop) {
			System.out.println("\n******** GERENCIAR VENDA *******");
			System.out.println(" [ 1 ] Cadastrar venda ");
			System.out.println(" [ 2 ]  Voltar ao Menu anterior ");

			int opcao = sc.nextInt();

			switch (opcao) {

			case 1:
				System.out.println("Chama o metódo cadastrar venda");
				break;

			case 2:
				loop = false;
				break;

			default:
				System.err.println(" informação inválida");
			}
		}
	}

}
