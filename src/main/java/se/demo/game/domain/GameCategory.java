package se.demo.game.domain;

public enum GameCategory {

    FANTASY("fantasy"),
    ACTION("action"),
    SPORTS("sports"),
    ADVENTURE("adventure"),
    RPG("rpg");

    private final String name;

    private GameCategory(final String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
