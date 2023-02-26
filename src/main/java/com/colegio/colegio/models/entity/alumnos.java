package com.colegio.colegio.models.entity;

public class alumnos {

    private String nombre;
    private String apellido;
    private String cc;
    private String telefono;
    private String email;
    private String direccion;
    private int edad;
    private String grado;
    private double nota;
    

    public alumnos() {
    }


    public alumnos(String nombre, String apellido, String cc, String telefono, String email, String direccion, int edad,
            String grado, double nota) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cc = cc;
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;
        this.edad = edad;
        this.grado = grado;
        this.nota = nota;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getApellido() {
        return apellido;
    }


    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    public String getCc() {
        return cc;
    }


    public void setCc(String cc) {
        this.cc = cc;
    }


    public String getTelefono() {
        return telefono;
    }


    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getDireccion() {
        return direccion;
    }


    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    public int getEdad() {
        return edad;
    }


    public void setEdad(int edad) {
        this.edad = edad;
    }


    public String getGrado() {
        return grado;
    }


    public void setGrado(String grado) {
        this.grado = grado;
    }


    public double getNota() {
        return nota;
    }


    public void setNota(double nota) {
        this.nota = nota;
    }

    

}
