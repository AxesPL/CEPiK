package cepik.Model;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.io.Serializable;
import java.util.Set;

@Data
@Entity
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

    @ManyToMany
    private Set<Rejestracja> rejestracje;
}
