package br.com.orlandoburli.api.orders.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.orlandoburli.api.orders.model.entity.Order;

@Repository
public interface OrderRepository extends CrudRepository<Order, Integer> {

}