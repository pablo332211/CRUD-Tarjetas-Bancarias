package com.BancoPichincha.demo.Entity;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Cuentas")
public class Cuentas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Codigo_cuentas")
    private long id;

    @Column(name = "Tipo_Cuenta")
    private String Tipo_Cuenta;

    @OneToMany
    @JoinColumn(name = "FKcuentas")
    private List<Registro> registro = new ArrayList<>();

    public Cuentas() {
    }

    public Cuentas(long id, String tipo_Cuenta) {
        this.id = id;
        Tipo_Cuenta = tipo_Cuenta;
    }


    public Cuentas(long id, String tipo_Cuenta, List<Registro> registro) {
        this.id = id;
        Tipo_Cuenta = tipo_Cuenta;
        this.registro = registro;
    }

    public Cuentas(long id) {
        this.id = id;
    }

    public Cuentas(String tipo_Cuenta, List<Registro> registro) {
        Tipo_Cuenta = tipo_Cuenta;
        this.registro = registro;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTipo_Cuenta() {
        return Tipo_Cuenta;
    }

    public void setTipo_Cuenta(String tipo_Cuenta) {
        Tipo_Cuenta = tipo_Cuenta;
    }

    public List<Registro> getRegistro() {
        return registro;
    }

    public void setRegistro(List<Registro> registro) {
        this.registro = registro;
    }
}
