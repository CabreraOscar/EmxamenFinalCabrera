/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package m5a.spring.ExamenPracticoM5A.service;

import m5a.spring.ExamenPracticoM5A.modelo.Restaurante;
import m5a.spring.ExamenPracticoM5A.repository.RestauranteRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RestauranteServiceImpl implements RestauranteServiceDao {

    @Autowired
    RestauranteRepository resRepo;
    
    @Override
    public Restaurante save(Restaurante res) {

        return resRepo.save(res);

    }

    @Override
    public Restaurante findById(Long id) {

        Optional<Restaurante> objRes = resRepo.findById(id);
        if (objRes.isPresent()) {
            return objRes.get();
        }
        return null;
    }

    @Override
    public List<Restaurante> findByAll() {

        return resRepo.findAll();

    }

    @Override
    public void delete(Long id) {

        resRepo.deleteById(id);

    }

}
