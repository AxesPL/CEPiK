package cepik.Repository;

import cepik.Model.Pojazd;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public interface PojazdRepository extends CrudRepository<Pojazd,String> {
}
