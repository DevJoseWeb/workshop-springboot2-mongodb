package br.comau.repository;

import br.comau.domain.ClienteFisica;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface ClienteFisicaRepository extends MongoRepository<ClienteFisica, String> {

    //@Transactional(readOnly=true)
   // Page<ClienteFisica> findByClienteFisica(Pageable pageRequest);

}
