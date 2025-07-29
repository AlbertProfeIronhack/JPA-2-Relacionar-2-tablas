package com.ironhack.clientes25bis.Entity;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "empleado")
public class Empleado{
    
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEmpleado; //standard id es Long (permite null)

    @Column(name = "nombre")
    private String nombreEmpleado;
    
    private String direccion;
    private Integer edad;
    private String puesto;

    @OneToMany(mappedBy = "empleado", cascade = CascadeType.ALL )
    @JsonManagedReference
    private List<Telefono> telefonos = new ArrayList<>();
}
