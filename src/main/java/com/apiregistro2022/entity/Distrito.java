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

//utilizamos Loombok
@Builder 
@NoArgsConstructor 
@AllArgsConstructor 
@Data
@Entity(name = "Distrito")
@Table(name = "t_distrito")

public class Distrito implements Serializable {

    private static final long serialVersion = 1L;

    @Id
    @Column(name = "coddis")
    private long codigo;
    @Column(name = "nomdis")
    private String nombre;
    @Column(name = "estdis")
    private boolean estado;

}
