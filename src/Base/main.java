package Base;

import java.util.Calendar;

import Persistencia.AlunoCSV;
import Persistencia.Persistencia;

public class main {

	public static void main(String[] args) {
		
		Aluno a = new AlunoCSV(); // mudar a persistencia
		
		a.setNome("Igor Raimundo de Paula");
		a.setMatricula("R0UzFhHimN");
		a.setCpf("745.212.401-43");
		a.setEmail("igorraimundodepaula_@riguetti.com.br");
		
		Calendar c = Calendar.getInstance();
		c.set(2021, 04, 23);
		a.setDataNascimento(c);
		
		Persistencia p = new Persistencia(a);
		System.out.println(a.gravar(a, "teste"));
	}

}
