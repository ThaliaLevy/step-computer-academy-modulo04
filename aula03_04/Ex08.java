package aula03_04;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.println("Digite a palavra 'sair':");
		String n1 = ler.nextLine();

		if (n1.equals("sair")) {
			System.out.println("Saindo do programa...");
		} else {
			System.out.println("Comando inválido.");
		}
		System.out.println("Fim do programa.");
		ler.close();
	}

}
