package com.company;

public class Main {

    public static void main(String[] args) {
        Ventana ventana = new Ventana("Inicio Sesion");
        ventana.insertarNombre("Juan");
        ventana.insertarPassword("Perez");
        boolean respuesta = ventana.validar();

        if(respuesta){
            System.out.println("Bienvenido");
        }
        else{
            System.out.println("Contrasena incorrecta");
        }
    }

}
