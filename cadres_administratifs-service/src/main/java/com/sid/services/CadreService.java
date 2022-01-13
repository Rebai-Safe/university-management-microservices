package com.sid.services;


import com.sid.model.Cadre;
import com.sid.repository.CadreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CadreService {

    @Autowired
    private CadreRepository cadreRepository;


    public List<Cadre> getCadres(){
        return cadreRepository.findAll();
    }

    public Optional<Cadre> getCadre(Long id){
        return cadreRepository.findById(id);
    }

    public void addCadre(Cadre cadre){
        cadreRepository.save(cadre);
    }

    public void updateCadre(Cadre cadre){
        cadreRepository.save(cadre);
    }

    public void deleteCadre(Long id){
        cadreRepository.deleteById(id);
    }

    public void deleteAllCadres(){
        cadreRepository.deleteAll();
    }
}
