package com.portfolio.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "consulta")
@Getter @Setter
public class Consulta {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Basic
    private String nombre;
    private String mail;
    private String consulta;

    public Consulta() {
    }

    public Consulta(Long id, String nombre, String mail, String consulta) {
        this.id = id;
        this.nombre = nombre;
        this.mail = mail;
        this.consulta = consulta;
    }
}
