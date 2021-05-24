package Persistencia;

import Base.Aluno;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class AlunoCSV extends Aluno {

	public String gravar(Aluno a,String fileName) {
		FileWriter arq = null;
		try {
			arq = new FileWriter(fileName+".csv");
			PrintWriter gravarArq = new PrintWriter(arq);
			gravarArq.printf("%s;%s;%s;%s;%s;\n"
						, a.getNome()
						, a.getCpf()
						, a.getEmail()
						, a.getMatricula()
						, a.getDataNascimento());
			arq.close();
			return "CSV Gravado com Sucesso";
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "Erro";
	}
}
