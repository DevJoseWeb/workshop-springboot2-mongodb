package br.comau.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

import br.comau.domain.ClienteFisica;
import br.comau.dto.AuthorDTO;
import br.comau.dto.CommentDTO;
import br.comau.repository.ClienteFisicaRepository;
import br.comau.repository.PostRepository;
import br.comau.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import br.comau.domain.Post;
import br.comau.domain.User;

@Configuration
public class Instantiation implements CommandLineRunner {

	@Autowired
	private UserRepository userReposiroty;

	@Autowired
	private PostRepository postReposiroty;

	@Autowired
	private ClienteFisicaRepository clienteFisicaRepositor;

	@Override
	public void run(String... arg0) throws Exception {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		userReposiroty.deleteAll();
		postReposiroty.deleteAll();

		User maria = new User(null, "Maria Brown", "maria@gmail.com");
		User alex = new User(null, "Alex Green", "alex@gmail.com");
		User bob = new User(null, "Bob Grey", "bob@gmail.com");
		ClienteFisica herick = new ClienteFisica(null,"Herick Marques", "64525430249", "Aluno");
		ClienteFisica fred = new ClienteFisica(null,"Frederico Motha", "64525430249", "Aluno");
		ClienteFisica lou = new ClienteFisica(null,"Lourranio Simoes", "64525430249", "Aluno");
		
		userReposiroty.saveAll(Arrays.asList(maria, alex, bob));
		clienteFisicaRepositor.saveAll(Arrays.asList(herick, fred, lou));

		Post post1 = new Post(null, sdf.parse("21/03/2018"), "Partiu viagem", "Vou viajar para São Paulo. Abraços!", new AuthorDTO(maria));
		Post post2 = new Post(null, sdf.parse("23/03/2018"), "Bom dia", "Acordei feliz hoje!", new AuthorDTO(maria));

		CommentDTO c1 = new CommentDTO("Boa viagem mano!", sdf.parse("21/03/2018"), new AuthorDTO(alex));
		CommentDTO c2 = new CommentDTO("Aproveite", sdf.parse("22/03/2018"), new AuthorDTO(bob));
		CommentDTO c3 = new CommentDTO("Tenha um ótimo dia!", sdf.parse("23/03/2018"), new AuthorDTO(alex));
		
		post1.getComments().addAll(Arrays.asList(c1, c2));
		post2.getComments().addAll(Arrays.asList(c3));
		
		postReposiroty.saveAll(Arrays.asList(post1, post2));
		
		maria.getPosts().addAll(Arrays.asList(post1, post2));
		userReposiroty.save(maria);
	}

}
