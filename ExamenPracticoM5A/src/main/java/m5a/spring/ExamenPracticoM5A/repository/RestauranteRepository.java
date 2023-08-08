package m5a.spring.ExamenPracticoM5A.repository;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import m5a.spring.ExamenPracticoM5A.modelo.Restaurante;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author oscar
 */
@Repository
public interface RestauranteRepository  extends MongoRepository<Restaurante, Long>{
    
}

