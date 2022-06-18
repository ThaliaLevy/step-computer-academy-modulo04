package aula07_08;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		char op;
		
		System.out.println("Letra S para sair.:");
op = ler.nextLine().charAt(0);
		while (op != 's' && op != 'S') {
			System.out.println("Letra S para sair:");
			op = ler.nextLine().charAt(0);
		}
		System.out.println("Saindo do programa...");
		ler.close();

	}

}
