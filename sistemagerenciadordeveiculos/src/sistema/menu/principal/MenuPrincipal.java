package sistema.menu.principal;

import java.util.Scanner;

import sistema.menu.frenteloja.FrenteLoja;
import sistema.menu.manutencao.Manutencaocadastro;

public class MenuPrincipal {

	public void init() {

		FrenteLoja frenteloja = new FrenteLoja();
		Manutencaocadastro cadastro = new Manutencaocadastro();

		Scanner sc = new Scanner(System.in);
		boolean loop = true;

		while (loop) {
			System.out.println("\n******** INTERFACE COM O USUARIO *******");
			System.out.println(" [ 1 ] Frente de loja ");
			System.out.println(" [ 2 ] Manuntenção de cadastro ");
			System.out.println(" [ 3 ] sair do sistema ");

			int opcao = sc.nextInt();

			switch (opcao) {

			case 1:
				frenteloja.init();
				break;

			case 2:
				cadastro.init();
				;
				break;

			case 3:
				loop = false;
				System.err.println("PROGRAMA ENCERRADO");
				break;

			default:
				System.err.println("\nINFORMAÇÃO INVÁLIDA");

			}
		}
	}
}
