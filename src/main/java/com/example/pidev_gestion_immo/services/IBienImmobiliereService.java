package com.example.pidev_gestion_immo.services;

import com.example.pidev_gestion_immo.entities.BienImmobiliere;

import java.util.List;

public interface IBienImmobiliereService {
    List<BienImmobiliere> retrieveAllBienImmobilieres();

    BienImmobiliere addBienImmobiliere(BienImmobiliere e);

    BienImmobiliere updateBienImmobiliere(BienImmobiliere e);

    BienImmobiliere retrieveBienImmobiliere(Integer idBienImmobiliere);

    void archiveBienImmobiliere(Integer idBienImmobiliere);

}
