package base;

public class Pessoa {

	private String nome;
	protected Aluno aluno;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome.length() > 0) {
			this.nome = nome;
		}
	}
}
