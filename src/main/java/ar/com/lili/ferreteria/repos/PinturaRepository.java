package ar.com.lili.ferreteria.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.com.lili.ferreteria.entities.Pintura;

@Repository
public interface PinturaRepository extends JpaRepository<Pintura, Integer>{
    
}
