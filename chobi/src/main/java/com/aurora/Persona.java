package com.aurora;

/**
 * Clase Persona
 */
public class Persona {
    private String nombre;
    private String apellidos;
    private int edad;
    private String email;

    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getApellidos() {
        return apellidos;
    }


    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }


    public int getEdad() {
        return edad;
    }


    public void setEdad(int edad) {
        this.edad = edad;
    }


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

    
    public static Persona factory(String cadena){

        if(cadena == null){
            throw new IllegalArgumentException("No son validos los argumentos");
        }
        
        String partes[] = cadena.split(",");

        if(partes.length != 4 ){
            throw new IllegalArgumentException("No son validos los argumentos");
        }

        try{
            int edad = Integer.parseInt(partes[2]);
            return new Persona(partes[0], partes[1], edad, partes[3]);
        }catch(Exception e){
            throw new IllegalArgumentException("No son validos los argumentos");
        }
    }

    /**
     * Getter del email
     * @return el email de la persona
     */
    public String getEmail(){
        return email;
    }
}
