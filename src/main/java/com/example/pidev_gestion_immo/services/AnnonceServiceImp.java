package com.example.pidev_gestion_immo.services;

import com.example.pidev_gestion_immo.entities.Annonce;
import com.example.pidev_gestion_immo.repository.AnnonceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AnnonceServiceImp implements IAnnonceService {
    @Autowired
    AnnonceRepository annonceRepository;

    @Override
    public List<Annonce> retrieveAllAnnonces() {
        return annonceRepository.findAll();
    }

    @Override
    public Annonce addAnnonce(Annonce e) {
        return annonceRepository.save(e);
    }

    @Override
    public Annonce updateAnnonce(Annonce e) {
        return annonceRepository.save(e);
    }

    @Override
    public Annonce retrieveAnnonce(Integer idAnnonce) {
        return annonceRepository.findById(idAnnonce).orElse(null);
    }

    @Override
    public void archiveAnnonce(Integer idAnnonce) {

    }
}
