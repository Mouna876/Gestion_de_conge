package spring.jpa.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import spring.jpa.model.Conge;
public interface CongeRepository extends
JpaRepository<Conge, Long> {}