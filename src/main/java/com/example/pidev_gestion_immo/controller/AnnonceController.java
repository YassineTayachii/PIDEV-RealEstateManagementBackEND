package com.example.pidev_gestion_immo.controller;

import com.example.pidev_gestion_immo.entities.Annonce;
import com.example.pidev_gestion_immo.services.IAnnonceService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class AnnonceController {

@Autowired
    IAnnonceService iAnnonceService;

    @GetMapping("/afficherAnnonces")
    List<Annonce> retrieveAllAnnonces() {
        return iAnnonceService.retrieveAllAnnonces();
    }

    @PostMapping("/ajouterAnnonce")
    Annonce addAnnonce(@RequestBody Annonce e) {
        return iAnnonceService.addAnnonce(e);
    }

    @PutMapping("/modifierAnnonce")
    Annonce modiferAnnonce(@RequestBody Annonce e) {
        return iAnnonceService.updateAnnonce(e);
    }

    @GetMapping("/afficherUser/{idAnnonce}")
    Annonce retrieveAnnonce(@PathVariable Integer idAnnonce) {
        return iAnnonceService.retrieveAnnonce(idAnnonce);
    }

    @PostMapping("/ArchiverAnnonce/{idAnnonce}")
    void deleteAnnonce(@PathVariable Integer idAnnonce) {
        iAnnonceService.archiveAnnonce(idAnnonce);
    }

}
