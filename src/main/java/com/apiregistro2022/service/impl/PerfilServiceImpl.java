
package com.apiregistro2022.service.impl;

import com.apiregistro2022.entity.Perfil;
import com.apiregistro2022.repository.PerfilRepository;
import com.apiregistro2022.service.PerfilService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PerfilServiceImpl implements PerfilService{
     
     @Autowired
    private PerfilRepository perfilRepository;
     
    @Override
    public List<Perfil> findAll() {
        return perfilRepository.findAll();
    }

    @Override
    public List<Perfil> findAllCustom() {
        return perfilRepository.findAllCustom();
    }

    @Override
    public List<Perfil> findbyName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Optional<Perfil> findById(Long id) {
        return perfilRepository.findById(id);
    }

    @Override
    public Perfil add(Perfil p) {
        return perfilRepository.save(p);
    }

    @Override
    public Perfil update(Perfil p) {
        Perfil objPerfil = perfilRepository.getById(p.getCodigo());
        BeanUtils.copyProperties(p, objPerfil);
        return perfilRepository.save(objPerfil);
    }

    @Override
    public Perfil delete(Perfil p) {
        Perfil objPerfil = perfilRepository.getById(p.getCodigo());
        objPerfil.setEstado(false);
        return perfilRepository.save(objPerfil);
    }
    
    
}
