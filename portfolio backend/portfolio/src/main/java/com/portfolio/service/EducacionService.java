package com.portfolio.service;

import com.portfolio.model.Educacion;
import com.portfolio.repository.EducacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EducacionService  implements IEducacionService{

    @Autowired
    public EducacionRepository educacionRepository;

    @Override
    public List<Educacion> educaciones() {
        return educacionRepository.findAll();
    }

    @Override
    public Optional<Educacion> educacionVer(Long id) {
        return educacionRepository.findById(id);
    }

    @Override
    public void educacionNueva(Educacion educacion) {
        educacionRepository.save(educacion);
    }

    @Override
    public void educacionBorrar(Long id) {
        educacionRepository.deleteById(id);
    }
}
