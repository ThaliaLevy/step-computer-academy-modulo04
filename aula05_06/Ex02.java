package aula05_06;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Programa para verificar qual número é maior:");

		System.out.println("Digite o primeiro número:");
		int n1 = ler.nextInt();
		System.out.println("Digite o segundo número:");
		int n2 = ler.nextInt();
		System.out.println("Digite o terceiro número:");
		int n3 = ler.nextInt();
		System.out.println("Digite o quarto número:");
		int n4 = ler.nextInt();
		System.out.println("Digite o quinto número:");
		int n5 = ler.nextInt();
		System.out.println("Digite o sexto número:");
		int n6 = ler.nextInt();

		if (n1 >= n2 && n1 >= n3 && n1 >= n4 && n1 >= n5 && n1 >= n6) {
			System.out.println(n1 + " é o maior valor.");
		} else {
			if (n2 >= n3 && n2 >= n4 && n3 >= n5 && n2 >= n6) {
				System.out.println(n2 + " é o maior valor.");
			} else {
				if (n3 >= n4 && n3 >= n5 && n3 >= n6) {
					System.out.println(n3 + " é o maior valor.");
				} else {
					if (n4 >= n5 && n4 >= n6) {
						System.out.println(n4 + " é o maior valor.");
					} else {
						if (n5 >= n6) {
							System.out.println(n5 + " é o maior valor.");
						} else {
							System.out.println(n6 + " é o maior valor.");
						}
					}
				}
				System.out.println("Fim do programa.");
				ler.close();

			}
		}
	}
}
