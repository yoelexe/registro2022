package pe.com.serviciorest.service;

import java.util.List;
import java.util.Optional;
import pe.com.serviciorest.entity.Categoria;

public interface CategoriaService {
    
    List<Categoria> findAll();
    Optional<Categoria> findById(Long id);
    List<Categoria> findByName(String name);
    Categoria add(Categoria c);
    Categoria update(Categoria c);
    Categoria delete(Categoria c);
}
