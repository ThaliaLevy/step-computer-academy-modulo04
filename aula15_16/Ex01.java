package aula15_16;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Escolha a opção desejada: ");
		System.out.println("1 - somar dois valores;");
		System.out.println("2 - somar três valores;");
		System.out.println("3 - somar quatro valores;");
		int op = ler.nextInt();

		switch (op) {

		case 1: {
			System.out.println("Digite o primeiro valor: ");
			int v1 = ler.nextInt();
			System.out.println("Digite o segundo valor: ");
			int v2 = ler.nextInt();
			somar(v1, v2);
			break;
		}
		case 2: {

			System.out.println("Digite o primeiro valor: ");
			int v1 = ler.nextInt();
			System.out.println("Digite o segundo valor: ");
			int v2 = ler.nextInt();
			System.out.println("Digite o terceiro valor: ");
			int v3 = ler.nextInt();
			somar(v1, v2, v3);
			break;
		}
		case 3: {
			System.out.println("Digite o primeiro valor: ");
			int v1 = ler.nextInt();
			System.out.println("Digite o segundo valor: ");
			int v2 = ler.nextInt();
			System.out.println("Digite o terceiro valor: ");
			int v3 = ler.nextInt();
			System.out.println("Digite o quarto valor: ");
			int v4 = ler.nextInt();
			somar(v1, v2, v3, v4);
			break;
		}
		}
	}

	public static void somar(int v1, int v2) {
		System.out.println("Soma de dois valores: " + v1 + v2);
	}

	public static void somar(int v1, int v2, int v3) {
		System.out.println("Soma de três valores: " + v1 + v2 + v3);
	}

	public static void somar(int v1, int v2, int v3, int v4) {
		System.out.println("Soma de quatro valores: " + v1 + v2 + v3 + v4);
	}
}
