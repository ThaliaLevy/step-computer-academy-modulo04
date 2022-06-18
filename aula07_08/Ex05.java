package aula07_08;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int indice = 1;
		int divisor;
		int limite;
		System.out.println("Digite o divisor:");
		divisor = ler.nextInt();

		System.out.println("Digite o limite:");
		limite = ler.nextInt();

		while (indice <= limite) {
			if (indice % divisor == 0) {
				System.out.println(indice);
			}
			indice++;
		}
		ler.close();
	}
}
