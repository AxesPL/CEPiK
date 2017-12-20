package Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import Model.Pojazd;

@Repository
public interface PojazdRepository extends CrudRepository<Pojazd,String> {
}
