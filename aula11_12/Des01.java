package aula11_12;

import java.util.Scanner;

public class Des01 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		String nome = ler.nextLine();
		nome = nome.trim();
		System.out.println(nome);

		int primeiroEspaco = nome.indexOf(" ");
		int ultimoEspaco = nome.lastIndexOf(" ");
		String primeiroNome = nome.substring(primeiroEspaco, ultimoEspaco);
		System.out.println(primeiroEspaco);
		System.out.println(primeiroNome);

		ler.close();

	}

}
