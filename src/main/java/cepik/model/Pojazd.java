package cepik.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Pojazd {
    @Id
    private Long id;
    private String marka;
    private String model;
}
