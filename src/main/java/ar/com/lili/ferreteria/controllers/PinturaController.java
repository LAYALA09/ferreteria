package ar.com.lili.ferreteria.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import ar.com.lili.ferreteria.entities.Pintura;
import ar.com.lili.ferreteria.models.response.GenericResponse;
import ar.com.lili.ferreteria.services.PinturaService;

@RestController
public class PinturaController {
    @Autowired 
    private PinturaService service; 
    
    @PostMapping("/pinturas")
    public ResponseEntity<GenericResponse>postCrear(@RequestBody Pintura pintura){

    GenericResponse respuesta= new GenericResponse();
    service.crear(pintura);
    respuesta.isOk=true;
    respuesta.id = pintura.getPinturaId();
    respuesta.message = "Pintura creada con exito";
    return ResponseEntity.ok(respuesta);
    
}

@GetMapping("/pinturas")
public ResponseEntity<List<Pintura>>getTodas(){
    List<Pintura> lista = service.buscarTodas();
    return ResponseEntity.ok(lista);
    
}
}
