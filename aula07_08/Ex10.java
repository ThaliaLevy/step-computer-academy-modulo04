package aula07_08;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n = 0;
		for (int i = 1; i < 10000; i=i+1) {
			if (i % 11 == 0 && i % 17 == 0) {
				n++;
				System.out.println(i);
			}
		}
		System.out.println("São " + n + " números.");
		ler.close();
	}

}
