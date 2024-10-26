package pessoa;

public class Pessoa {
	private String nome;
	private double altura;
	private int idade;
	private String[] pessoasDados;
	
	public Pessoa(String nome, double altura, int idade) {
		this.nome = nome;
		this.altura = altura;
		this.idade = idade;
	}
	
	public Pessoa(String[] pessoas) {
		this.pessoasDados = pessoas;
	}



	public String[] getPessoasDados() {
		return pessoasDados;
	}

	public void setPessoasDados(String[] pessoasDados) {
		this.pessoasDados = pessoasDados;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
}
