
package com.springB.demo1.modelo;
import lombok.Data;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name ="usuarios")
@Data
public class Usuario implements Serializable {
    
    private static final long serialVersionUID =1L;
    @Id
    private String cedula;
    
    private String clave;
    private String nombre;
    private String email;
}
