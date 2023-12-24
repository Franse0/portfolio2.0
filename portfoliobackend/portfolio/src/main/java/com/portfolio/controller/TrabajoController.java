package com.portfolio.controller;

import com.portfolio.model.Trabajo;
import com.portfolio.service.TrabajoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class TrabajoController {
    @Autowired
    private TrabajoService trabajoService;


    @GetMapping("/trabajos")
    @ResponseBody
    public List<Trabajo>trabajosVer(){
        return trabajoService.trabajosVer();
    }

    @GetMapping("/trabajo/{id}")
    @ResponseBody
    public Optional<Trabajo>trabajoVer(@PathVariable Long id){
        return  trabajoService.trabajoVer(id);
    }

    @PostMapping("/trabajo")
    public void trabajo(@RequestBody Trabajo trabajo){
        trabajoService.trabajoNuevo(trabajo);
    }

    @DeleteMapping("/trabajo/borrar/{id}")
    public void trabajoBorrar(@PathVariable Long id){
        trabajoService.trabajoBorrar(id);
    }
}
