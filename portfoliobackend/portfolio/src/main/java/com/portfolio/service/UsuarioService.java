package com.portfolio.service;

import com.portfolio.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolio.repository.UsuarioRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService implements IUsuarioService {
    @Autowired
    public UsuarioRepository usuarioRepo;



    @Override
    public List<Usuario> usuariosVer() {
        return usuarioRepo.findAll();
    }

    @Override
    public Optional<Usuario> usuarioVer(Long id) {
        return usuarioRepo.findById(id);
    }

    @Override
    public void usuarioBorrar(Long id) {
        usuarioRepo.deleteById(id);
    }

    @Override
    public void usuarioNuevo(Usuario usuario) {
        usuarioRepo.save(usuario);
    }
}
