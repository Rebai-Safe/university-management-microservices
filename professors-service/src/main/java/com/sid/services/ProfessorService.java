package com.sid.services;

import com.sid.model.Professor;
import com.sid.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfessorService {

    @Autowired
    private ProfessorRepository professorRepository;

    public List<Professor> getProfessors(){
        return professorRepository.findAll();
    }

    public Optional<Professor> getProfessor(Long id){
        return professorRepository.findById(id);
    }

    public void addProfessor(Professor student){
        professorRepository.save(student);
    }

    public void updateProfessor(Professor student){
        professorRepository.save(student);
    }

    public void deleteProfessor(Long id){
        professorRepository.deleteById(id);
    }

    public void deleteAllProfessors(){
        professorRepository.deleteAll();
    }

}
