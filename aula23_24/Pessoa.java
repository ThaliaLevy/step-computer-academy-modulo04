package aula23_24;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Pessoa {
	static void cadastrarPessoas(String caminho, String nome, String idade, String cidade) {
		try {
		BufferedWriter bw = new BufferedWriter(new FileWriter(caminho, true));
		bw.write(nome + "|" + idade + "@" + cidade);
		bw.newLine();
		bw.close();
		System.out.println("\nAs Informações foram salvas com sucesso.");
		}catch (Exception e) {
		System.out.println(e);
		}
		
}}
