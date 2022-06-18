package aula09_10;

public class Ex06 {

	public static void main(String[] args) {

		int vetor[] = new int[20];
		double vetor2[] = new double[30];

		//ainda nao consegui fazer o primeiro: somente para pares.
		System.out.println("Apenas valores pares: ");
		for (int i = 0; vetor2.length > i; i++) {
			vetor2[i] = (Math.random() * 100);
			if (vetor2[i] % 2.0 == 0.0) {
				vetor[i] = vetor[i] + 1;
				
			}System.out.println((i + 1) + "° valor é: " + vetor2[i]);
			
		}

		System.out.println("Apenas valores impares: ");
		for (int j = 0; vetor.length > j; j++) {
			vetor[j] = (int) (Math.random() * 100);
			if (vetor[j] % 2 == 0) {
				vetor[j] = vetor[j] + 1;
			}
			System.out.println((j + 1) + "° valor é: " + vetor[j]);
		}

	}
}
