
package com.apiregistro2022.repository;

import com.apiregistro2022.entity.Perfil;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface PerfilRepository extends JpaRepository<Perfil, Long>{
    
    @Query("select p from Perfil p where p.estado='1'")
    List<Perfil> findAllCustom();
}
