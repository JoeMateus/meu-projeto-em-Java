package sistema.menu.manutencao;

import java.util.Scanner;

public class Manutencaocadastro {

	public void init() {

		// nao preciso declarar obrigatoriamente

		Scanner sc = new Scanner(System.in);
		boolean loop = true;

		while (loop) {
			System.out.println("\n******** MANUTENÇAO DE CADASTRO *******");
			System.out.println(" [ 1 ] Gerenciar veiculos ");
			System.out.println(" [ 2 ] Gerenciar loja ");
			System.out.println(" [ 3 ] Gerenciar vendendor ");
			System.out.println(" [ 4 ] Gerenciar cliente ");
			System.out.println(" [ 5 ] Gerenciar venda ");
			System.out.println(" [ 6 ] retornar para o menu superior ");

			int opcao = sc.nextInt();

			switch (opcao) {

			case 1:
				new Veiculo().init();
				break;

			case 2:
				new Loja().init();
				break;

			case 3:
				new Vendedor().init();
				;
				break;

			case 4:
				new Cliente().init();
				break;

			case 5:
				new Venda().init();
				break;

			case 6:
				loop = false;
				break;

			default:
				System.err.println(" informação inválida");

			}
		}
	}
}
