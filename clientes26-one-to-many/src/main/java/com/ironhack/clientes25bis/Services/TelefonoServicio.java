package com.ironhack.clientes25bis.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ironhack.clientes25bis.Entity.Telefono;
import com.ironhack.clientes25bis.Repository.TelefonoRepository;

@Service
public class TelefonoServicio {
    
    @Autowired
    private TelefonoRepository telefonoRepositorio;

    // ver todos
    public List<Telefono> obtenerTodos(){
        return telefonoRepositorio.findAll();
    }

    // ver uno por id
    public Optional<Telefono> obtenerPorId(Long id){
        return telefonoRepositorio.findById(id);
    }

    // guardar uno
    public Telefono guardarTelefono(Telefono telefono){
        return telefonoRepositorio.save(telefono);
    }

    // borrar uno
    public void eliminarTelefono(Long id){
        telefonoRepositorio.deleteById(id);
    }
}
