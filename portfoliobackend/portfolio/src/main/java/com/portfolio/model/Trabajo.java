package com.portfolio.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "trabajo")
@Getter @Setter
public class Trabajo {
     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     private Long id;
     @Basic
     private String nombre;
     private String url;
     private String git;
     private String img;
     private String description;

    public Trabajo() {
    }

    public Trabajo(Long id, String nombre, String url, String git, String img, String description) {
        this.id = id;
        this.nombre = nombre;
        this.url = url;
        this.git = git;
        this.img = img;
        this.description = description;
    }
}
