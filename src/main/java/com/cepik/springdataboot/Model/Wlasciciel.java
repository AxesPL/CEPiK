package com.cepik.springdataboot.Model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.io.Serializable;
import java.util.List;

public class Wlasciciel implements Serializable {

    @Column(nullable=false)
    private String imie;
    @Column(nullable=false)
    private String nazwisko;
    private String firma;
    @Column(nullable=false)
    private String adresZamieszkania;
    @Id
    @Column(nullable=false, length = 11, unique = true)
    private String PESEL;

   // @ManyToMany(mappedBy = "wlasciciele")
   // private List<Rejestracja>rejestracje;

    public Wlasciciel(){};

    public Wlasciciel(String imie, String nazwisko,String firma, String adresZamieszkania, String PESEL) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.firma = firma;
        this.adresZamieszkania = adresZamieszkania;
        this.PESEL = PESEL;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public String getAdresZamieszkania() {
        return adresZamieszkania;
    }

    public void setAdresZamieszkania(String adresZamieszkania) {
        this.adresZamieszkania = adresZamieszkania;
    }

    public String getPESEL() {
        return PESEL;
    }

    public void setPESEL(String PESEL) {
        this.PESEL = PESEL;
    }

//    public List<Rejestracja> getRejestracje() {
//        return rejestracje;
//    }
//
//    public void setRejestracje(List<Rejestracja> rejestracje) {
//        this.rejestracje = rejestracje;
//    }

    @Override
    public String toString() {
        return "Wlasciciel{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", firma='" + firma + '\'' +
                ", adresZamieszkania='" + adresZamieszkania + '\'' +
                ", PESEL='" + PESEL + '\'' +
  //              ", Jego numery rejestracyjne to'" + rejestracje.toString() + '\'' +
                '}';
    }

}
