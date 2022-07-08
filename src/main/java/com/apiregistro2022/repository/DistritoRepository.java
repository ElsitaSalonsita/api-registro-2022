
package com.apiregistro2022.repository;

import com.apiregistro2022.entity.Cliente;
import com.apiregistro2022.entity.Distrito;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;



public interface DistritoRepository extends JpaRepository<Distrito, Long>{
     @Query("select d from Distrito d where d.estado='1'")
    List<Distrito> findAllCustom();
    
}
