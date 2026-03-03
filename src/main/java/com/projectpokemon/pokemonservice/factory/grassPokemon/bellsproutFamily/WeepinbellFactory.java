package com.projectpokemon.pokemonservice.factory.grassPokemon.bellsproutFamily;

import com.projectpokemon.pokemonservice.enums.StoneType;
import com.projectpokemon.pokemonservice.factory.grassPokemon.GrassPokemonInterface;
import com.projectpokemon.pokemonservice.factory.poisonPokemon.PoisonPokemonInterface;

import java.util.List;

public class WeepinbellFactory implements GrassPokemonInterface, PoisonPokemonInterface {
    @Override
    public String supports() {
        return "Weepinbell";
    }

    @Override
    public List<String> validEvolutions() {
        return List.of("Victreebel");
    }

    @Override
    public int getEvolutionLevel() {
        return 0;
    }

    @Override
    public boolean evolvesWithStone() {
        return true;
    }

    @Override
    public List<StoneType> getEvolutionStone() {
        return List.of(StoneType.LEAF);
    }
}
