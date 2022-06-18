package aula23_24;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ex02 {
	public static void main(String[] args) throws IOException {
		
		String caminho = "C:\\Users\\HP\\Desktop\\teste (2).txt";
		BufferedReader br = new BufferedReader(new FileReader(caminho));
		while(br.ready()) {
			String linha = br.readLine();
			System.out.println(linha);
		}
		br.close();

	}
}
