package aula09_10;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int vetor[] = new int[50];

		System.out.println("Números aleatórios: ");
		for (int aux = 0, aux2 = 0; aux < vetor.length; aux++) {
			vetor[aux] = (int) (Math.random() * 100);
			System.out.println((aux + 1) + "° valor é: " + vetor[aux]);
			aux2 = aux2 + vetor[aux];
			System.out.println("Soma dos números é: " + aux2);
		}

		System.out.println("Números pares: ");
		for (int aux = 0, aux2 = 0; aux < vetor.length; aux++) {
			vetor[aux] = (int) (Math.random() * 100);
			if (vetor[aux] % 2 == 0) {
				aux2 = aux2 + vetor[aux];
				System.out.println((aux + 1) + "° valor é: " + vetor[aux]);
				System.out.println("Soma dos pares: " + aux2);
			}

		}

		System.out.println("Números impares: ");
		for (int aux = 0, aux2 = 0; aux < vetor.length; aux++) {
			vetor[aux] = (int) (Math.random() * 100);
			if (vetor[aux] % 2 != 0) {
				aux2 = aux2 + vetor[aux];
				System.out.println((aux + 1) + "° valor é: " + vetor[aux]);
				System.out.println("Soma dos impares: " + aux2);
			}

		}
		ler.close();

	}

}
