package Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import Model.Pojazd;

@Repository
public interface WlascicielRepository extends CrudRepository<Pojazd,String> {
}

