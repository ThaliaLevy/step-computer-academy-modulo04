package aula11_12;

public class Ex01 {

	public static void main(String[] args) {

		System.out.println("Colocando na ordem correta.");
		int vetor[] = new int[30];

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) (Math.random() * 100);
		}

		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}

		int aux;
		for (int i = 0; i < vetor.length - 1; i++) {
			for (int j = i + 1; j < vetor.length; j++) {
				if (vetor[i] > vetor[j]) {
					aux = vetor[i];
					vetor[i] = vetor[j];
					vetor[j] = aux;
				}
			}
		}

		System.out.println();
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}
	}
}
