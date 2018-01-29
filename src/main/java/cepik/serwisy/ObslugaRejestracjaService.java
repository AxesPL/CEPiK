package cepik.serwisy;


import cepik.enumy.Wynik;
import cepik.model.Pojazd;
import cepik.model.UzupelnijDaneRequest;
import cepik.model.Wlasciciel;
import cepik.repository.PojazdRepository;
import cepik.repository.RejestracjaRepository;
import cepik.model.Rejestracja;
import cepik.repository.WlascicielRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class ObslugaRejestracjaService {


    @Autowired
    private RejestracjaRepository rejestracjaRepository;

    @Autowired
    private WlascicielRepository wlascicielRepository;

    @Autowired
    private PojazdRepository pojazdRepository;

    @Transactional
    public Wynik dodajRejestracje(Rejestracja rejestracja) {
        try {
            rejestracjaRepository.save(rejestracja);
            return Wynik.SUKCES;
        } catch (Exception e) {
            return Wynik.BLAD;
        }
    }

    @Transactional
    public Wynik uzupenijDaneORejestracji(UzupelnijDaneRequest uzupelnijDaneRequest) {
        try {
            Pojazd pojazd = pojazdRepository.findOne(uzupelnijDaneRequest.getVIN());
            Wlasciciel wlasciciel = wlascicielRepository.findOne(uzupelnijDaneRequest.getPESEL());
            Rejestracja rejestracja = rejestracjaRepository.findOne(uzupelnijDaneRequest.getNumerRejestracyjny());
            String numerKartyPojazdu = rejestracja.getNumerDowodu().split("-")[1];
            String seriaKartyPojazdu = rejestracja.getNumerDowodu().split("-")[0];
            pojazd.setNumerKartyPojazdu(numerKartyPojazdu);
            pojazd.setSeriaKartyPojazdu(seriaKartyPojazdu);
            rejestracja.setPojazd(pojazd);
            wlasciciel.getRejestracje().add(rejestracja);
            rejestracja.getWlasciciele().add(wlasciciel);
            wlascicielRepository.save(wlasciciel);
            rejestracjaRepository.save(rejestracja);

            return Wynik.SUKCES;
        } catch (Exception e) {
            return Wynik.BLAD;
        }
    }


}
