package br.comau.config;

import br.comau.domain.ClienteFisica;
import br.comau.repository.ClienteFisicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;
import java.util.TimeZone;

@Configuration
public class Instantiation implements CommandLineRunner {

	@Autowired
	private ClienteFisicaRepository clienteFisicaRepositor;

	@Override
	public void run(String... arg0) throws Exception {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));

		ClienteFisica herick = new ClienteFisica(null,"Herick Marques", "64525430249", "Aluno");
		ClienteFisica fred = new ClienteFisica(null,"Frederico Motha", "64525430249", "Aluno");
		ClienteFisica lou = new ClienteFisica(null,"Lourranio Simoes", "64525430249", "Aluno");

	}

}
