package com.example.pidev_gestion_immo.repository;

import com.example.pidev_gestion_immo.entities.BienImmobiliere;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BienImmobiliereRepository extends JpaRepository<BienImmobiliere, Integer> {
}
