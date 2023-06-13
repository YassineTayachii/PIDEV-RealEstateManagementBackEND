package com.example.pidev_gestion_immo.entities;

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
public class Contrat implements Serializable {
    @Id
    Integer idContrat;
    String titre;
    String description;

    @ManyToOne
    Utilisateur utilisateur;

    @OneToOne
    BienImmobiliere bienImmobiliere;
}
