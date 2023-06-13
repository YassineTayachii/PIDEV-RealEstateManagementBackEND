package com.example.pidev_gestion_immo.controller;

import com.example.pidev_gestion_immo.entities.Promotion;
import com.example.pidev_gestion_immo.services.IPromotionService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class PromotionController {
@Autowired

    IPromotionService iPromotionService;

    @GetMapping("/afficherPromotions")
    List<Promotion> retrieveAllPromotions() {
        return iPromotionService.retrieveAllPromotions();
    }

    @PostMapping("/ajouterPromotion")
    Promotion addPromotion(@RequestBody Promotion e) {
        return iPromotionService.addPromotion(e);
    }

    @PutMapping("/modifierPromotion")
    Promotion modiferPromotion(@RequestBody Promotion e) {
        return iPromotionService.updatePromotion(e);
    }

    @GetMapping("/afficherPromotion/{idPromotion}")
    Promotion retrievePromotion(@PathVariable Integer idPromotion) {
        return iPromotionService.retrievePromotion(idPromotion);
    }

    @PostMapping("/ArchiverPromotion/{idPromotion}")
    void deletePromotion(@PathVariable Integer idPromotion) {
        iPromotionService.archivePromotion(idPromotion);
    }

}
