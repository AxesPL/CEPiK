package cepik;

import cepik.Model.Wlasciciel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import cepik.Model.Pojazd;

@SpringBootApplication
public class SpringJpaBootApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext ctx =
				SpringApplication.run(SpringJpaBootApplication.class, args);

	}
}