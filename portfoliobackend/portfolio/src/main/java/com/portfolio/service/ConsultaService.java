package com.portfolio.service;

import com.portfolio.model.Consulta;
import com.portfolio.repository.ConsultaRepository;
import org.hibernate.annotations.AttributeAccessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConsultaService  implements IConsultaService{

    @Autowired
    public ConsultaRepository consultaRepository;

    @Override
    public List<Consulta> consutlas() {
        return consultaRepository.findAll();
    }

    @Override
    public void consultaBorrar(Long id) {
        consultaRepository.deleteById(id);
    }

    @Override
    public void consultaNueva(Consulta consulta) {
        consultaRepository.save(consulta);
    }

    @Override
    public Optional<Consulta> consultaVer(Long id) {
        return consultaRepository.findById(id);
    }
}
