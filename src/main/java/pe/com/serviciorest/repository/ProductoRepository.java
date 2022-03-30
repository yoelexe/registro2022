/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.serviciorest.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pe.com.serviciorest.entity.Producto;

/**
 *
 * @author Hogar
 */
public interface ProductoRepository extends JpaRepository<Producto, Long>{
    
     // mostrando todos los datos
    @Query("select p from Producto p where p.estado='1'")
    // @Query("select p.codigo, p.nombre, p.prevpro, p.cantidad, p.estado "
    //         + "from Producto p where p.estado='1'")
    List<Producto> findAllCustom();
    
    @Query("select p from Producto p where upper(p.nombre) like "
            + "upper(:nombre) and p.estado='1'")
    List<Producto> findByName(@Param("nombre") String nombre);
}
