package aula11_12;

import java.util.Scanner;

public class Des02 {

	public static void main(String[] args) {
		
		//continuar depoisss
		Scanner ler = new Scanner(System.in);

		System.out.println("Escreva uma frase para verificar quantas vogais tem: ");
		String frase = ler.nextLine();
		frase = frase.trim();
		System.out.println(frase);

		for(int i = 0; i < frase.length(); i++) {
			String j = frase.charAt(i) + "";
			
			}
		 

		ler.close();


	}

}
