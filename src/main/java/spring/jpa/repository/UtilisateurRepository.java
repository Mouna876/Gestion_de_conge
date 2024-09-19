package spring.jpa.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import spring.jpa.model.Utilisateur;
public interface UtilisateurRepository extends
JpaRepository<Utilisateur, Long> {}