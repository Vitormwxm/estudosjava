
public class Aluno {
	private String matricula;
	private String cpf;
	private String nome;
	private TipoAluno tipoAluno;
	private int idade;
	
	public Aluno (String nome , String cpf, TipoAluno tipoAluno){
		this.nome = nome;
		this.cpf = cpf;
		this.tipoAluno = tipoAluno;
	}
	
	public TipoAluno getAluno() {
		return tipoAluno;
	}
	
	public void setAluno (TipoAluno tipoAluno) {
		this.tipoAluno = tipoAluno;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String newNome) {
		this.nome = newNome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int newIdade) {
		this.idade = newIdade;
	}
	
	public String getCpf () {
		return cpf;
	}
}
