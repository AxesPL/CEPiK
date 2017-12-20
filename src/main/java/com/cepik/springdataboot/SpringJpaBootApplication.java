package com.cepik.springdataboot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.cepik.springdataboot.Model.Pojazd;
import com.cepik.springdataboot.Repository.PojazdRepository;

@SpringBootApplication
public class SpringJpaBootApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext ctx =
				SpringApplication.run(SpringJpaBootApplication.class, args);

		List<Pojazd>Pojazdy = new ArrayList<>();
		Pojazdy.add(new Pojazd("W0L0AHL0865181240", "Astra", "Opel","Hatchback","Diesel",2003 ));

		PojazdRepository pojazdRepo = ctx.getBean(PojazdRepository.class);
		Pojazdy.forEach(pojazdRepo::save);

		Pojazd pierwszyPojazd = pojazdRepo.findOne("W0L0AHL0865181240");
		pojazdRepo.findAll().forEach(System.out::println);

		ctx.close();
	}

}