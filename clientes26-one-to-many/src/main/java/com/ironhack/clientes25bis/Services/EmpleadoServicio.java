package com.ironhack.clientes25bis.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ironhack.clientes25bis.Entity.Empleado;
import com.ironhack.clientes25bis.Repository.EmpleadoRepository;

@Service
public class EmpleadoServicio {
    
    @Autowired
    private EmpleadoRepository empleadoRepositorio;

    // consultar todos los empleados
    public List<Empleado> consultarEmpleados(){
        return (List<Empleado>) empleadoRepositorio.findAll();
    }

    // buscar uno por id
    public Optional<Empleado> buscarPorId(Long id){
        return empleadoRepositorio.findById(id);
    }

    // guardar uno
    public Empleado registEmpleados(Empleado empleado){
        return empleadoRepositorio.save(empleado);
    }

    // borrar uno
    public void borrarEmpleado(Long id){
        empleadoRepositorio.deleteById(id);
    }

}
