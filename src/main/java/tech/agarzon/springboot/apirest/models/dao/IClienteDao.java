package tech.agarzon.springboot.apirest.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import tech.agarzon.springboot.apirest.models.entities.Cliente;

public interface IClienteDao extends JpaRepository<Cliente, Long> {
    
}
