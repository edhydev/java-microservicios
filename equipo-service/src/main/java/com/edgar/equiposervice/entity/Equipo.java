package com.edgar.equiposervice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Equipo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEquipo;
    private String nombre;
    private String logo;
    private Integer idDelegado;
    private Integer idSubDelegado;

    public Integer getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(Integer idEquipo) {
        this.idEquipo = idEquipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public Integer getIdDelegado() {
        return idDelegado;
    }

    public void setIdDelegado(Integer idDelegado) {
        this.idDelegado = idDelegado;
    }

    public Integer getIdSubDelegado() {
        return idSubDelegado;
    }

    public void setIdSubDelegado(Integer idSubDelegado) {
        this.idSubDelegado = idSubDelegado;
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "idEquipo=" + idEquipo +
                ", nombre='" + nombre + '\'' +
                ", logo='" + logo + '\'' +
                ", idDelegado=" + idDelegado +
                ", idSubDelegado=" + idSubDelegado +
                '}';
    }
}
