package aula07_08;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int i = 1;

		while (i <= 400) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			i++;
		}
		System.out.println("Fim do programa.");
		ler.close();

	}

}
