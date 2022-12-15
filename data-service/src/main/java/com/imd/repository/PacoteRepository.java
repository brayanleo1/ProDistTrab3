package com.imd.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.imd.model.Pacote;

@Repository
public interface PacoteRepository extends CrudRepository<Pacote, Long> {

	@Query(value = "DELETE FROM fabrica_pacotes WHERE pacotes_id=?1", nativeQuery=true)
    Long deleteFromFabrica(long id);
	
	@Query(value = "DELETE FROM loja_pacotes WHERE pacotes_id=?1", nativeQuery=true)
    Long deleteFromLoja(long id);
}