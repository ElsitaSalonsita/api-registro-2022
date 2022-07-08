
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

@Builder 
@NoArgsConstructor 
@AllArgsConstructor 
@Data
@Entity(name = "Cliente")
@Table(name = "t_cliente")

public class Cliente implements Serializable {
    private static final long serialVersion = 1L;

    @Id
    @Column(name = "codcli")
    private long codigo;
    @Column(name = "nomcli")
    private String nombre;
     @Column(name = "apepcli")
    private String apellidopaterno;
    @Column(name = "apemcli")
    private String apellidomaterno;
    @Column(name = "dnicli")
    private String dni;
    @Column(name = "dircli")
    private String direccion;
    @Column(name = "telcli")
    private String telefono;
    @Column(name = "celcli")
    private String celular;
    @Column(name = "corcli")
    private String correo;
    @Column(name = "sexcli")
    private String sexo;
    
    @Column(name = "estcli")
    private boolean estado;
    
    @ManyToOne
    @JoinColumn(name = "coddis", nullable = true)
    private Distrito distrito;

    

    
}
