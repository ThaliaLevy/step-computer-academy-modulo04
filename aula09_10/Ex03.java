package aula09_10;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		String meses[] = { "janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro",
				"outubro", "novembro", "dezembro"};
		
		for (int aux = 0; aux < meses.length; aux++) {
			System.out.println(meses[aux]);
		}

		ler.close();

	}

}
