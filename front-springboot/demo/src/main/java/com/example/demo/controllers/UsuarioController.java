package com.example.demo.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.models.Usuario;

@RestController
public class UsuarioController {

    
    @CrossOrigin
    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id){
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Juan");
        usuario.setApellido("Perez");
        usuario.setEmail("valpas@gmail.com");
        usuario.setTelefono("12345678");
        usuario.setPassword("123456");
        return usuario;
    }

    @CrossOrigin
    @RequestMapping(value = "usuarios")
    public Usuario[] getUsuarios(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Juan");
        usuario.setApellido("Perez");
        usuario.setEmail("asdasd@gmail.com");
        usuario.setTelefono("12345678");
        return new Usuario[]{usuario, usuario, usuario};
    }

    @RequestMapping(value = "editarUsuario/{id}")
    public Usuario editUsuario(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Juan");
        usuario.setApellido("Perez");
        usuario.setEmail("valpas@gmail.com");
        usuario.setTelefono("12345678");
        usuario.setPassword("123456");
        return usuario;
    }

    @RequestMapping(value = "eliminarUsuario/{id}")
    public Usuario eliminarUsuario(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Juan");
        usuario.setApellido("Perez");
        usuario.setEmail("valpas@gmail.com");
        usuario.setTelefono("12345678");
        usuario.setPassword("123456");
        return usuario;
    }

    @RequestMapping(value = "buscarUsuario/{id}")
    public Usuario buscarUsuario(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Juan");
        usuario.setApellido("Perez");
        usuario.setEmail("valpas@gmail.com");
        usuario.setTelefono("12345678");
        usuario.setPassword("123456");
        return usuario;
    }
    
}
