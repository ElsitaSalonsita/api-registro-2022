
package com.apiregistro2022.repository;

import com.apiregistro2022.entity.Categoria;
import com.apiregistro2022.entity.Cliente;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface ClienteRepository extends JpaRepository<Cliente, Long> {
     @Query("select c from Cliente c where c.estado='1'")
    List<Cliente> findAllCustom();
    
    
    
}
