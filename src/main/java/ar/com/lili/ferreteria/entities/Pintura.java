package ar.com.lili.ferreteria.entities;

import javax.persistence.*;
@Entity
@Table(name="pintura")

public class Pintura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name= "pintura_id")
    public Integer pinturaId;

    
    public Integer getPinturaId() {
        return pinturaId;
    }

    public void setPinturaId(Integer pinturaId) {
        this.pinturaId = pinturaId;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(Integer cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    public String descripcion;
    
    @Column(name= "litro_pintura")

    public Integer litroPintura;

    public Integer getLitro() {
        return litroPintura;
    }

    public void setLitro(Integer litro) {
        this.litroPintura = litro;
    }

    public String color;

    @Column(name="cantidad_disponible")
    public Integer cantidadDisponible;

    

    

}
