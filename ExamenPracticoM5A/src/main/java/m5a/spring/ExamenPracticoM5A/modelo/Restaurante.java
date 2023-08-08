/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package m5a.spring.ExamenPracticoM5A.modelo;

import java.util.List;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author oscar
 */
@Document(collection = "Restaurante")
@Data
public class Restaurante {
    @Id
    private Long idRestaurante;
    private String nombre;
    private String telefono;
    private String correo;
    private String direccion;
    private List<Cliente> clienteF;
    private Carta cartaF;
}
