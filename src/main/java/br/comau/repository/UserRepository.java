package br.comau.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.comau.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
