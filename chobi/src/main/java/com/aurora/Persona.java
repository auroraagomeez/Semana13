package com.aurora;

/**
 * Clase Persona
 */
public class Persona {
    private String nombre;
    private String apellidos;
    private int edad;
    private String email;

    /**
     * Constructor con argumentos
     * @param nombre    el nombre
     * @param apellidos los apellidos
     * @param edad      la edad
     * @param email     el email
     */
    public Persona(String nombre, String apellidos, int edad, String email) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.email = email;
    }

    /**
     * Getter del email
     * @return el email de la persona
     */
    public String getEmail(){
        return email;
    }
}
