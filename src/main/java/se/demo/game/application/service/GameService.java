package se.demo.game.application.service;

import java.util.Collection;
import java.util.Objects;

import org.springframework.stereotype.Service;

import se.demo.game.application.infrastructure.db.GameEntity;
import se.demo.game.application.infrastructure.db.GameRepository;
import se.demo.game.domain.Game;

@Service
public class GameService {

    private final GameRepository gameRepository;

    public GameService(final GameRepository gameRepository) {
        this.gameRepository = Objects.requireNonNull(gameRepository);
    }

    public Collection<Game> getAllGames() {
        Collection<GameEntity> gameEntities = gameRepository.findAll();
        return gameEntities.stream()
                .map(e -> new Game(e.getId(), e.getName(), e.getCategory(), e.getRating()))
                .toList();
    }

}
