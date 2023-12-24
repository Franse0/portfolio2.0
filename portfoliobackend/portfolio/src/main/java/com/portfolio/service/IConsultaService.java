package com.portfolio.service;

import com.portfolio.model.Consulta;

import java.util.List;
import java.util.Optional;

public interface IConsultaService {

    public List<Consulta>consutlas();
    public void consultaBorrar(Long id);
    public void consultaNueva(Consulta consulta);
    public Optional<Consulta>consultaVer(Long id);
}
