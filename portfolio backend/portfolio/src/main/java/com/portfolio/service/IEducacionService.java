package com.portfolio.service;

import com.portfolio.model.Educacion;

import java.util.List;
import java.util.Optional;

public interface IEducacionService {
    public List<Educacion>educaciones();
    public Optional<Educacion>educacionVer(Long id);
    public void educacionNueva(Educacion educacion);
    public void educacionBorrar(Long id);
}
