package aula13_14;

public class ex01 {

	public static void main(String[] args) {
		String nome = "Thalia";
		saudacao();
		menu();
		saudacao2(nome);
	}
	public static void saudacao2(String nome) {
		System.out.println(nome);

	}

	public static void saudacao() {
		System.out.println("Olá!");

	}
	public static void menu() {
		
		System.out.println("Escolha uma opção: ");
		System.out.println("1 - Amarelo;");
		System.out.println("2 - Azul;");
		System.out.println("3 - Cinza;");

	}
}
