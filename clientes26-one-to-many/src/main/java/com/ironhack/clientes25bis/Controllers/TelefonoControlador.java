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

import com.ironhack.clientes25bis.Entity.Telefono;
import com.ironhack.clientes25bis.Services.TelefonoServicio;

@RestController
@RequestMapping("/telefonos")
public class TelefonoControlador {
    
    @Autowired
    private TelefonoServicio telefonoServicio;

    @GetMapping
    public List<Telefono> listarTelefonos(){
        return telefonoServicio.obtenerTodos();
    }

    @GetMapping("{id}")
    public Optional<Telefono> obtenerTelefono(@PathVariable Long id){
        return telefonoServicio.obtenerPorId(id);
    }

    @PostMapping
    public Telefono agregarTelefono(@RequestBody Telefono telefono){
        return telefonoServicio.guardarTelefono(telefono);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarTelefono(@PathVariable Long id){
        telefonoServicio.eliminarTelefono(id);
        return ResponseEntity.noContent().build();
    }

}
