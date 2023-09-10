package pessoa;

public class Pessoa {
	private String nome, cpf;
	private int idade, peso;
	// nomes de atriburos sao substantivos
	public void Pessoa(String cpf, String nome, int peso, int idade) {
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		this.cpf = cpf;
	}
	
	public void falar() {	}
	public void dormir() {}
	public void ouvir() {}
	public void acordar() {}

	public String getNome(String nome) {
		return nome;
	}
	
	public static Pessoa pessoa() {
		Pessoa pessoa = new Pessoa();
		return pessoa;
	}
}
