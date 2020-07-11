package br.comau.repository;

import br.comau.domain.ClienteFisica;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteFisicaRepository extends MongoRepository<ClienteFisica, String> {

}
