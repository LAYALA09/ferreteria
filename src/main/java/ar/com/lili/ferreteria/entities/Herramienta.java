package ar.com.lili.ferreteria.entities;

import javax.persistence.*;

@Entity
@Table(name = "herramienta") /// le digo que este objeto Herramienta va a la tabla "herammienta2"
public class Herramienta {

    @Id // Es un id, una PK
    @GeneratedValue(strategy = GenerationType.IDENTITY) // que es autoincremental
    @Column(name = "herramienta_id") // avisa que en la DB, se llama diferente
    public Integer herramientaId;

    public String nombre;

    @Column(name = "cantidad_disponible")
    public Integer cantidadDisponible;

    public Integer getHerramientaId() {
        return herramientaId;
    }

    public void setHerramientaId(Integer herramientaId) {
        this.herramientaId = herramientaId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(Integer cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }
}
