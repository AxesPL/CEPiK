package cepik.model;

import cepik.Enumy.WariantNadwoziaEnum;
import cepik.Enumy.WariantSilnikaEnum;
import lombok.Data;

import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.EnumType;
import java.io.Serializable;
import java.util.List;



@Data
@Entity
public class Pojazd implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(nullable=false, length = 17, unique = true)
    private String VIN;
    @Column(nullable=false)
    private String marka;
    @Column(nullable=false)
    private String model;
    @Enumerated(EnumType.STRING)
    private WariantNadwoziaEnum wariantNadwozia;
    @Enumerated(EnumType.STRING)
    private WariantSilnikaEnum wariantSilnika;
    @Column(nullable=false)
    private Integer rokProdukcji;
    private String seriaKartyPojazdu;
    private String numerKartyPojazdu;

    // Komentarz testowy do st

}