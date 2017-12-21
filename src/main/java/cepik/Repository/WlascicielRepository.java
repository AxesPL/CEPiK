package cepik.Repository;

import cepik.Model.Pojazd;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WlascicielRepository extends CrudRepository<Pojazd,String> {
}

