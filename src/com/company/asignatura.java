package com.company;

import java.util.Arrays;

public class asignatura {
    private String Nombre;
    private String Catedratico;
    private int CantidadAlumnos;
    private String NumeroAula;
    private String Horario;
    private String dia;
    String [] Catedraticos;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getCatedratico() {
        return Catedratico;
    }

    public void setCatedratico(String catedratico) {
        Catedratico = catedratico;
    }

    public int getCantidadAlumnos() {
        return CantidadAlumnos;
    }

    public void setCantidadAlumnos(int cantidadAlumnos) {
        CantidadAlumnos = cantidadAlumnos;
    }

    public String getNumeroAula() {
        return NumeroAula;
    }

    public void setNumeroAula(String numeroAula) {
        NumeroAula = numeroAula;
    }

    public String getHorario() {
        return Horario;
    }

    public void setHorario(String horario) {
        Horario = horario;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String[] getCatedraticos() {
        return Catedraticos;
    }

    public void setCatedraticos(String[] catedraticos) {
        Catedraticos = catedraticos;
    }

    @Override
    public String toString() {
        return "asignatura{" +
                "Nombre='" + Nombre + '\'' +
                ", Catedratico='" + Catedratico + '\'' +
                ", CantidadAlumnos=" + CantidadAlumnos +
                ", NumeroAula='" + NumeroAula + '\'' +
                ", Horario='" + Horario + '\'' +
                ", dia='" + dia + '\'' +
                ", Catedraticos=" + Arrays.toString(Catedraticos) +
                '}';
    }
}
