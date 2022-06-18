package aula21_22;

import java.util.ArrayList;

public class Ex01 {
	public static void main(String[] args) {

		ArrayList lista = new ArrayList();
		lista.add("Olá");
		lista.add("a");
		lista.add("todos!");
		System.out.println(lista);
		lista.size();
		lista.indexOf("a");
		lista.lastIndexOf("o");
		lista.remove("todos!");
		System.out.println(lista);
		lista.isEmpty();
		lista.clear();
		System.out.println(lista);
	}

}
