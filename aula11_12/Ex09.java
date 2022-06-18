package aula11_12;

public class Ex09 {

	public static void main(String[] args) {

		String nome = "   Thalia Araujo Levy    ";
		nome = nome.trim();
		System.out.println(nome);

		int primeiroIndice = nome.lastIndexOf(" ");
		String primeiroNome = nome.substring(7,13);
		System.out.println(primeiroIndice);
		System.out.println(primeiroNome);

	}

}
