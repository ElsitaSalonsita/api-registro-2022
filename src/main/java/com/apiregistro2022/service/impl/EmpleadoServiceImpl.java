package com.apiregistro2022.service.impl;

import com.apiregistro2022.entity.Empleado;
import com.apiregistro2022.repository.EmpleadoRepository;
import com.apiregistro2022.service.EmpleadoService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {

    @Autowired
    private EmpleadoRepository empleadoRepository;

    @Override
    public List<Empleado> findAll() {
         return empleadoRepository.findAll();
    }

    @Override
    public List<Empleado> findAllCustom() {
       return empleadoRepository.findAllCustom();
    }

    @Override
    public List<Empleado> findbyName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Optional<Empleado> findById(Long id) {
      return empleadoRepository.findById(id);
    }

    @Override
    public Empleado add(Empleado e) {
      return empleadoRepository.save(e);
    }

    @Override
    public Empleado update(Empleado e) {
       Empleado objEmpleado = empleadoRepository.getById(e.getCodigo());
        BeanUtils.copyProperties(e, objEmpleado);
        return empleadoRepository.save(objEmpleado);
    }
    
    @Override
    public Empleado delete(Empleado e) {
        Empleado objEmpleado = empleadoRepository.getById(e.getCodigo());
        objEmpleado.setEstado(false);
        return empleadoRepository.save(objEmpleado);
    }

}
