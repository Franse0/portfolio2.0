package com.portfolio.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "educacion")
@Getter @Setter
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Basic
    private String escuela;
    private String img_school;
    private String certificado;
    private String start;
    private String end;
    private String aval;

    public Educacion(Long id, String escuela, String img_school, String certificado, String start, String end, String aval) {
        this.id = id;
        this.escuela = escuela;
        this.img_school = img_school;
        this.certificado = certificado;
        this.start = start;
        this.end = end;
        this.aval = aval;
    }

    public Educacion() {
    }
}
