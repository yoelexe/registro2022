package pe.com.serviciorest.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pe.com.serviciorest.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

    @Query("select e from Cliente e where e.estado='1'")
    List<Cliente> findAllCustom();
    
    /*
    @Query("select e from Cliente e where upper(e.nombre) like "
            + "upper(:nombre) and e.estado='1'")
    List<Cliente> findByName(@Param("nombre") String nombre);
    */
    
}
