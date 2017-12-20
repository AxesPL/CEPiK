package com.cepik.springdataboot.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.cepik.springdataboot.Model.Pojazd;

@Repository
@Component
public interface PojazdRepository extends CrudRepository<Pojazd,String> {
}
