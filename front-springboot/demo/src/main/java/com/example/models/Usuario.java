package com.example.models;

public class Usuario {
    private Long id;
    private String nombre;
    private String apellido;
    private String email;
    private String password;
    private String telefono;

    //getters y setters
    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getPassword(){
        return password;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }

    public String getTelefono(){
        return telefono;
    }
}
