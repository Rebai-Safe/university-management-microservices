package com.sid.controllers;

import com.sid.model.Cadre;
import com.sid.services.CadreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class CadreController {

    @Autowired
    CadreService cadreService;

    @GetMapping("/cadres")
    public List<Cadre> getCadres(){
        return cadreService.getCadres();
    }

    @GetMapping("/cadre/{id}")
    public Optional<Cadre> getCadre(@PathVariable Long id){
        return cadreService.getCadre(id);
    }

    @PostMapping("/cadre")
    public void addCadre(@RequestBody Cadre cadre){
        cadreService.addCadre(cadre);
    }

    @PutMapping("/cadre")
    public void updateCadre(@RequestBody Cadre cadre){
        cadreService.updateCadre(cadre);
    }

    @DeleteMapping("/cadre/{id}")
    public void deleteCadre(@PathVariable Long id){
        cadreService.deleteCadre(id);
    }

    @DeleteMapping("/cadres")
    public void deleteAllCadres(){
        cadreService.deleteAllCadres();
    }
}
