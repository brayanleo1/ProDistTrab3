package com.imd.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.imd.model.Fabrica;

@Repository
public interface FabricaRepository extends CrudRepository<Fabrica, Long> {

}
