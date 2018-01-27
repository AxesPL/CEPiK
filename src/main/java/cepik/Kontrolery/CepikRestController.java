package cepik.Kontrolery;

import cepik.Enumy.Wynik;
import cepik.Model.Pojazd;
import cepik.Serwisy.ObslugaPojazdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController("/cepik")
public class CepikRestController {

    @Autowired
    private ObslugaPojazdService obslugaPojazdService;

    @RequestMapping(path = "/pojazd",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
    public Wynik zapiszDaneOPojezdzie(@RequestBody Pojazd pojazd){
        return obslugaPojazdService.dodajPojazd(pojazd);
    }

}
