package com.projectpokemon.pokemonservice.enums;

public enum PokemonType {

    FIRE("fire"),
    GRASS("grass"),
    WATER("water"),
    ELECTRIC("electric"),
    BUG("bug"),
    POISON("poison");

    private String value;

    PokemonType(String value) {
        this.value = value;
    }
}
