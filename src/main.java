import java.util.Calendar;

public class main {

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa();
		p.setNome("Victor");
		
		Aluno a= new Aluno();
		a.setNome("Igor Raimundo de Paula");
		a.setMatricula("R0UzFhHimN");
		a.setCpf("745.212.401-43");
		a.setEmail("igorraimundodepaula_@riguetti.com.br");
		
		Calendar c = Calendar.getInstance();
		a.setDataNascimento(null);
		c.set(2021, 04, 23);
		a.setDataNascimento(c);
		
	}

}
