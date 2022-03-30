package pe.com.serviciorest.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.serviciorest.entity.Cliente;
import pe.com.serviciorest.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService{
    
    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public List<Cliente> findAll() {
        return clienteRepository.findAllCustom();
    }

    @Override
    public Optional<Cliente> findById(Long id) {
        return clienteRepository.findById(id);
    }

    @Override
    public List<Cliente> findByName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cliente add(Cliente e) {
        return clienteRepository.save(e);
    }

    @Override
    public Cliente update(Cliente e) {
        Cliente objcliente = clienteRepository.getById(e.getCodigo());
        BeanUtils.copyProperties(e, objcliente);
        return clienteRepository.save(objcliente);
    }

    @Override
    public Cliente delete(Cliente e) {
        Cliente objcliente = clienteRepository.getById(e.getCodigo());
        objcliente.setEstado(false);
        return clienteRepository.save(objcliente);
    }
    
}
