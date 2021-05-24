package Persistencia;

import java.io.FileWriter;
import java.io.IOException;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import Principal.Aluno;

public class AlunoJSON extends Aluno {

	private GsonBuilder builder;
	@SuppressWarnings("unused")
	private Gson gson;
	
	public String gravar(Aluno a, String fileName) {
		try {
			@SuppressWarnings("unused")
			Aluno alu = new Aluno();
			builder = new GsonBuilder();
			Gson gson = builder.create();
			
			FileWriter writer = new FileWriter((fileName)+".json");
			writer.write(gson.toJson(a));
			writer.close();
			return "JSON Gravado com Sucesso";
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "Erro";
	}
	
}
