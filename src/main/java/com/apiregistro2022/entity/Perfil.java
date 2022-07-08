
package com.apiregistro2022.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder 
@NoArgsConstructor 
@AllArgsConstructor 
@Data
@Entity(name = "Perfil")
@Table(name = "t_perfil")


public class Perfil implements Serializable{
     private static final long serialVersion=1L;
     
    @Id
    @Column(name = "codper")
    private long codigo;
    @Column(name = "nomper")
    private String nombre;
    
    @Column(name = "estper")
    private boolean estado;
}
