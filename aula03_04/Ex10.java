package aula03_04;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.println("Digite o número para saber se é nulo, positivo ou negativo:");
		int n = ler.nextInt();

		if (n == 0) {
			System.out.println("Número nulo.");
		} else {
			if (n > 0) {
				System.out.println("Número positivo.");
			} else {
				System.out.println("Número negativo.");
			}

		}

		System.out.println("Fim do programa.");
		ler.close();

	}

}
