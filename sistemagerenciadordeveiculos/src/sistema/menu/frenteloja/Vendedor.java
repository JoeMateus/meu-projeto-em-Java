package sistema.menu.frenteloja;

import java.util.Scanner;

import sistema.menu.manutencao.Manutencaocadastro;

public class Vendedor {

	public void init() {

		FrenteLoja frenteloja = new FrenteLoja();
		Manutencaocadastro cadastro = new Manutencaocadastro();

		Scanner sc = new Scanner(System.in);
		boolean loop = true;

		while (loop) {
			System.out.println("\n******** GERENCIAR VENDEDOR *******");
			System.out.println(" [ 1 ] Cconsultar vendedor por nome ");
			System.out.println(" [ 2 ] Voltar ao Menu anterior ");

			int opcao = sc.nextInt();

			switch (opcao) {

			case 1:
				System.out.println("Chama metódo consultar vendedor por nome");
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
