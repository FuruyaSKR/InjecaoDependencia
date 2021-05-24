package Principal;

public class Pessoa {

private String nome;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome.length() > 0) {
			this.nome = nome;
		}
	}
}
