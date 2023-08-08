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
@Data
@Document(collection="Carta")
public class Carta {
    @Id
    private String idCarta;
    private String nombre;
    private String categoria;
    private int cantidad;
    private List<Plato> platoF;
}
