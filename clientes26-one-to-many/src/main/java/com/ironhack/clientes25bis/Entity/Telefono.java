package com.ironhack.clientes25bis.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name="telefono")
public class Telefono {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String numero;

    @ManyToOne
    @JoinColumn(name = "empleado_id")
    @JsonBackReference
    private Empleado empleado;

}
