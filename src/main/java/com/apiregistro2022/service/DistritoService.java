
package com.apiregistro2022.service;

import com.apiregistro2022.entity.Distrito;
import java.util.List;
import java.util.Optional;


public interface DistritoService {
   //mosttar todo
    List<Distrito>findAll();
    
    List<Distrito>findAllCustom();
   
    List<Distrito>findbyName();
   
    Optional<Distrito>findById(Long id);
   
    Distrito add(Distrito d);
    
    Distrito update(Distrito d);
    
    Distrito delete(Distrito d);  
}
