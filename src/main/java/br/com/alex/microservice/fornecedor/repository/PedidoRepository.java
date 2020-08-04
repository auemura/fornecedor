package br.com.alex.microservice.fornecedor.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.alex.microservice.fornecedor.model.Pedido;

public interface PedidoRepository extends CrudRepository<Pedido, Long>{

}
