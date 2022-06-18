package aula19_20;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Corrente cc = null;
		Poupanca cp = null;
		String op = null;

		do {
			System.out.println("Menu");
			System.out.println("Digite: ");
			System.out.println("1 - para cadastrar Conta Corrente;");
			System.out.println("2 - para cadastrar Conta Poupan�a;");
			System.out.println("3 - para mostrar dados Conta Corrente;");
			System.out.println("4 - para mostrar dados Conta Poupan�a;");
			System.out.println("5 - para depositar Conta Corrente;");
			System.out.println("6 - para depositar Conta Poupan�a;");
			System.out.println("7 - para sacar Conta Corrente;");
			System.out.println("8 - para sacar Conta Poupan�a;");
			System.out.println("8 - para aplicar rendimento;");
			System.out.println("s - para sair;");

			op = ler.nextLine();

			switch (op) {
			case "1": {
				cc = new Corrente();
				System.out.println("Digite o numero da conta: ");
				cc.nrConta = ler.nextLine();
				System.out.println("Digite a agencia: ");
				cc.agencia = ler.nextLine();
				System.out.println("Digite o titular da conta: ");
				cc.titular = ler.nextLine();
				System.out.println("Digite um limite da conta: ");
				cc.limite = ler.nextLine();
				System.out.println("Digite o saldo da conta: ");
				cc.saldo = ler.nextInt();

				break;
			}
			case "2": {
				cp = new Poupanca();
				cp.cadastrar(ler);

				break;
			}
			case "3": {
				if (cc == null) {
					System.out.println("Conta corrente nao cadastrada.");
				} else {
					System.out.println("Titular da conta: " + cc.titular);
					System.out.println("Agencia da conta: " + cc.agencia);
					System.out.println("Numero da conta: " + cc.nrConta);
					System.out.println("Saldo da conta: " + cc.saldo);
					System.out.println("Numero da conta: " + cc.limite);
				}
				break;
			}

			case "4": {
				if (cp == null) {
					System.out.println("Conta poupan�a nao cadastrada");
				} else {
					cp.exibirDados();
				}
				break;
			}
			case "5": {
				if (cc == null) {
					System.out.println("Conta corrente nao cadastrada.");
				} else {
					System.out.println("Dgite o valor a ser depositado: ");
					int valorDepositado = ler.nextInt();
					cc.saldo = cc.saldo + valorDepositado;
					System.out.println("Seu novo saldo �: " + cc.saldo);
				}
				break;
			}

			case "6": {
				if (cp == null) {
					System.out.println("Conta poupan�a nao cadastrada");
				} else {
					cp.depositar(ler);
				}
				break;
			}
			case "7": {
				if (cc == null) {
					System.out.println("Conta corrente nao cadastrada.");
				} else {
					System.out.println("Digite o valor a ser sacado: ");
					int valorSacado = ler.nextInt();
					if (valorSacado < 0) {
						System.out.println("Valor inv�lido.");
					}
					cc.saldo = cc.saldo - valorSacado;
					System.out.println("Seu novo saldo �: " + cc.saldo);
				}
				break;
			}

			case "8": {
				if (cp == null) {
					System.out.println("Conta poupan�a nao cadastrada");
				} else {
					System.out.println("Digite o valor a ser sacado: ");
					int valorSacado = ler.nextInt();
					cp.sacar(valorSacado);
				}
				break;
			}
			case "s": {
				System.out.println("Saindo...");

				break;
			}

			default:
				System.out.println("Comando inv�lido.");
			}
		} while (!op.equalsIgnoreCase("s"));
		ler.close();
	}
}
