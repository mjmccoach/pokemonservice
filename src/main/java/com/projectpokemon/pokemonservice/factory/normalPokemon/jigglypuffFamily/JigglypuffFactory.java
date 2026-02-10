package com.projectpokemon.pokemonservice.factory.normalPokemon.jigglypuffFamily;

import com.projectpokemon.pokemonservice.enums.StoneType;
import com.projectpokemon.pokemonservice.factory.normalPokemon.NormalPokemonInterface;

import java.util.List;

public class JigglypuffFactory implements NormalPokemonInterface {
    @Override
    public String supports() {
        return "Jigglypuff";
    }

    @Override
    public List<String> validEvolutions() {
        return List.of("Wigglytuff");
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
