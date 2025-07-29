package com.ironhack.clientes25bis.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ironhack.clientes25bis.Entity.Empleado;

// extender los metodos del JPA repositorio pasandole el objeto y el tipo de la clave primaria (id)
public interface EmpleadoRepository extends JpaRepository<Empleado, Long>{
    
}
