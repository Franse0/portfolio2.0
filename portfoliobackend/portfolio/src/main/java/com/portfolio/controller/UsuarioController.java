package com.portfolio.controller;

import com.portfolio.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.portfolio.service.UsuarioService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class UsuarioController {

    @Autowired
    public UsuarioService usuarioService;

    @GetMapping("/")
    @ResponseBody
    public String home() {
        return "¡Bienvenido a mi aplicación Spring Boot!";
    }

    @GetMapping("/usuarios")
    @ResponseBody
    public List<Usuario>verUsuarios(){
        return usuarioService.usuariosVer();
    }

    @GetMapping("usuario/{id}")
    @ResponseBody
    public Optional<Usuario>UsuarioVer(@PathVariable Long id){
        return usuarioService.usuarioVer(id);
    }

    @PostMapping("/usuario")
    public void usuarioNuevo(@RequestBody Usuario usuario){
        usuarioService.usuarioNuevo(usuario);
    }

    @DeleteMapping("usuario/borrar/{id}")
    public void usuarioBorrar(Long id){
        usuarioService.usuarioBorrar(id);
    }

}
