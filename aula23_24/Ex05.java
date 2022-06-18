package aula23_24;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		String caminho = ("C:\\Users\\HP\\Desktop\\ex05.txt");
		String op;
		

		Scanner ler = new Scanner(System.in);
		System.out.println("Menu\n====");
		System.out.println("Escolha uma das opções abaixo:");
		System.out.println("1 - para cadastrar uma pessoa");
		System.out.println("2 - para imprimir primeiro formato da lista de pessoas");
		System.out.println("3 - para localizar uma pessoa;");
		op = ler.nextLine();

		switch (op) {

		case "1":
			System.out.print("Digite um nome: ");
			String nome = ler.nextLine();
			System.out.print("Digite uma idade: ");
			String idade = ler.nextLine();
			System.out.print("Digite uma cidade: ");
			String cidade = ler.nextLine();
			System.out.print("Digite UF: ");
			String uf = ler.nextLine();
			System.out.print("Digite um cpf: ");
			String cpf = ler.nextLine();
			cadastrarPessoas(caminho, nome, idade, cidade, cpf, uf);
			break;

		case "2":
			imprimirArquivoLinha(caminho);
			break;

		case "3":
			System.out.println("Digite o nome a ser localizado: ");
			String nomeLoc = ler.nextLine();
			 localizarArquivo(nomeLoc, caminho);
			break;

		default:
			System.out.println("Opção não é válida.");
		}
	}

	static void cadastrarPessoas(String caminho, String nome, String idade, String cidade, String uf, String cpf) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(caminho, true));
			bw.write(nome + "#" + idade + "#" + cidade + "#" + uf + "#" + cpf);
			bw.newLine();
			bw.close();
			System.out.println("\nInformações salvas com sucesso!");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	static void imprimirArquivoLinha(String caminho) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(caminho));
			String linha;
			System.out.println("Imprimindo relação de nomes salvos no arquivo:");
			while (br.ready()) {
				linha = br.readLine();
				System.out.println(linha);
			}
			br.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static String[] localizarArquivo(String nomeLoc, String caminho) {
		try {
			BufferedReader ler = new BufferedReader(new FileReader(caminho));
			System.out.println("Localizando arquivo:");
			String[] vetor;
			
			while (ler.ready()) {
				ler.ready();
				
				String aux = ler.readLine();
				vetor = aux.split("#");

				if (vetor[0].equalsIgnoreCase(nomeLoc)) {
					System.out.println("Arquivo localizado!");
					return vetor;

				}
				ler.close();
			}

			return null;

		} catch (IOException e) {
			System.out.println("Erro ao localizar nome!");
		}
		return null;

	}
}
