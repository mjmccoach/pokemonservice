package com.projectpokemon.pokemonservice.factory;

import com.projectpokemon.pokemonservice.enums.StoneType;
import org.apache.commons.lang3.NotImplementedException;

import java.util.List;

public interface Pokemon {
    String supports();

    List<String> validEvolutions();

    int getEvolutionLevel();

    default boolean evolvesWithStone() {
        return false;
    }

    default StoneType getEvolutionStone() {
        throw new NotImplementedException();
    }
}
