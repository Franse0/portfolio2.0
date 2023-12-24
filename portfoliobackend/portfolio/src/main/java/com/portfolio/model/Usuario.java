package com.portfolio.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Table
@Entity(name = "usuario")
@Getter @Setter
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Basic
    private String nombre;
    private String apellido;
    private String sobre_mi;
    private String nacionalidad;
    private String mail;
    private String ocupacion;

    public Usuario(Long id, String nombre, String apellido, String sobre_mi, String nacionalidad, String mail, String ocupacion) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sobre_mi = sobre_mi;
        this.nacionalidad = nacionalidad;
        this.mail = mail;
        this.ocupacion = ocupacion;
    }

    public Usuario() {
    }
}
