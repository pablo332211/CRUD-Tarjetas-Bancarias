package com.BancoPichincha.demo.Entity;


import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;


@Entity
@Table(name = "Registro")
public class Registro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Registro")
    private long id;


    @Temporal(TemporalType.DATE)
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @Column(name = "Fecha_registro")
    private Date Fecha_registro;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @Column(name = "Fecha_final")
    private Date  Fecha_final;

    @Column(name = "Observaciones")
    private String Observaciones;

    @ManyToOne
    @JoinColumn(name = "FKEstados")
    private Estados  estados;

    @ManyToOne
    @JoinColumn(name = "FKcuentas")
    private Cuentas cuentas;

    public Registro() {
    }

    public Registro(long id) {
        this.id = id;
    }

    public Registro(Date fecha_registro, Date fecha_final, String observaciones, Estados estados, Cuentas cuentas) {
        Fecha_registro = fecha_registro;
        Fecha_final = fecha_final;
        Observaciones = observaciones;
        this.estados = estados;
        this.cuentas = cuentas;
    }

    public Registro(long id, Date fecha_registro, Date fecha_final, String observaciones, Estados estados, Cuentas cuentas) {
        this.id = id;
        Fecha_registro = fecha_registro;
        Fecha_final = fecha_final;
        Observaciones = observaciones;
        this.estados = estados;
        this.cuentas = cuentas;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getFecha_registro() {
        return Fecha_registro;
    }

    public void setFecha_registro(Date fecha_registro) {
        Fecha_registro = fecha_registro;
    }

    public Date getFecha_final() {
        return Fecha_final;
    }

    public void setFecha_final(Date fecha_final) {
        Fecha_final = fecha_final;
    }

    public String getObservaciones() {
        return Observaciones;
    }

    public void setObservaciones(String observaciones) {
        Observaciones = observaciones;
    }

    public Estados getEstados() {
        return estados;
    }

    public void setEstados(Estados estados) {
        this.estados = estados;
    }

    public Cuentas getCuentas() {
        return cuentas;
    }

    public void setCuentas(Cuentas cuentas) {
        this.cuentas = cuentas;
    }
}
