package br.comau.config;

import br.comau.domain.ClienteFisica;
import br.comau.repository.ClienteFisicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

@Configuration
public class Instantiation implements CommandLineRunner {

	@Autowired
	private ClienteFisicaRepository clienteFisicaRepositor;

	@Override
	public void run(String... arg0) throws Exception {
/*
		{
			"_id" : ObjectId("5f0924e50e88250480b9f0d6"),
				"id" : "1",
				"nome" : "teste",
				"cpf" : "teste",
				"tipo" : "teste",
				"endereco" : "teste",
				"telefone" : "teste",
				"email" : "teste",
				"status" : "teste",
				"empresa" : "teste",
				"vistoDataVencimento" : "teste"
		}
	*/
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));

		//ClienteFisica herick = new ClienteFisica(null,"Herick Marques", "64525430249", "Aluno", "Rua dos Java Lang", "+55 91254360", "web2ajax@gmail.com", "Ativo", "Goolgolplex", sdf.parse("21/06/2020"));
		ClienteFisica lourranio = new ClienteFisica(null,"Lourranio Simoes Marques", "64525430249", "Aluno", "Rua dos Java Lang", "+55 91254360", "web2ajax@gmail.com", "Ativo", "Goolgolplex", "21/06/2020");
		ClienteFisica fred = new ClienteFisica(null,"Fred Marques", "64525430249", "Aluno", "Rua dos Java Lang", "+55 91254360", "web2ajax@gmail.com", "Ativo", "Goolgolplex",  "21/06/2020");
		ClienteFisica maria = new ClienteFisica(null,"Maria Avila Toledo", "64525430249", "Aluno", "Rua dos Java Lang", "+55 91254360", "web2ajax@gmail.com", "Ativo", "Goolgolplex",  "21/06/2020");
		ClienteFisica pedro = new ClienteFisica(null,"Pedro Marques", "64525430249", "Aluno", "Rua dos Java Lang", "+55 91254360", "web2ajax@gmail.com", "Ativo", "Goolgolplex",  "21/06/2020");
		ClienteFisica joao = new ClienteFisica(null,"Joao Simoes Marques", "64525430249", "Aluno", "Rua dos Java Lang", "+55 91254360", "web2ajax@gmail.com", "Ativo", "Goolgolplex",  "21/06/2020");
		ClienteFisica ze = new ClienteFisica(null,"Ze Marques", "64525430249", "Aluno", "Rua dos Java Lang", "+55 91254360", "web2ajax@gmail.com", "Ativo", "Goolgolplex",  "21/06/2020");
		ClienteFisica fernandes = new ClienteFisica(null,"Fred Avila Toledo", "64525430249", "Aluno", "Rua dos Java Lang", "+55 91254360", "web2ajax@gmail.com", "Ativo", "Goolgolplex",  "21/06/2020");
		clienteFisicaRepositor.saveAll(Arrays.asList(lourranio,fred,maria,pedro,joao,ze,fernandes));
	}
}
