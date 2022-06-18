package aula03_04;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		System.out.println("Programa para verificar se é vogal. Digite a letra:");
		
		char letra = ler.next().charAt(0);
		
		if (letra == 'a') {
			System.out.println("É uma vogal!");
		}else {
			if (letra == 'e') {
				System.out.println("É uma vogal!");
			}else {
				if (letra == 'i') {
					System.out.println("É uma vogal!");
				}else {
					if (letra == 'o') {
						System.out.println("É uma vogal!");
					}else {
						if (letra == 'u') {
							System.out.println("É uma vogal!");
						}else{
							System.out.println("Não é uma vogal!");
						}
					}
				}
			}
		}
		System.out.println("Fim do programa.");
		ler.close();
		

	}

}
