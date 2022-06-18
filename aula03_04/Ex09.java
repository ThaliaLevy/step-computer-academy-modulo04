package aula03_04;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int maior;
		int menor;

		System.out.println("Programa para verificar qual número, dentre 3, é maior:");

		System.out.println("Digite o primeiro número:");
		int n1 = ler.nextInt();
		maior = n1;
		menor = n1;

		System.out.println("Digite o segundo número:");
		int n2 = ler.nextInt();
		if (n2 > maior) {
			maior = n2;
		}
		if (n2 < menor) {
			menor = n2;
		}

		System.out.println("Digite o terceiro número:");
		int n3 = ler.nextInt();
		if (n3 > maior) {
			maior = n3;
		}
		if (n3 < menor) {
			menor = n3;
		}
		
		System.out.println("Digite o quarto número:");
		int n4 = ler.nextInt();
		if (n4 > maior) {
			maior = n4;
		}
		if (n4 < menor) {
			menor = n4;
		}
		
		System.out.println("Digite o quinto número:");
		int n5 = ler.nextInt();
		if (n5 > maior) {
			maior = n5;
		}
		if (n5 < menor) {
			menor = n5;
		}
		
		System.out.println("O maior número é " + maior);
		System.out.println("O menor número é " + menor);
		ler.close();
	}
}
