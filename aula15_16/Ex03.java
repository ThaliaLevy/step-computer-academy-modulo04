package aula15_16;

public class Ex03 {

	public static void main(String[] args) {
		

		Animal a1 = new Animal();
		
		Animal a2 = new Animal("");
		System.out.println(a2.nome);
		
		Animal a3 = new Animal();
		System.out.println(a3.nome + a3.idade);
	
		Animal a4 = new Animal();
		System.out.println(a1.nome + a1.idade + a1.anoNascimento);

	}

}
