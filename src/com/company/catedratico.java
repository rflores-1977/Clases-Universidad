package com.company;

import java.util.Arrays;

public class catedratico {

    private String Asigntura;
    String Nombre;
    String Telefono;
    String Correo;
    String [] Alumnos;

    public String getAsigntura() {
        return Asigntura;
    }

    public void setAsigntura(String asigntura) {
        Asigntura = asigntura;
    }

    public String[] getAlumnos() {
        return Alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        Alumnos = alumnos;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }
   //CON ESTE toString IMPRIMIR DIRECTAMENTE EN EL Main


    @Override
    public String toString() {
        return "catedratico{" +
                "Asigntura='" + Asigntura + '\'' +
                ", Nombre='" + Nombre + '\'' +
                ", Telefono='" + Telefono + '\'' +
                ", Correo='" + Correo + '\'' +
                ", Alumnos=" + Arrays.toString(Alumnos) +
                '}';
    }
}
