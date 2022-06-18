package aula11_12;

public class Ex03 {

	public static void main(String[] args) {
		//ele faz a diferenciação por causa da tabela ascii. numerações dferentes. valores são baseados na
		//subtração do primeiro pelo segundo. por isso, caso dê número negativo, significa que a ordem
		//n1 vem antes de n2
		String n1 = "tHALIA";
		String n2 = "THALIA";
		
		System.out.println(n1.equals(n2));
		System.out.println(n1.equalsIgnoreCase(n2));

	}

}
