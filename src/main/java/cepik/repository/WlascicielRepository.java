package cepik.repository;


import cepik.model.Wlasciciel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface WlascicielRepository extends CrudRepository<Wlasciciel,String> {
    ArrayList<Wlasciciel> findAll();
}

