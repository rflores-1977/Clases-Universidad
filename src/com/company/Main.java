package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner rd = new Scanner(System.in); // instancia de la clase Scanner, nombre "rd"
	    alumno al = new alumno("201320010116"); // instancia de la clase alumno, nombre "al"
	    al.setNombre("Rodolfo");


        //HACER UN ARREGLO DE ALUMNOS
        alumno alumnos [];//DECLARAMOS LA VARIABLE

        //CON UN ARREGLO PODEMOS GUARDAR LA INFORMACION DE VARIOS ALUMNOS
        alumnos = new alumno[5];
        alumnos[0] = al;
        alumnos [0].getNombre(); //PARA PEDIRLE SOLO EL NOMBRE A ESE AREGLO

        imprimirinf(al);//LLAMAMOS A LA FUNCION imprimirinf

        //USO DE LA OPCION toString QUE COLOCAMOS EN LA CLASE ALUMNO
        System.out.println(alumnos[0].toString());//con esto imprimo lo de la clase, el toString se pone en la clase

        alumno al2 = new alumno(); //INSTANCIAMOS LA CLASE ALUMNO, CON NOMBRE al2, sin parametros

        /*//AQUI INICIA PRUEBA REALIZADA CON CLASE ASIGNATURA
	    asignatura pr = new asignatura("Programacion");
	    pr.setCantidadAlumnos(10);
	    pr.setCatedratico("Walter Suazo");
	    pr.setHorario("19:20 A 20:10");
	    pr.setNumeroAula("Virtual");
	    pr.setDia("Lunes a Jueves");

        System.out.println("Nombre de la Asignatura : "+pr.getNombre());
        System.out.println("Catedratico : "+pr.getCatedratico());
        System.out.println("Horario : "+pr.getHorario());
        System.out.println("Aula : "+pr.getNumeroAula());
        System.out.println("Los dias : "+pr.getDia());
        System.out.println("Alumnos Matriculados : " +pr.getCantidadAlumnos());
        //AQUI TERMINA PRUEBA REALIZADA CON CLASE ASIGNATURA*/

    }
    //PODEMOS HACER FUNCIONES
    public static void imprimirinf(alumno al){
        System.out.println("Cuenta: "+al.getCuenta()+" Nombre: "+al.getNombre());
    }
}
