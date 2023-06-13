package com.example.pidev_gestion_immo.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.io.Serializable;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Annonce implements Serializable {
    @Id
    Integer idAnnonce;

    String name;
    String description;
    String src;

    @ManyToOne
    @JsonIgnore

    Utilisateur utilisateur;

    @OneToOne
    BienImmobiliere bienImmobiliere;

    @ManyToOne
    @JsonIgnore

    Promotion promotion;

}

