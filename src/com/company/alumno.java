package com.company;

import java.util.Arrays;

public class alumno {
    private String Nombre; //private es para el encapsulamiento, no podemos acceder a ellas desde afuera de esta clase
    private int edad;     // ESTAS SON LAS PROPIEDADES
    private double estatura;
    private String cuenta;
    private String telefono;


    public alumno(String cuenta) { // EL CONSTRUCTOR ES LA PRIMERA FUNCION QUE SE EJECUTA CUANDO INSTANCIAMOS LA CLASE
        this.cuenta = cuenta;      // EL PARAMETRO DE ESTE CONSTRUCTOR ES "cuenta"
        System.out.println("Soy constructor con parametros");//ESTO SE IMPRIME AL INSTANCIAR ESTE CONSTRUCTOR EN EL Main
    }

    public alumno() {  //ESTE CONSTRUCTOR ALUMNO NO TIENE PARAMETRO
        System.out.println("Soy constructor sin Parametros");//ESTO SE IMPRIME AL INSTANCIAR ESTE CONSTRUCTOR EN EL Main
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }



    //CON ESTE toString IMPRIMIR DIRECTAMENTE EN EL Main

    @Override
    public String toString() {
        return "alumno{" +
                "Nombre='" + Nombre + '\'' +
                ", edad=" + edad +
                ", estatura=" + estatura +
                ", cuenta='" + cuenta + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
