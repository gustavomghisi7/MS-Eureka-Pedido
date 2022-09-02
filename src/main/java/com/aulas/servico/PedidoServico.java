package com.aulas.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aulas.entidades.Pedido;
import com.aulas.repositorio.PedidoRepositorio;

@Service
public class PedidoServico {
	
	@Autowired
	PedidoRepositorio repo;
	
	public Pedido salvar(Pedido pedido) {
		Pedido p = repo.save(pedido);
		return p;
	}

}
