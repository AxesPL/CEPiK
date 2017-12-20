package com.cepik.springdataboot.Repository;

        import org.springframework.data.repository.CrudRepository;
        import org.springframework.stereotype.Repository;

        import com.cepik.springdataboot.Model.Rejestracja;

@Repository
public interface RejestracjaRepository extends CrudRepository<Rejestracja,String> {
}
