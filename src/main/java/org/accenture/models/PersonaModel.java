package org.accenture.models;

public class PersonaModel {

private String nombre;
private String departamento;
private String ciudad;
private String tarjetaCredito;
private String mes;
private String anio;

    public PersonaModel(String nombre, String departamento, String ciudad, String tarjetaCredito, String mes, String anio) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.ciudad = ciudad;
        this.tarjetaCredito = tarjetaCredito;
        this.mes = mes;
        this.anio = anio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getTarjetaCredito() {
        return tarjetaCredito;
    }

    public void setTarjetaCredito(String tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }
}
