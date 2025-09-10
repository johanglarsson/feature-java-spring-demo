package se.demo.game.api;

import se.demo.game.domain.Game;
import se.demo.game.domain.GameCategory;

record GameResponseDto(Long id, String name, GameCategory category, int rating) {

    static GameResponseDto fromDomain(Game game) {
        return new GameResponseDto(game.id(), game.name(), game.category(), game.rating());
    }
}
