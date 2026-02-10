package com.projectpokemon.pokemonservice.factory.normalPokemon.clefairyFamily;

import com.projectpokemon.pokemonservice.enums.StoneType;
import com.projectpokemon.pokemonservice.factory.normalPokemon.NormalPokemonInterface;

import java.util.List;

public class ClefairyFactory implements NormalPokemonInterface {
    @Override
    public String supports() {
        return "Clefairy";
    }

    @Override
    public List<String> validEvolutions() {
        return List.of("Clefable");
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
        return StoneType.MOON;
    }
}
