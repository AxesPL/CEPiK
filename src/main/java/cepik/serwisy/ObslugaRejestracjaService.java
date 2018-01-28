package cepik.serwisy;


import cepik.enumy.Wynik;
import cepik.repository.RejestracjaRepository;
import cepik.model.Rejestracja;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class ObslugaRejestracjaService {


    @Autowired
    private RejestracjaRepository rejestracjaRepository;

    @Transactional
    public Wynik dodajRejestracje(Rejestracja rejestracja){
        try{
            rejestracjaRepository.save(rejestracja);
            return Wynik.SUKCES;
        }catch(Exception e){
            return Wynik.BLAD;
        }
    }


}
