
package com.apiregistro2022.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Entity(name = "Empleado")
@Table(name = "t_empleado")

public class Empleado implements Serializable{
    private static final long serialVersion = 1L;

    @Id
    @Column(name = "codemp")
    private long codigo;
    @Column(name = "nomemp")
    private String nombre;
    @Column(name = "apepemp")
    private String apellidopaterno;
    @Column(name = "apememp")
    private String apellidomaterno;
    @Column(name = "dniemp")
    private String dni;
    @Column(name = "diremp")
    private String direccion;
    @Column(name = "telemp")
    private String telefono;
    @Column(name = "celemp")
    private String celular;
    @Column(name = "coremp")
    private String correo;
    @Column(name = "sexemp")
    private String sexo;
    @Column(name = "usuemp")
    private String usuario;
    @Column(name = "claemp")
    private String clave;
    
    @Column(name = "estemp")
    private boolean estado;
    
    @ManyToOne
    @JoinColumn(name = "coddis", nullable = false)
    private Distrito distrito;
    @JoinColumn(name = "codper", nullable = false)
    private Perfil perfil;
    
    
    
}
