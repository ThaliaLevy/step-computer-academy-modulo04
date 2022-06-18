package aula03_04;
import java.util.Scanner;
public class Ex06 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o número 1:");
		int n1 = ler.nextInt();
		
		if(n1 == 1) {
			System.out.println("Obrigada, você digitou corretamente!");
		}
		System.out.println("Fim do programa.");
		ler.close();
	}

}
