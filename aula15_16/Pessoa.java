package aula15_16;

public class Pessoa {

	String nomeCompleto; //, nomeMae, nomePai, endereco, sexo, dataNascimento, altura, peso, celular
	
	public String primeiroNome() {
		return nomeCompleto.substring(0, nomeCompleto.indexOf(" "));
	}
	
	public String ultimoNome() {
		return nomeCompleto.substring(nomeCompleto.lastIndexOf(" "));
	}
}
