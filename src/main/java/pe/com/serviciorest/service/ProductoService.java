package pe.com.serviciorest.service;

import java.util.List;
import java.util.Optional;
import pe.com.serviciorest.entity.Producto;

public interface ProductoService {
    
    List<Producto> findAll();
    Optional<Producto> findById(Long id);
    List<Producto> findByName(String name);
    Producto add(Producto p);
    Producto update(Producto p);
    Producto delete(Producto p);
}
