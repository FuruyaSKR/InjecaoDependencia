package base;
import java.util.Calendar;

public class Aluno extends Pessoa {

	private String matricula;
	private String cpf;
	private String email;
	private Calendar dataNascimento;
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		if (cpf.length() > 0) {
			this.cpf = cpf;
		}
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		if (email.length() > 0) {
			this.email = email;
		}
	}
	
	public String getDataNascimento() {
		String format = (dataNascimento.get(Calendar.DAY_OF_MONTH) + "/" + (dataNascimento.get(Calendar.MONTH) + 1)
				+ "/" + (dataNascimento.get(Calendar.YEAR)));
		return format;
	}
	
	public void setDataNascimento(Calendar dataNascimento) {
		if (dataNascimento != null) {
			this.dataNascimento = dataNascimento;
		}
	}

	public String enviar() {
		return "Teste normal Enviado com Sucesso";
	}
	
}
