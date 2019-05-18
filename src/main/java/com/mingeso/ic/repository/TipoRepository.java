package com.mingeso.ic.repository;

import com.mingeso.ic.model.Tipo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface TipoRepository extends JpaRepository<Tipo, Integer> {
    List<Tipo>findAll();
    void delete(Tipo tipo_habitacion);
}
