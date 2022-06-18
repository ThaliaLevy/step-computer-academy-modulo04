package aula05_06;

import java.util.Scanner;

public class Desafio01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite um caracter:");
		String n = ler.next();
		char m = n.charAt(0);
		//char n = ler.next().charAt(0);

		switch (m) {
		case 'a': case 'e': case 'i': case 'o': case 'u': case 'A': case 'E': case 'I': case 'O': case 'U':
			System.out.println(n + " é uma vogal.");
			break;
		case '*': case '~': case '.': case ',': case ':': case ';':
			System.out.println(n + " é uma pontuação.");
			break;
		case '1': case '2': case '3': case '4': case '5': case '6': case '7': case '8': case '9': case '0':
			System.out.println(n + " é um número.");
			break;
		case 'b': case 'B': case 'c': case 'C': case 'd': case 'D': case 'f': case 'F': case 'g': case 'G':
		case 'h': case 'H': case 'j': case 'J': case 'k': case 'K': case 'l': case 'L': case 'm':
		case 'M': case 'p': case 'P': case 'q': case 'Q': case 'r': case 'R': case 's': case 'S':
		case 't': case 'T': case 'v': case 'V': case 'W': case 'w': case 'X': case 'x': case 'Y':
		case 'y': case 'Z': case 'z':
			System.out.println(n + " é uma consoante.");
			break;
		default:
			System.out.println(n + " não é vogal, consoante, número ou pontuação.");
		}

		System.out.println("Fim do programa.");
		ler.close();
	}

}
