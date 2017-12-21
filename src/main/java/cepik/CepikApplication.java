package cepik;


import cepik.Model.Pojazd;
import cepik.Model.Rejestracja;
import cepik.Model.Wlasciciel;
import cepik.Repository.PojazdRepository;
import cepik.Repository.RejestracjaRepository;
import cepik.Repository.WlascicielRepository;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.time.LocalDate;
import java.util.ArrayList;
;

@SpringBootApplication
public class CepikApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(CepikApplication.class, args);


		PojazdRepository pojazdRepository = ctx.getBean(PojazdRepository.class);
		WlascicielRepository wlascicielRepository = ctx.getBean(WlascicielRepository.class);
		RejestracjaRepository rejestracjaRepository = ctx.getBean(RejestracjaRepository.class);

		ArrayList<Wlasciciel> wlasciciele = wlascicielRepository.findAll();
		ArrayList<Pojazd> pojazdy = pojazdRepository.findAll();

		Rejestracja rejestracja = new Rejestracja();
		rejestracja.setDataPierwszejRejestracji(LocalDate.now().minusYears(5));
		rejestracja.setDataWydaniaDowodu(LocalDate.now().minusYears(5).plusMonths(1));
		rejestracja.setNumerDowodu("1234567");
		rejestracja.setSeriaDowodu("DR/BAA");
		rejestracja.setNumerRejestracyjny("BL-1012A");
		rejestracja.setOrganRejestrujacy("Miasto stoleczne Warszawa");
		rejestracja.setPrzebiegPrzyOstatnimBadaniu(10000);
		rejestracja.setTerminBadaniaTechnicznego(LocalDate.now());
		rejestracja.setWaznoscDokumentu(LocalDate.now().plusYears(2));
		rejestracja.setNumerVIN(pojazdy.get(0).getVIN());
		ArrayList<Wlasciciel> wlascicieleRejestracja = new ArrayList<>();
		wlascicieleRejestracja.add(wlasciciele.get(0));
		rejestracja.setWlasciciele(wlascicieleRejestracja);
		rejestracjaRepository.save(rejestracja);

//		Random generator = new Random();
//		for(int i =0; i<wlasciciele.size();i++){
//			Rejestracja rejestracjaNowa;
//			rejestracjaNowa=rejestracja;
//			rejestracjaNowa.setDataPierwszejRejestracji(LocalDate.now().minusYears(generator.nextInt(10)));
//			rejestracjaNowa.setDataWydaniaDowodu(rejestracjaNowa.getDataPierwszejRejestracji().plusMonths(generator.nextInt(7)));
//			rejestracjaNowa.setPrzebiegPrzyOstatnimBadaniu(10000*generator.nextInt(2)+generator.nextInt(50000));
//			rejestracjaNowa.setTerminBadaniaTechnicznego(LocalDate.now().plusMonths(generator.nextInt(3)));
//			rejestracjaNowa.setWaznoscDokumentu(LocalDate.now().plusYears(generator.nextInt(4)));
//			rejestracjaNowa.setNumerRejestracyjny("WB-"+ RandomStringUtils.randomAlphabetic(5));
//			rejestracjaNowa.setSeriaDowodu(RandomStringUtils.randomAlphabetic(2)+"/"+RandomStringUtils.randomAlphabetic(3));
//			rejestracjaNowa.setNumerDowodu(Integer.toString(1000000+generator.nextInt(800000)));
//			rejestracjaNowa.setNumerVIN(pojazdy.get(i).getVIN());
//			rejestracjaNowa.getWlasciciele().add(wlasciciele.get(i));
//			rejestracjaRepository.save(rejestracjaNowa);
//		}




	}
}
