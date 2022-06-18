package aula09_10;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite o tamanho da altura: ");
		int altura = ler.nextInt();
		System.out.println("Digite o tamanho da base: ");
		int base = ler.nextInt();

		for (int aux = 1; base >= aux; aux++) {
			for (int aux2 = 1; altura >= aux2; aux2++) {
				if (aux2 == altura || aux == base || aux2 == 1 || aux == 1) {
					System.out.print("@");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
		ler.close();

	}

}
