package cepik.kontrolery;

import cepik.Serwisy.ObslugaPojazdService;
import cepik.Serwisy.ObslugaWlascicielService;
import cepik.enumy.Wynik;
import cepik.model.Pojazd;
import cepik.Repository.PojazdRepository;
import cepik.model.Wlasciciel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cepik")
public class CepikRestController {

    @Autowired
    private ObslugaPojazdService obslugaPojazdService;

    @Autowired
    private ObslugaWlascicielService obslugaWlascicielService;

    @Autowired
    private PojazdRepository pojazdRepository;


    @RequestMapping(path = "/pojazd",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody ResponseEntity<Wynik> zapiszDaneOPojezdzie(@RequestBody Pojazd pojazd){
        Wynik wynik =  obslugaPojazdService.dodajPojazd(pojazd);
        return ResponseEntity.ok(wynik);
    }

    @RequestMapping(path = "/pojazd", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Pojazd>> wyswietlWszystkiePojazdy(){
        List<Pojazd> pojazdy = pojazdRepository.findAll();
        return ResponseEntity.ok(pojazdy);
    }

    @RequestMapping(path = "/wlasciciel", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Wynik zapiszDaneOWlascicielu(@RequestBody Wlasciciel wlasciciel) {
        return obslugaWlascicielService.dodajWlasciciela(wlasciciel);
    }


}
