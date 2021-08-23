package ar.com.lili.ferreteria.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.lili.ferreteria.entities.Herramienta;
import ar.com.lili.ferreteria.repos.HerramientaRepository;

@Service //Notacion para que springboot lo tenga en cuenta
public class HerramientaService { //negocio, capa SERVICE

    @Autowired
    private HerramientaRepository repo;

    //1. Crear una herramienta en la base de datos.
    public void crear(Herramienta herramienta){
        repo.save(herramienta); //save: grabar: le dice al repo que meta en la DB.
    }


    //2. obtener todas las herramientas
    public List<Herramienta> buscarTodas(){
        return repo.findAll(); //find ALL=> buscar todas
    }
    public Herramienta buscarPorId(Integer id) {
        
        return repo.findByHerramientaId(id);
        //repo.getById(id);
        //repo.findById(arg0)
    }
}
