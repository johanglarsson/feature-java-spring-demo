package se.demo.game.api;

import java.util.Collection;
import java.util.List;
import java.util.Objects;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import se.demo.game.application.service.GameService;

@RestController
class GameController {

    private final GameService gameService;

    GameController(final GameService gameService) {
        this.gameService = Objects.requireNonNull(gameService);
    }

    @GetMapping
    ResponseEntity<Collection<GameResponseDto>> getGames() {
        List<GameResponseDto> response = gameService.getAllGames().stream().map(GameResponseDto::fromDomain).toList();
        return ResponseEntity.ok().body(response);
    }

}
