package ar.com.lili.ferreteria.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import ar.com.lili.ferreteria.entities.Herramienta;
import ar.com.lili.ferreteria.models.response.GenericResponse;
import ar.com.lili.ferreteria.services.HerramientaService;

@RestController
public class HerramientaController {

    @Autowired
    private HerramientaService service; // aca conoce al service.

    // Endpoints
    // POST /herramientas:crear una herramienta nueva
    // POST: necesitan un payload/body
    @PostMapping("/herramientas")
    public ResponseEntity<GenericResponse> postCrear(@RequestBody Herramienta herramienta) {
        GenericResponse respuesta = new GenericResponse();

        // le digo a Service, que cree la herramienta
        service.crear(herramienta);

        respuesta.isOk = true;
        respuesta.id = herramienta.getHerramientaId();
        respuesta.message = "Herramienta creada con exito";

        // front se le devuelven HTTP STATUS CODE
        // 200: TODO OK:  status generico de que todo salio ok
        // 201: Created (creado)
        // 400: BAD REQUEST(Solicitud invalida)//para verificar
        // 401: Not Authorized, No autorizado
        // 403: Forbidden prohibido
        // 500: Internal server error: se rompio todo en el backend.

        return ResponseEntity.ok(respuesta);

    }

    // GET /herramientas: para que traiga todas las herramientas
    @GetMapping("/herramientas")
    public ResponseEntity<List<Herramienta>> getTodas() {

        List<Herramienta> lista = service.buscarTodas();

        return ResponseEntity.ok(lista);
    }
    //Enpoint que devuelve info de una herramienta usando su identificacion
    //ej GET /herramientas/5   trae info de la herramienta id: 5
    // GET /herramientas/20 trae la info de la id: 20
    @GetMapping("/herramientas/{id}") //en este caso {id} es el ID que ira variando. Se lo conoce como PathVariable
    public ResponseEntity<Herramienta> getHerramientaPorId(@PathVariable Integer id){ //id es esta con PathVarible porque esta dentro de la ruta(PATH)

        Herramienta herramienta = service.buscarPorId(id); //busco la herramienta a traves del service.

        if (herramienta != null){ //encontre la herramienta
            return ResponseEntity.ok(herramienta); //devuelvo un Ok con la herramienta encontrada
        }
        else { //devolver HTTP STATUS 404: Not Found / No encontrado
            return ResponseEntity.notFound().build();
        }
    } 

    //Endpoint que modifica una herramienta

}
