package com.BancoPichincha.demo.Entity;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Estados")
public class Estados {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Codigo_Estado")
    private long id;

    @Column(name = "Tipo_estado")
    private String Tipo_estado;


    @OneToMany
    @JoinColumn(name = "FKEstados")
    private List<Registro> registro = new ArrayList<>();


    public Estados() {
    }

    public Estados(long id, String tipo_estado) {
        this.id = id;
        Tipo_estado = tipo_estado;
    }

    public Estados(long id, String tipo_estado, List<Registro> registro) {
        this.id = id;
        Tipo_estado = tipo_estado;
        this.registro = registro;
    }


    public Estados(long id) {
        this.id = id;
    }

    public Estados(String tipo_estado, List<Registro> registro) {
        Tipo_estado = tipo_estado;
        this.registro = registro;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTipo_estado() {
        return Tipo_estado;
    }

    public void setTipo_estado(String tipo_estado) {
        Tipo_estado = tipo_estado;
    }

    public List<Registro> getRegistro() {
        return registro;
    }

    public void setRegistro(List<Registro> registro) {
        this.registro = registro;
    }
}
