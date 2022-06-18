package aula03_04;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Menu");
		System.out.println("Escolha uma das opções abaixo:");
		System.out.println("1 – Viajar");
		System.out.println("2 – Caminhar");
		System.out.println("3 – Trabalhar");
		System.out.println("4 – Dormir");
		System.out.println("5 – Sair");

		int op;
		op = ler.nextInt();
		System.out.println("Você escolheu a opção: " + op);
		ler.close();
	}

}
