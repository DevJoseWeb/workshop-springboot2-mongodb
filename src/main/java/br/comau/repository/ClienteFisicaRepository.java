package br.comau.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.comau.domain.ClienteFisica;

@Repository
public interface ClienteFisicaRepository extends MongoRepository<ClienteFisica, String> {

}
