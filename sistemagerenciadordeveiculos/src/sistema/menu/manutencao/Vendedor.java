package sistema.menu.manutencao;

import java.util.Scanner;

import sistema.menu.frenteloja.FrenteLoja;

public class Vendedor {

	public void init() {

		FrenteLoja frenteloja = new FrenteLoja();
		Manutencaocadastro cadastro = new Manutencaocadastro();

		Scanner sc = new Scanner(System.in);
		boolean loop = true;

		while (loop) {
			System.out.println("\n******** MANUTENÇÃO GERENCIAR VENDEDOR *******");
			System.out.println(" [ 1 ] Cadastrar vendedor");
			System.out.println(" [ 2 ] Excluir vendedor ");
			System.out.println(" [ 3 ] Alterar dados do vendedor  ");
			System.out.println(" [ 4 ] Voltar ao Menu anterior ");

			int opcao = sc.nextInt();

			switch (opcao) {

			case 1:
				System.out.println("Chama metódo Cadastrar vendedor");
				break;

			case 2:
				System.out.println("Chama metódo Excluir vendedor");
				break;

			case 3:
				System.out.println("Chama metódo Alterar dados do vendedor");
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