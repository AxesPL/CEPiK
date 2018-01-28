package cepik.Serwisy;


import cepik.enumy.Wynik;
import cepik.model.Pojazd;
import cepik.Repository.PojazdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class ObslugaPojazdService {


    @Autowired
    private PojazdRepository pojazdRepository;

    @Transactional
    public Wynik dodajPojazd(Pojazd pojazd){
        try{
            pojazdRepository.save(pojazd);
            return Wynik.SUKCES;
        }catch(Exception e){
            return Wynik.BLAD;
        }
    }


}
