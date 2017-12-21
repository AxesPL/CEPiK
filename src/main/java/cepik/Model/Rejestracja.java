package cepik.Model;


import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@Entity
public class Rejestracja implements Serializable {

    @Id
    @Column(nullable = false)
    private String numerRejestracyjny;
    private String numerSwiadectwaHomologacji;
    @Column(nullable = false)
    private Date dataPierwszejRejestracji;
    @Column(nullable = false)
    private Date terminBadaniaTechnicznego;
    @Column(nullable = false)
    private Integer przebiegPrzyOstatnimBadaniu;
    @Column(nullable = false,length=6)
    private String seriaDowodu;
    @Column(nullable = false,length=7)
    private String numerDowodu;
    @Column(nullable = false)
    private Date dataWydaniaDowodu;
    @Column(nullable = false)
    private String organRejestrujacy;
    @Column(nullable = false)
    private Date waznoscDokumentu;
    private String uwagi;
    @Column(nullable=false, length = 17)
    private String numerVIN;

    @ManyToOne
    @JoinColumn(name = "idPojazdu")
    private Pojazd pojazd;

    @ManyToMany(mappedBy = "rejestracje")
    private List<Wlasciciel> wlasciciele;

}
