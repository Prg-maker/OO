package pessoa;

public class Pessoa {
	private String nome, cpf;
	private int idade, peso;
	
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
	
	public void Pessoa(Pessoa pessoa) {
		
		
	}
}
