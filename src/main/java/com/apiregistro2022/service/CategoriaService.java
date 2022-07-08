
package com.apiregistro2022.service;

import com.apiregistro2022.entity.Categoria;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author usuario
 */
public interface CategoriaService {
    //mosttar todo
    List<Categoria>findAll();
     //mosttar todo los habilitados
    List<Categoria>findAllCustom();
     //buscar por nombre
    List<Categoria>findbyName();
     //buscar por codigpo
    Optional<Categoria>findById(Long id);
    //agregar
    Categoria add(Categoria c);
    //actualizar 
    Categoria update(Categoria c);
    //eliminar
    Categoria delete(Categoria c);
    
    
}
