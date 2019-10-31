package br.com.orlandoburli.api.customers.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.orlandoburli.api.customers.model.entity.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {

}
