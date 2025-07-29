package com.ironhack.clientes25bis.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ironhack.clientes25bis.Entity.Empleado;
import com.ironhack.clientes25bis.Services.EmpleadoServicio;

@RestController
@RequestMapping("/empleados")
public class EmpleadoControlador {

    @Autowired
    private EmpleadoServicio servicioEmpleado;

    @GetMapping
    public List<Empleado> listarEmpleados(){
        return servicioEmpleado.consultarEmpleados();
    }

    @GetMapping("/{id}")
    public Optional<Empleado> consultarUnEmpleado(@PathVariable Long id){
        return servicioEmpleado.buscarPorId(id);
    }

    @PostMapping
    public Empleado registrarEmpleado(@RequestBody Empleado empleadoJSON){
        return servicioEmpleado.registEmpleados(empleadoJSON);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarEmpleado(@PathVariable Long id){
        servicioEmpleado.borrarEmpleado(id);
        return ResponseEntity.noContent().build(); 
    }


}
