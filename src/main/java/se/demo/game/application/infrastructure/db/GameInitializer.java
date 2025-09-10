package se.demo.game.application.infrastructure.db;

import java.util.List;
import java.util.Objects;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import jakarta.transaction.Transactional;
import se.demo.game.domain.GameCategory;

@Component
class GameInitializer implements CommandLineRunner {

    private final Logger logger = LoggerFactory.getLogger(GameInitializer.class);
    private final GameRepository gameRepository;

    GameInitializer(final GameRepository gameRepository) {
        this.gameRepository = Objects.requireNonNull(gameRepository);
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        GameEntity uncharted = new GameEntity();
        uncharted.setName("Uncharted - A Thieves End");
        uncharted.setRating(10);
        uncharted.setCategory(GameCategory.ADVENTURE);
        GameEntity deathStranding = new GameEntity();
        deathStranding.setName("Death Stranding 2");
        deathStranding.setCategory(GameCategory.ADVENTURE);
        deathStranding.setRating(9);
        gameRepository.saveAll(List.of(uncharted, deathStranding));
        logger.info("Initialized games successfully");
    }

}
