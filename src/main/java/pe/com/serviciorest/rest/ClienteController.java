package pe.com.serviciorest.rest;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.com.serviciorest.entity.Cliente;
import pe.com.serviciorest.service.ClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    
    @Autowired
    private ClienteService clienteService;
    
    @GetMapping
    public List<Cliente> findAll(){
        return clienteService.findAll();
    }
    
    //agregar
    @PostMapping
    public Cliente add(@RequestBody Cliente e){
        return clienteService.add(e);
    }
    
    // para q busque al getmapping agregar:
    @GetMapping("/{id}")
    public Optional<Cliente> findById(@PathVariable long id){
        return clienteService.findById(id);
    }
    
    //actualizar
    //         el codigo a buscar
    @PutMapping("/{id}")
    public Cliente update(@PathVariable long id,@RequestBody Cliente e){
        e.setCodigo(id);
        return clienteService.update(e);
    }
    
    @DeleteMapping("/{id}")
    public Cliente delete(@PathVariable long id){
        Cliente objcliente = new Cliente();
        objcliente.setCodigo(id);
        return clienteService.delete(Cliente.builder().codigo(id).build());
    }
   
    
}
