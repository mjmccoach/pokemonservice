package com.projectpokemon.pokemonservice.factory.grassPokemon.oddishFamily;

import com.projectpokemon.pokemonservice.enums.StoneType;
import com.projectpokemon.pokemonservice.factory.grassPokemon.GrassPokemonInterface;
import com.projectpokemon.pokemonservice.factory.poisonPokemon.PoisonPokemonInterface;

import java.util.List;

public class GloomFactory implements GrassPokemonInterface, PoisonPokemonInterface {
    @Override
    public String supports() {
        return "Gloom";
    }

    @Override
    public List<String> validEvolutions() {
        return List.of("Vileplume");
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
    public StoneType getEvolutionStone() {
        return StoneType.LEAF;
    }
}
