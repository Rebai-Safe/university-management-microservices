package com.sid.repository;


import com.sid.model.Cadre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CadreRepository extends JpaRepository<Cadre,Long> {
}
