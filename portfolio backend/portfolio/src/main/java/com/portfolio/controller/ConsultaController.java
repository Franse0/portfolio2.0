package com.portfolio.controller;

import com.portfolio.model.Consulta;
import com.portfolio.service.ConsultaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ConsultaController {
    @Autowired
    private ConsultaService consultaService;

    @PostMapping("/consulta")
    public void consultaNueva(@RequestBody Consulta consulta){
        consultaService.consultaNueva(consulta);
    }

    @GetMapping("/consultas")
    @ResponseBody
    public List<Consulta>consultas(){
        return consultaService.consutlas();
    }

    @GetMapping("/consultas/{id}")
    @ResponseBody
    public Optional<Consulta>consultaVer(@PathVariable Long id){
        return  consultaService.consultaVer(id);
    }

    @DeleteMapping("/consulta/borrar/{id}")
    public void consultaBorrar(@PathVariable Long id){
        consultaService.consultaBorrar(id);
    }

}
