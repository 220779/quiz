package ee.projektPlus.quiz;

import ee.projektPlus.quiz.database.entities.PlayerEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Log
public class StartupRunner implements CommandLineRunner {

    @Autowired
    private EntityManager entityManager;

    @Override
    @Transactional
    public void run(String...args) throws Exception {
        log.info("Executing startup actions...");
        PlayerEntity player = new PlayerEntity("John");
        log.info("Created player: " + player);

        entityManager.persist(player);
        log.info("Same player after persist: " + player);

        log.info("List of player from Database :");
        Query q = entityManager.createQuery("SELECT p FROM PLAYERS p");
        List<PlayerEntity> playersFromDB = (List<PlayerEntity>)q.getResultList();

        for (PlayerEntity playerFromDB : playersFromDB) {
            log.info("Player from DB: " + playerFromDB);
        }
    }
}