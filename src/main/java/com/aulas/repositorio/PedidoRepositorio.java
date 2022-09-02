package com.aulas.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aulas.entidades.Pedido;

@Repository
public interface PedidoRepositorio extends JpaRepository<Pedido, Long>{

}
