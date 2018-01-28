package cepik.kontrolery;

import cepik.enumy.Wynik;
import cepik.model.Pojazd;
import cepik.model.Wlasciciel;
import cepik.serwisy.ObslugaPojazdService;
import cepik.serwisy.ObslugaWlascicielService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController("/cepik")
public class CepikRestController {

    @Autowired
    private ObslugaPojazdService obslugaPojazdService;
    @Autowired
    private ObslugaWlascicielService obslugaWlascicielService;

    @RequestMapping(path = "/pojazd",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
    public Wynik zapiszDaneOPojezdzie(@RequestBody Pojazd pojazd){
        return obslugaPojazdService.dodajPojazd(pojazd);
    }

    @RequestMapping(path = "/wlasciciel", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Wynik zapiszDaneOWlascicielu(@RequestBody Wlasciciel wlasciciel) {
        return obslugaWlascicielService.dodajWlasciciela(wlasciciel);
    }

}
