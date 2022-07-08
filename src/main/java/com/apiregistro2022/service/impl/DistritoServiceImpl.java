
package com.apiregistro2022.service.impl;

import com.apiregistro2022.entity.Distrito;
import com.apiregistro2022.repository.DistritoRepository;
import com.apiregistro2022.service.DistritoService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DistritoServiceImpl implements DistritoService{
    
    @Autowired
    private DistritoRepository distritoRepository;
    
    @Override
    public List<Distrito> findAll() {
       return distritoRepository.findAll();
    }

    @Override
    public List<Distrito> findAllCustom() {
        return distritoRepository.findAllCustom();
    }

    @Override
    public List<Distrito> findbyName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Optional<Distrito> findById(Long id) {
       return distritoRepository.findById(id);
    }

    @Override
    public Distrito add(Distrito d) {
        return distritoRepository.save(d);
    }

    @Override
    public Distrito update(Distrito d) {
        Distrito objDistrito = distritoRepository.getById(d.getCodigo());
        BeanUtils.copyProperties(d, objDistrito);
        return distritoRepository.save(objDistrito);
    }

    @Override
    public Distrito delete(Distrito d) {
        Distrito objDistrito = distritoRepository.getById(d.getCodigo());
        objDistrito.setEstado(false);
        return distritoRepository.save(objDistrito);
    }
    
    
}
