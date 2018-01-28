package cepik.Serwisy;

import cepik.Enumy.Wynik;
import cepik.model.Wlasciciel;
import cepik.Repository.WlascicielRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;


@Service
public class ObslugaWlascicielService {

    @Autowired
    private WlascicielRepository wlascicielRepository;

    @Transactional
    public Wynik dodajWlasciciela(Wlasciciel wlasciciel){
        try {
            wlascicielRepository.save(wlasciciel);
            return Wynik.SUKCES;
        } catch (Exception e) {
            return Wynik.BLAD;
        }
    }
}
