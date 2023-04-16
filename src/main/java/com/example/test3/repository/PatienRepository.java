package com.example.test3.repository;

import com.example.test3.entities.Patient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatienRepository extends JpaRepository<Patient,Long> {
    Page<Patient> findByNomContaining(String kw, Pageable pageable);
}
