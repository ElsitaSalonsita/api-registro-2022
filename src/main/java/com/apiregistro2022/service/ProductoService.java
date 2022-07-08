package com.apiregistro2022.service;

import com.apiregistro2022.entity.Producto;
import java.util.List;
import java.util.Optional;

public interface ProductoService {

    //mosttar todo
    List<Producto> findAll();
    //mosttar todo los habilitados

    List<Producto> findAllCustom();
    //buscar por nombre

    List<Producto> findbyName();
    //buscar por codigpo

    Optional<Producto> findById(Long id);

    //agregar
    Producto add(Producto p);

    //actualizar 
    Producto update(Producto p);

    //eliminar
    Producto delete(Producto p);

}
