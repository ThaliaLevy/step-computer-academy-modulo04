package aula23_24;

import java.io.BufferedReader;
import java.io.FileReader;

public class Ex03 {

	public static void main(String[] args) {
		String caminho = "C:\\Users\\HP\\Desktop\\teste (2).txt";
		try {
			BufferedReader br = new BufferedReader(new FileReader(caminho));
			while (br.ready()) {
				String linha = br.readLine();
				System.out.println(linha);
			}
			br.close();

		} catch (Exception e) {
			System.out.println("Erro na tentativa de ler o arquivo " + caminho);
		}

	}

}
