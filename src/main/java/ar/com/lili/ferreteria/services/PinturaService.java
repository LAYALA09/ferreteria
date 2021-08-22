package ar.com.lili.ferreteria.services;

import java.util.List;

import org.springframework.stereotype.Service;


import ar.com.lili.ferreteria.entities.Pintura;
import ar.com.lili.ferreteria.repos.PinturaRepository;

@Service
public class PinturaService {

    private PinturaRepository repo;
    
    public void crear(Pintura pintura){
        repo.save(pintura);
        
    }
    public List<Pintura>buscarTodas(){
        return repo.findAll();

    }

    
    
}
