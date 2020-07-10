package br.comau.repository;


import br.comau.domain.ClienteFisica;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClienteFisicaRepository extends MongoRepository<ClienteFisica, String> {

}
