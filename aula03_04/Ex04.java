package aula03_04;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {

		int num1, num2;

		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o primeiro número:");
		num1 = ler.nextInt();

		System.out.println("Digite o segundo número:");
		num2 = ler.nextInt();

		System.out.println("A soma é = " + (num1 + num2));
		System.out.println("A subtração é = " + (num1 - num2));
		System.out.println("A multiplicação é = " + (num1 * num2));
		System.out.println("A divisão é = " + (num1 / num2));

		ler.close();
	}

}
