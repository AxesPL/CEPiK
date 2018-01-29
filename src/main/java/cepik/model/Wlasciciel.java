package cepik.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
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
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private String PESEL;

    @ManyToMany(cascade = CascadeType.ALL,mappedBy = "wlasciciele", fetch = FetchType.EAGER)
    private Set<Rejestracja> rejestracje;
}
