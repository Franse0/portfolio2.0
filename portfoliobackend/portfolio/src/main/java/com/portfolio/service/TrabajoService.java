package com.portfolio.service;

import com.portfolio.model.Trabajo;
import com.portfolio.repository.TrabajoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TrabajoService implements ITrabajoService {

    @Autowired
    public TrabajoRepository trabajoRepo;

    @Override
    public List<Trabajo> trabajosVer() {
        return trabajoRepo.findAll();
    }

    @Override
    public Optional<Trabajo> trabajoVer(Long id) {
        return trabajoRepo.findById(id);
    }

    @Override
    public void trabajoNuevo(Trabajo trabajo) {
        trabajoRepo.save(trabajo);
    }

    @Override
    public void trabajoBorrar(Long id) {
        trabajoRepo.deleteById(id);
    }
}
