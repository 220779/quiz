package ee.projektPlus.quiz;

import ee.projektPlus.quiz.database.entities.PlayerEntity;
import ee.projektPlus.quiz.database.repositories.PlayerRepository;
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
    private PlayerRepository playerRepository;

    @Override
    @Transactional
    public void run(String...args) throws Exception {
        log.info("Executing startup actions...");
        playerRepository.save(new PlayerEntity("John"));
        playerRepository.save(new PlayerEntity("Harry"));
        playerRepository.save(new PlayerEntity("George"));




        log.info("List of player from Database :");
        List<PlayerEntity> playersFromDB = playerRepository.findAll();
        for (PlayerEntity player : playersFromDB) {
            log.info("Retrived player: " + player);
        }
    }
}