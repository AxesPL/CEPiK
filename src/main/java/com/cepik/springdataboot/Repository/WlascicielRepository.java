package com.cepik.springdataboot.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cepik.springdataboot.Model.Pojazd;

@Repository
public interface WlascicielRepository extends CrudRepository<Pojazd,String> {
}

