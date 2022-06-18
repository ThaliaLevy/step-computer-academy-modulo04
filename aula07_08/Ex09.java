package aula07_08;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		for(int i = 1; i < 1000; i=i+1) {
			if(i%11==0) {

				System.out.println(i);
			}
		}

		ler.close();
	}

}
