package com.portfolio.service;

import com.portfolio.model.Usuario;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface IUsuarioService {

    public List<Usuario>usuariosVer();
    public Optional<Usuario>usuarioVer(Long id);
    public void usuarioBorrar(Long id);
    public void usuarioNuevo(Usuario usuario);
}
