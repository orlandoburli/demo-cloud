package br.com.orlandoburli.api.products.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.orlandoburli.api.products.model.entity.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {

}