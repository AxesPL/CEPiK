package Model;


import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Entity
public class Rejestracja implements Serializable {

    public Rejestracja() { }

    public Rejestracja(String numerRejestracyjny, String numerSwiadectwaHomologacji, Date dataPierwszejRejestracji, Date terminBadanieTechnicznego, Integer przebiegPrzyOstatnimBadaniu, String seriaDowodu, String numerDowodu, Date dataWydaniaDowodu, String organRejestrujacy, Date waznoscDokumentu) {
        this.numerRejestracyjny = numerRejestracyjny;
        this.numerSwiadectwaHomologacji = numerSwiadectwaHomologacji;
        this.dataPierwszejRejestracji = dataPierwszejRejestracji;
        this.terminBadaniaTechnicznego = terminBadaniaTechnicznego;
        this.przebiegPrzyOstatnimBadaniu = przebiegPrzyOstatnimBadaniu;
        this.seriaDowodu = seriaDowodu;
        this.numerDowodu = numerDowodu;
        this.dataWydaniaDowodu = dataWydaniaDowodu;
        this.organRejestrujacy = organRejestrujacy;
        this.waznoscDokumentu = waznoscDokumentu;
    }

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
    @Column(nullable=true)
    private String uwagi;
    @Column(nullable=false, length = 17)
    private String numerVIN;       //mapowany
    private String PESEL;           //mapowany

    public String getNumerRejestracyjny() {
        return numerRejestracyjny;
    }

    public void setNumerRejestracyjny(String numer_Rejestracyjny) {
        this.numerRejestracyjny = numerRejestracyjny;
    }

    public String getNumerSwiadectwaHomologacji() {
        return numerSwiadectwaHomologacji;
    }

    public void setNumerSwiadectwaHomologacji(String numerSwiadectwaHomologacji) {
        this.numerSwiadectwaHomologacji = numerSwiadectwaHomologacji;
    }

    public Date getDataPierwszejRejestracji() {
        return dataPierwszejRejestracji;
    }

    public void setDataPierwszejRejestracji(Date dataPierwszejRejestracji) {
        this.dataPierwszejRejestracji = dataPierwszejRejestracji;
    }

    public Date getTerminBadaniaTechnicznego() {
        return terminBadaniaTechnicznego;
    }

    public void setTermin_Badanie_Technicznego(Date terminBadaniaTechnicznego) {
        this.terminBadaniaTechnicznego = terminBadaniaTechnicznego;
    }

    public Integer getPrzebiegPrzyOstatnimBadaniu() {
        return przebiegPrzyOstatnimBadaniu;
    }

    public void setPrzebiegPrzyOstatnimBadaniu(Integer przebiegPrzyOstatnimBadaniu) {
        this.przebiegPrzyOstatnimBadaniu = przebiegPrzyOstatnimBadaniu;
    }

    public String getSeriaDowodu() {
        return seriaDowodu;
    }

    public void setSeriaDowodu(String seriaDowodu) {
        this.seriaDowodu = seriaDowodu;
    }

    public String getNumerDowodu() {
        return numerDowodu;
    }

    public void setNumerDowodu(String numerDowodu) {
        this.numerDowodu = numerDowodu;
    }

    public Date getDataWydaniaDowodu() {
        return dataWydaniaDowodu;
    }

    public void setDataWydaniaDowodu(Date dataWydaniaDowodu) {
        this.dataWydaniaDowodu = dataWydaniaDowodu;
    }

    public String getOrganRejestrujacy() {
        return organRejestrujacy;
    }

    public void setOrganRejestrujacy(String organ_Rejestrujacy) {
        this.organRejestrujacy = organ_Rejestrujacy;
    }

    public Date getWaznoscDokumentu() {
        return waznoscDokumentu;
    }

    public void setWaznoscDokumentu(Date waznoscDokumentu) {
        this.waznoscDokumentu = waznoscDokumentu;
    }

    public String getUwagi() {
        return uwagi;
    }

    public void setUwagi(String uwagi) {
        this.uwagi = uwagi;
    }

    public String getNumerVIN() {
        return numerVIN;
    }

    public void setNumerVIN(String numerVIN) {
        this.numerVIN = numerVIN;
    }

    public String getPESEL() {
        return PESEL;
    }

    public void setPESEL(String PESEL) {
        this.PESEL = PESEL;
    }

    @Override
    public String toString() {
        return "Rejestracja{" +
                "numer_Rejestracyjny='" + numerRejestracyjny + '\'' +
                ", numer_Swiadectwa_Homologacji='" + numerSwiadectwaHomologacji + '\'' +
                ", data_Pierwszej_Rejestracji=" + dataPierwszejRejestracji +
                ", termin_Badanie_Technicznego=" + terminBadaniaTechnicznego +
                ", przebieg_Przy_Ostatnim_Badaniu=" + przebiegPrzyOstatnimBadaniu +
                ", seria_Dowodu='" + seriaDowodu + '\'' +
                ", numer_Dowodu='" + numerDowodu + '\'' +
                ", data_Wydania_Dowodu=" + dataWydaniaDowodu +
                ", organ_Rejestrujacy='" + organRejestrujacy + '\'' +
                ", waznosc_Dokumentu=" + waznoscDokumentu +
                ", uwagi='" + uwagi + '\'' +
                '}';
    }
}
