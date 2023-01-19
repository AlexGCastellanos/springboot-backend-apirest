package tech.agarzon.springboot.apirest.models.services;

import java.util.List;

import tech.agarzon.springboot.apirest.models.entities.Cliente;

public interface IClienteService {
    
    public List<Cliente> findAll(); 
    public Cliente findById(Long id);
    public Cliente save(Cliente cliente);
    public void delete(Long id);

}
