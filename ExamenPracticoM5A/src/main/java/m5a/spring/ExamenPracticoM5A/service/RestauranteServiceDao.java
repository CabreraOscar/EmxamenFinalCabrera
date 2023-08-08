package m5a.spring.ExamenPracticoM5A.service;

import m5a.spring.ExamenPracticoM5A.modelo.Restaurante;
import java.util.List;

public interface RestauranteServiceDao {

    //se agrega los metodos
    Restaurante save(Restaurante res);
    
    Restaurante findById(Long id);
    
    List<Restaurante> findByAll();
    
    void delete(Long id);
}
