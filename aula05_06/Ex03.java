package aula05_06;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite uma vogal:");
		char n = ler.next().charAt(0);

		switch (n) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.println(n + " é uma vogal.");
			break;
		default:
			System.out.println(n + " não é uma vogal.");
		}
		System.out.println("Fim do programa.");
		ler.close();
	}

}
