package com.projectpokemon.pokemonservice.enums;

public enum PokemonType {

    FIRE("fire"),
    GRASS("grass"),
    WATER("water"),
    ELECTRIC("electric"),
    BUG("bug"),
    POISON("poison"),
    GROUND("ground"),
    ROCK("rock"),
    PSYCHIC("psychic"),
    GHOST("ghost"),
    FIGHTING("fighting"),
    FLYING("flying"),
    ICE("ice"),
    NORMAL("normal"),
    DRAGON("dragon");

    private String value;

    PokemonType(String value) {
        this.value = value;
    }
}
