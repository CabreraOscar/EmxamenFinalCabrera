/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package m5a.spring.ExamenPracticoM5A.controller;

import m5a.spring.ExamenPracticoM5A.modelo.Restaurante;
import m5a.spring.ExamenPracticoM5A.service.RestauranteServiceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author oscar
 */
@RestController
@RequestMapping("/api/restaurante")
public class RestauranteController {
    @Autowired
    RestauranteServiceImpl serviImp;

            
    @GetMapping("/listar")
    public ResponseEntity<List<Restaurante>> listarRestaurante(){
       
        return new ResponseEntity<>(serviImp.findByAll(),HttpStatus.OK);
    }
    
 
    @PostMapping("/crear")
    public ResponseEntity<Restaurante> crearRestaurante(@RequestBody Restaurante r){
        return new ResponseEntity<>(serviImp.save(r),HttpStatus.OK);
        
    }
    
    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Restaurante>  actualizarRestaurante(@PathVariable Long id, @RequestBody Restaurante r){
        Restaurante res= serviImp.findById(id);
        if(res == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }else{
            r.setIdRestaurante(id);
            return new ResponseEntity<>(serviImp.save(r),HttpStatus.OK);
                    
        }
    }
    
    @DeleteMapping("/eliminar/{id}")
     public ResponseEntity<Restaurante> eliminarProducto(@PathVariable Long id) {
        serviImp.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
  
}
