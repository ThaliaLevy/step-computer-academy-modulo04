package aula21_22;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex02 {
	
	static ArrayList<Carro> listaCarro = new ArrayList<Carro>();

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		String op;

		do {
			System.out.println("Menu");
			System.out.println("Escolha a opção: ");
			System.out.println("1 - para cadastrar carro;");
			System.out.println("2 - para editar;");
			System.out.println("3 - para localizar;");
			System.out.println("4 - para excluir;");
			System.out.println("5 - para imprimir relação de carros cadastrados;");
			System.out.println("s - para sair.");

			op = ler.nextLine();

			switch (op) {
			case "1": {
				System.out.println("Digite o nome do carro: ");
				String nome = ler.nextLine();
				System.out.println("Digite a marca do carro: ");
				String marca = ler.nextLine();
				System.out.println("Digite o ano do carro: ");
				String ano = ler.nextLine();
				Carro novoCarro = new Carro(nome, marca, ano);
				listaCarro.add(novoCarro);
				System.out.println("Carro cadastrado com sucesso!");
			}
				break;

			case "2": {
				System.out.print("Digite o nome do carro a ser localizado:");
				String nomeLocalizado = ler.nextLine();
				int indice = -1;
				for (int i = 0; i < listaCarro.size(); i++) {
					if (listaCarro.get(i).getNome().equals(nomeLocalizado)) {
						System.out.println("Carro Localizado no índice " + i);
						indice = i;
					}
				}
				if (indice >= 0) {
					System.out.println("Escolha a opção: ");
					System.out.println("1 - para alterar nome;");
					System.out.println("2 - para alterar marca;");
					System.out.println("3 - para alterar ano;");
					String inf = ler.nextLine();
					Carro editadoCarro = listaCarro.get(indice);
					switch (inf) {
					case "1": {
						System.out.println("Digite o nome do carro: ");
						editadoCarro.setNome(ler.nextLine());
						break;
					}
					case "2": {

						System.out.println("Digite a marca do carro: ");
						editadoCarro.setMarca(ler.nextLine());
						break;
					}
					case "3": {

						System.out.println("Digite o ano do carro: ");
						editadoCarro.setAno(ler.nextLine());
						break;
						}
					}
					listaCarro.set(indice, editadoCarro);
					System.out.println("Carro editado e salvo com sucesso!");
				} else {
					System.out.println("Carro não localizado");
				}
				break;
			}

			case "3": {
				System.out.print("Digite o nome do carro a ser localizado: ");
				String nomeLocalizar = ler.nextLine();
				boolean naoEncontrado = true;

				for (int i = 0; i < listaCarro.size(); i++) {
					Carro c = listaCarro.get(i);
					String j = c.getNome();

					if (j.equals(nomeLocalizar)) {
						System.out.println("Carro localizado no índice " + i);
						naoEncontrado = false;
					}
				}
				if (naoEncontrado) {
					System.out.println("O nome do carro não foi localizado.");
				}
				break;
			}

			case "4": {
				System.out.print("Digite o nome do carro a ser localizado: ");
				String nomeLocalizar = ler.nextLine();
				boolean naoEncontrado = true;

				int indice = -1;
				for (int i = 0; i < listaCarro.size(); i++) {
					if (listaCarro.get(i).getNome().equals(nomeLocalizar)) {
						System.out.println("Cadastro carro excluido com sucesso.");
						naoEncontrado = false;
						indice = i;
						break;
					}
				}
				if (naoEncontrado) {
					System.out.println("O nome do carro não foi localizado");
				} else {
					listaCarro.remove(indice);
				}
				break;
			}
			case "5": {
				if (listaCarro.isEmpty()) {
					System.out.println("Lista de carros está vazia.");
				} else {
					System.out.println("Imprimindo a relação de carros cadastrados:");
					for (Carro c : listaCarro) {
						System.out.println(listaCarro.indexOf(c));
						System.out.println("Nome carro: " + c.getNome());
						System.out.println("Marca carro: " + c.getMarca());
						System.out.println("Ano carro: " + c.getAno());
					}
				}
				break;
			}
			case "6":
				System.out.println("Fim do programa.");
				break;
			default:
			}

		} while (!op.equalsIgnoreCase("s"));
		ler.close();

	}
}
