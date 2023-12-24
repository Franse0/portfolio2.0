package com.portfolio.service;

import com.portfolio.model.Trabajo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ITrabajoService {

    public List<Trabajo>trabajosVer();
    public Optional<Trabajo>trabajoVer(Long id);
    public void trabajoNuevo(Trabajo trabajo);
    public void trabajoBorrar(Long id);
}
