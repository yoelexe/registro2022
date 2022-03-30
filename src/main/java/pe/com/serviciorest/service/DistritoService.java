package pe.com.serviciorest.service;

import java.util.List;
import java.util.Optional;
import pe.com.serviciorest.entity.Distrito;

public interface DistritoService {
    
    List<Distrito> findAll();
    Optional<Distrito> findById(Long id);
    List<Distrito> findByName(String name);
    Distrito add(Distrito d);
    Distrito update(Distrito d);
    Distrito delete(Distrito d);
    
}
