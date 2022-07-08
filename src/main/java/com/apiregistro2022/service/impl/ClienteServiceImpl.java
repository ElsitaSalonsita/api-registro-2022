package com.apiregistro2022.service.impl;

import com.apiregistro2022.entity.Cliente;
import com.apiregistro2022.repository.ClienteRepository;
import com.apiregistro2022.service.ClienteService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public List<Cliente> findAll() {
        return clienteRepository.findAll();
    }

    @Override
    public List<Cliente> findAllCustom() {
        return clienteRepository.findAllCustom();
    }

    @Override
    public List<Cliente> findbyName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Optional<Cliente> findById(Long id) {
        return clienteRepository.findById(id);
    }

    @Override
    public Cliente add(Cliente c) {
        return clienteRepository.save(c);
    }

    @Override
    public Cliente update(Cliente c) {
        Cliente objCliente = clienteRepository.getById(c.getCodigo());
        BeanUtils.copyProperties(c, objCliente);
        return clienteRepository.save(objCliente);
    }

    @Override
    public Cliente delete(Cliente c) {
       
        Cliente objCliente = clienteRepository.getById(c.getCodigo());
        objCliente.setEstado(false);
        return clienteRepository.save(objCliente);
    }

}
