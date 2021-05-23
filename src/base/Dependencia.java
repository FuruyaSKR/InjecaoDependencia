package base;

public class Dependencia {

	protected Aluno aluno;
	
	public Dependencia(Aluno aluno) {
		this.aluno = aluno;
	}
	
	public String gravarInfos() {
		return this.aluno.enviar();
	}
}
