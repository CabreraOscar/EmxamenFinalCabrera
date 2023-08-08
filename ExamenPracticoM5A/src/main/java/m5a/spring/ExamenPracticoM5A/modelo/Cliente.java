/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package m5a.spring.ExamenPracticoM5A.modelo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author oscar
 */
@Data
@Document(collection="Cliente")
public class Cliente {
    @Id
    private String idCliente;
    private String nombre;
    private String telefono;
    private String correo;
    private String direccion;
}
