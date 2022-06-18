package aula19_20;

import java.util.Scanner;

public class Poupanca extends Conta {
	public String rendimento;

	public void cadastrar(Scanner ler) {
		System.out.println("Digite um titular da conta: ");
		titular = ler.nextLine();
		System.out.println("Digite um numero da conta: ");
		nrConta = ler.nextLine();
		System.out.println("Digite a agencia da conta: ");
		agencia = ler.nextLine();
		System.out.println("Digite um rendimento da conta: ");
		rendimento = ler.nextLine();
		System.out.println("Digite um saldo da conta: ");
		saldo = ler.nextInt();
	}

	public void exibirDados() {
		System.out.println(nrConta);

		System.out.println(agencia);

		System.out.println(rendimento);

		System.out.println(saldo);

		System.out.println(titular);

	}

	public void depositar(Scanner ler) {
		System.out.println("Dgite o valor a ser depositado: ");
		int valorDepositado = ler.nextInt();
		saldo = saldo + valorDepositado;
		System.out.println("Seu novo saldo é: " + saldo);
	}

	/*public void sacar(Scanner ler) {
		System.out.println("Digite o valor a ser sacado: ");
		int valorSacado = ler.nextInt();
		saldo = saldo - valorSacado;
		System.out.println("Seu novo saldo é: " + saldo);
	}*/

	public void sacar(int valorSacado) {
		System.out.println("Digite o valor a ser sacado: ");
		saldo = saldo - valorSacado;
		System.out.println("Seu novo saldo é: " + saldo);
	}

}
