package aula15_16;

public class Animal {

	Animal a1 = new Animal();
	String nome, idade, anoNascimento;

	public Animal() {

	}

	Animal(String n) {
		nome = n;
	}

	Animal(String n, String m) {
		nome = n;
		idade = m;
	}

	Animal(String l, String m, String n) {
		nome = l;
		idade = m;
		anoNascimento = n;
	}
}

