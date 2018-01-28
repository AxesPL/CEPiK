package cepik.model;


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
    private LocalDate dataPierwszejRejestracji;
    @Column(nullable = false)
    private LocalDate terminBadaniaTechnicznego;
    @Column(nullable = false)
    private Integer przebiegPrzyOstatnimBadaniu;
    @Column(nullable = false, length = 6)
    private String seriaDowodu;
    @Column(nullable = false, length = 7)
    private String numerDowodu;
    @Column(nullable = false)
    private LocalDate dataWydaniaDowodu;
    @Column(nullable = false)
    private String organRejestrujacy;
    @Column(nullable = false)
    private LocalDate waznoscDokumentu;
    private String uwagi;
//    @Column(nullable=false, length = 17)
//    private String numerVIN;

    @ManyToOne
    @JoinColumn(name = "VIN")
    private Pojazd pojazd;
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Wlasciciel> wlasciciele;

}
