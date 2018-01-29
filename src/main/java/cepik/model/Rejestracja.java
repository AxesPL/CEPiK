package cepik.model;


import cepik.utils.LocalDateDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Data
@Entity
public class Rejestracja implements Serializable {

    @Id
    @Column(nullable = false)
    private String numerRejestracyjny;
    private String numerSwiadectwaHomologacji;
    @Column(nullable = false)

    @JsonDeserialize(using = LocalDateDeserializer.class)
    private LocalDate dataPierwszejRejestracji;

    @Column(nullable = false)
    @JsonDeserialize(using = LocalDateDeserializer.class)

    private LocalDate terminBadaniaTechnicznego;

    @Column(nullable = false)
    private int przebiegPrzyOstatnimBadaniu;

    @Column(nullable = false, length = 6)
    private String seriaDowodu;
    @Column(nullable = false, length = 7)
    private String numerDowodu;

    @Column(nullable = false)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    private LocalDate dataWydaniaDowodu;

    @Column(nullable = false)
    private String organRejestrujacy;

    @Column(nullable = false)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    private LocalDate waznoscDokumentu;
    private String uwagi;

    @ManyToOne
    @JoinColumn(name = "VIN")
    private Pojazd pojazd;
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Wlasciciel> wlasciciele;

}
