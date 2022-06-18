package aula07_08;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		for (int i = 1; i <= 10000; i=i+1) {
			if (i % 12 == 0 && i % 25 == 0) {
				System.out.println(i);
				break;
			}
		}
		ler.close();

	}

}
