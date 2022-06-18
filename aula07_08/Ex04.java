package aula07_08;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int op;

		System.out.println("Digite a nota:");
		op = ler.nextInt();
		while (op < 0 || op > 100) {
			System.out.println("Digite a nota:");
			op = ler.nextInt();
		}
		System.out.println("Sua nota é: " + op);
		ler.close();

	}

}
