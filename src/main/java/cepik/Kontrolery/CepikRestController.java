package cepik.Kontrolery;

import cepik.Enumy.Wynik;
import cepik.model.Pojazd;
import cepik.Serwisy.ObslugaRejestracjaService;
import cepik.model.Rejestracja;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController("/cepik")
public class CepikRestController {

    @Autowired
    private ObslugaRejestracjaService obslugaRejestracjaService;

    @RequestMapping(path = "/rejestracja",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
    public Wynik zapiszDaneORejestracji(@RequestBody Rejestracja rejestracja){
        return obslugaRejestracjaService.dodajRejestracje(rejestracja);
    }

}
