package com.sid.controller;

import com.sid.model.Professor;
import com.sid.services.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class ProfessorController {

    @Autowired
    ProfessorService professorService;



    @GetMapping("/professors")
    public List<Professor> getProfessors(){
        return professorService.getProfessors();
    }

    @GetMapping("/professor/{id}")
    public Optional<Professor> getProfessor(@PathVariable Long id){
        return professorService.getProfessor(id);
    }

    @PostMapping("/professor")
    public void addProfessor(@RequestBody Professor professor){
        professorService.addProfessor(professor);
    }

    @PutMapping("/professor")
    public void updateProfessor(@RequestBody Professor professor){
        professorService.updateProfessor(professor);
    }

    @DeleteMapping("/professor/{id}")
    public void deleteProfessor(@PathVariable Long id){
        professorService.deleteProfessor(id);
    }

    @DeleteMapping("/professors")
    public void deleteAllProfessors(){
        professorService.deleteAllProfessors();
    }
}
