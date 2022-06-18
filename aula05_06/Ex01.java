package aula05_06;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite a velocidade do veículo:");
		int vel = ler.nextInt();

		if (vel <= 80) {
			System.out.println("Dentro da velocidade permitida.");
		} else {
			if (vel > 80 && vel <= 100) {
				System.out.println("Acima da velocidade permitida.");
			} else {
				if (vel > 100) {
					System.out.println("Muito acima da velocidade permitida.");
				}
			}
		}
		System.out.println("Fim do programa.");
		ler.close();
	}

}
