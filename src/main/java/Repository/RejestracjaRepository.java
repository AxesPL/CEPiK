package Repository;

        import org.springframework.data.repository.CrudRepository;
        import org.springframework.stereotype.Repository;

        import Model.Rejestracja;

@Repository
public interface RejestracjaRepository extends CrudRepository<Rejestracja,String> {
}
