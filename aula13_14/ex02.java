package aula13_14;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite uma fruta: ");
		String fruta = ler.nextLine();
		System.out.println("Digite uma cor: ");
		String cor = ler.nextLine();
		saudacao2(fruta, cor);
		ler.close();

	}

	public static void saudacao2(String fruta, String cor) {
		System.out.println("A fruta " + fruta + " é da cor " + cor);

	}

}
