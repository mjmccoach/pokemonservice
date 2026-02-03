package com.projectpokemon.pokemonservice.factory;

import java.util.List;

public interface Pokemon {
    String supports();

    List<String> validEvolutions();

    int getEvolutionLevel();
}
