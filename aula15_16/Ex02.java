package aula15_16;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Pessoa p1 = new Pessoa();

		System.out.println("Nome completo: ");
		p1.nomeCompleto = ler.nextLine();
//
//		System.out.println("Nome da m�e: ");
//		p1.nomeMae = ler.nextLine();
//
//		System.out.println("Nome do pai: ");
//		p1.nomePai = ler.nextLine();
//
//		System.out.println("Endere�o: ");
//		p1.endereco = ler.nextLine();
//
//		System.out.println("Sexo: ");
//		p1.sexo = ler.nextLine();
//
//		System.out.println("Altura: ");
//		p1.altura = ler.nextLine();
//
//		System.out.println("Peso: ");
//		p1.peso = ler.nextLine();
//
//		System.out.println("Celular: ");
//		p1.celular = ler.nextLine();
//
//		System.out.println("Data nascimento: ");
//		p1.dataNascimento = ler.nextLine();
//
//		System.out.println("Nome completo: " + p1.nomeCompleto);
//		System.out.println("Nome m�e: " + p1.nomeMae);
//		System.out.println("Nome pai: " + p1.nomePai);
//		System.out.println("Endere�o: " + p1.endereco);
//		System.out.println("Sexo: " + p1.sexo);
//		System.out.println("Altura: " + p1.altura);
//		System.out.println("Peso: " + p1.peso);
//		System.out.println("Celular: " + p1.celular);
//		System.out.println("Data nascimento: " + p1.dataNascimento);
		System.out.println("Primeiro nome: " + p1.primeiroNome());
		System.out.println("Ultimo nome: " + p1.ultimoNome());

//		Pessoa p2 = new Pessoa();
//		System.out.println("Data nascimento: ");
//		p2.dataNascimento = ler.nextLine();
//		System.out.println("Data nascimento: " + p2.dataNascimento);
		
		ler.close();
	}
}
