package cepik.Repository;

import cepik.model.Pojazd;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
@Repository
@Component
public interface PojazdRepository extends CrudRepository<Pojazd,String> {
    ArrayList<Pojazd> findAll();
}
