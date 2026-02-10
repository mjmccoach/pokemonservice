package com.projectpokemon.pokemonservice.enums;

public enum StoneType {
    //TODO Move this into a shared library so can be accessed from Trainer and Pokemon Service.
    MOON("Moonstone"),
    FIRE("Firestone");

    private String value;

    StoneType(String value) {
        this.value = value;
    }
}
