package com.portfolio.controller;


import com.portfolio.model.Educacion;
import com.portfolio.service.EducacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class EducacionController {

    @Autowired
    public EducacionService educacionService;

    @GetMapping("/educaciones")
    @ResponseBody
    public List<Educacion>educaciones(){
        return  educacionService.educaciones();
    }

    @GetMapping("/educacion/{id}")
    @ResponseBody
    public Optional<Educacion>educacionVer(@PathVariable Long id){
        return educacionService.educacionVer(id);
    }

    @PostMapping("/educacion")
    public void educacionNueva(@RequestBody Educacion educacion){
        educacionService.educacionNueva(educacion);
    }

    @DeleteMapping("/educacion/borrar/{id}")
    public void educacionBorrar(@PathVariable Long id){
        educacionService.educacionBorrar(id);
    }
}
