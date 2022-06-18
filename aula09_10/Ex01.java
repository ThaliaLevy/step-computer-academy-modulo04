package aula09_10;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.println("Digite o tamanho da altura: ");
		int altura = ler.nextInt();
		
		for(int aux = 0; altura > aux; aux++) {
			System.out.println(" ");
			for(int aux2 = 0; aux2 < aux; aux2++) {
				System.out.print("*");
			}
		}
		ler.close();
	}

}
