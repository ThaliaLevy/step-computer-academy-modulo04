package aula03_04;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		String nome;
		String sobrenome;
		Scanner ler = new Scanner(System.in);
		System.out.println("Bem vindo!");
		System.out.println("Digite seu nome:");
		nome = ler.next();
		
		System.out.println("Digite seu sobrenome:");
		sobrenome = ler.next(); 
		
		System.out.println("Seu nome complto é " + nome + " " + sobrenome);
		ler.close();
	}

}
