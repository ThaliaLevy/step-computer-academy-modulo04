package aula23_24;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Ex04 {
	public static void escreverNoArquivo(String caminho) throws Exception {
		
		FileWriter fw = new FileWriter(caminho, true);
		BufferedWriter bw = new BufferedWriter(fw); // apaga o arquivo e escreve do zero
		bw.write("Escrevendo no arquivo3 - 1"); // Escreve no arquivo
		bw.newLine(); // cria nova linha, equivalente a pular de linha
		bw.write("Escrevendo no arquivo3 - 2");
		bw.newLine();
		bw.write("Escrevendo no arquivo3 - 3 ");
		bw.newLine();
		bw.write("Escrevendo no arquivo3 - 4");
		bw.newLine();
		System.out.println("A informação foi salva no arquivo com sucesso");
		// fecha os recursos instanciados
		bw.close();
		fw.close();
		// com este método o arquivo é sobre escrito toda vez que é executado
	}
}
