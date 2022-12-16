package ee.projektPlus.quiz.repositories;

import ee.projektPlus.quiz.entities.PlayerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<PlayerEntity, Long> {
}
