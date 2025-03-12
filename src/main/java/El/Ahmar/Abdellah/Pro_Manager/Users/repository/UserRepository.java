package El.Ahmar.Abdellah.Pro_Manager.Users.repository;

import El.Ahmar.Abdellah.Pro_Manager.Users.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
