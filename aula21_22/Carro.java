package aula21_22;

public class Carro {
	private String nome, marca, ano;

	Carro(String nome, String marca, String ano) {
		this.nome = nome;
		this.marca = marca;
		this.ano = ano;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}
}
