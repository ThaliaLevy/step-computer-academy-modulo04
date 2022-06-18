package aula07_08;

import java.util.Scanner;
import java.util.Date;

public class Ex06 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		long inicio = new Date().getTime();

		int indice = 1;
		int n;
		int cont = 0;
		System.out.println("Digite o valor:");
		n = ler.nextInt();

		while (indice <= n) {
			if (n % indice == 0) {
				cont++;
			}
			indice++;
		}

		if (cont == 2) {

			System.out.println(n + " é primo.");
		} else {
			System.out.println(n + " não é primo.");
		}
		
		long fim = new Date().getTime();
		System.out.println("Tempo gasto: " + (fim-inicio));
		ler.close();
	}
}
