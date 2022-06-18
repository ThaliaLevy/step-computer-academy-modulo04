package aula13_14;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		System.out.println("Escolha um opção abaixo.");
		System.out.println("Digite 1 - para somar.");
		System.out.println("Digite 2 - para subtrair.");
		System.out.println("Digite 3 - para dividir.");
		System.out.println("Digite 4 - para multiplicar.");
		System.out.println("Digite 5 - para sair.");
		int op = ler.nextInt();

		switch (op) {
		case 1:

			somar();
			break;
		case 2: {
			System.out.println("subtraindo 2 valores");
			System.out.println(" Digite o 1º numero");
			int n1 = ler.nextInt();
			System.out.println(" Digite o 2º numero");
			int n2 = ler.nextInt();
			subtrair(n1, n2);
			break;
		}
		case 3: {
			System.out.println("Dividindo");
			System.out.println(" Digite o 1º numero");
			int n1 = ler.nextInt();
			System.out.println(" Digite o 2º numero");
			int n2 = ler.nextInt();
			System.out.println("O resultado da divisao é " + divisao(n1, n2));

			break;
		}
		case 4:

			break;

		default:
			break;
		}
		System.out.println("Fim do programa");
	}

	static double divisao(int v1, int v2) {
		return v1 / v2;
	}

	// declarando um metodo void
	static void somar() {
		Scanner ler = new Scanner(System.in);
		System.out.println("Somando 2 valores");
		System.out.println(" Digite o 1º numero");
		int n1 = ler.nextInt();
		System.out.println(" Digite o 2º numero");
		int n2 = ler.nextInt();
	}

	static void subtrair(int v1, int v2) {
		System.out.println(" A subtração é " + (v1 - v2));
	}
	

}
