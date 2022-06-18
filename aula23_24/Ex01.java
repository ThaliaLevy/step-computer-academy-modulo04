package aula23_24;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex01 {
	
	//throws joga p problema p frente, não resolve
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("C:\\Users\\HP\\Desktop\\teste (2).txt");
		Scanner ler = new Scanner(file);
		String linha;
		while (ler.hasNext()) {
			linha = ler.nextLine();
			System.out.println(linha);
		}
		ler.close();

	}

}
