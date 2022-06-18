package aula07_08;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int i = 1;
		
		while(i <= 20) {
			i=i+1;
			System.out.println(i);
		}
		System.out.println("Fim do programa.");
		ler.close();
	}

}
