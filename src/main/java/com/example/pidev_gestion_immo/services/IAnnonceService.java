package com.example.pidev_gestion_immo.services;

import com.example.pidev_gestion_immo.entities.Annonce;

import java.util.List;

public interface IAnnonceService {
    List<Annonce> retrieveAllAnnonces();

    Annonce addAnnonce(Annonce e);

    Annonce updateAnnonce(Annonce e);

    Annonce retrieveAnnonce(Integer idAnnonce);

    void archiveAnnonce(Integer idAnnonce);

}
