package cepik.Repository;

import cepik.model.Rejestracja;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface RejestracjaRepository extends CrudRepository<Rejestracja,String> {
    ArrayList<Rejestracja> findAll();
}
