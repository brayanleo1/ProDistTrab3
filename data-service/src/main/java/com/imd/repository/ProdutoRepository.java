package com.imd.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.imd.model.Produto;

@Repository
public interface ProdutoRepository extends CrudRepository<Produto, Long> {

}
