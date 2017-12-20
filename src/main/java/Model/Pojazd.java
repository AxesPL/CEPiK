package Model;

import java.io.Serializable;

import javax.persistence.*;

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
    private String wariantNadwozia;
    private String wariantSilnika;
    @Column(nullable=false)
    private Integer rokProdukcji;
    @Column(nullable=false)
    private String seriaKartyPojazdu;
    @Column(nullable=false)
    private String numerKartyPojazdu;

    public Pojazd() { }

    public Pojazd(String VIN, String marka, String model, String wariantNadwozia, String warinatSilnika, Integer rokProdukcji) {
        this.marka = marka;
        this.model = model;
        this.VIN = VIN;
        this.wariantNadwozia = wariantNadwozia;
        this.wariantSilnika = warinatSilnika;
        this.rokProdukcji = rokProdukcji;
       // this.seriaKartyPojazdu = seriaKartyPojazdu;
       // this.numerKartyPojazdu = numerKartyPojazdu;
    }

    public String getVIN() {
        return VIN;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getWariantNadwozia() {
        return wariantNadwozia;
    }

    public void setWariantNadwozia(String wariant_Nadwozia) {
        this.wariantNadwozia = wariantNadwozia;
    }

    public String getWariantSilnika() {
        return wariantSilnika;
    }

    public void setWariantSilnika(String wariantSilnika) {
        this.wariantSilnika = wariantSilnika;
    }

    public Integer getRokProdukcji() {
        return rokProdukcji;
    }

    public void setRokProdukcji(Integer rokProdukcji) {
        this.rokProdukcji = rokProdukcji;
    }

    public String getSeriaKartyPojazdu() {
        return seriaKartyPojazdu;
    }

    public void setSeriaKartyPojazdu(String seriaKartyPojazdu) {
        this.seriaKartyPojazdu = seriaKartyPojazdu;
    }

    public String getNumerKartyPojazdu() {
        return numerKartyPojazdu;
    }

    public void setNumerKartyPojazdu(String numerKartyPojazdu) {
        this.numerKartyPojazdu = numerKartyPojazdu;
    }

    @Override
    public String toString() {
        return "Pojazd{" +
                "VIN='" + VIN + '\'' +
                ", marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", wariant_Nadwozia='" + wariantNadwozia + '\'' +
                ", wariant_Silnika='" + wariantSilnika + '\'' +
                ", rok_Produkcji=" + rokProdukcji +
                ", seria_karty_pojazdu=" + seriaKartyPojazdu +
                ", numer_karty_pojazdu=" + numerKartyPojazdu +
                '}';
    }


}