package sistema.menu.frenteloja;

import java.util.Scanner;

import sistema.menu.manutencao.Manutencaocadastro;

public class Cliente {

	public void init() {

		FrenteLoja frenteloja = new FrenteLoja();
		Manutencaocadastro cadastro = new Manutencaocadastro();

		Scanner sc = new Scanner(System.in);
		boolean loop = true;

		while (loop) {
			System.out.println("\n******** GERENCIAR CLIENTE *******");
			System.out.println(" [ 1 ] Consultar CPF do cliente ");
			System.out.println(" [ 2 ]  Voltar ao Menu anterior ");

			int opcao = sc.nextInt();

			switch (opcao) {

			case 1:
				System.out.println("Chama o metódo consultar CPF do cliente");
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
