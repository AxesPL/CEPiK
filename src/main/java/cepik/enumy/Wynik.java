package cepik.enumy;


import lombok.Getter;

@Getter
public enum Wynik {

    SUKCES("Sukces", "Wynik operacji zakończony sukcesem!"),
    BLAD("Blad","Operacja zakończona błędem");

    private String major;

    private String komunikat;

    Wynik(String major, String komunikat) {
        this.major = major;
        this.komunikat = komunikat;
    }
}
