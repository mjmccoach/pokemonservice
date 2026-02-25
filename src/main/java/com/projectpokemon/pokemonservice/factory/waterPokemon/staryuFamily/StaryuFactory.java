package com.projectpokemon.pokemonservice.factory.waterPokemon.staryuFamily;

import com.projectpokemon.pokemonservice.enums.StoneType;
import com.projectpokemon.pokemonservice.factory.waterPokemon.WaterPokemonInterface;

import java.util.List;

public class StaryuFactory implements WaterPokemonInterface {
    @Override
    public String supports() {
        return "Staryu";
    }

    @Override
    public List<String> validEvolutions() {
        return List.of("Starmie");
    }

    @Override
    public int getEvolutionLevel() {
        return 0;
    }

    public boolean evolvesWithStone() {
        return true;
    }

    public StoneType getEvolutionStone() {
        return StoneType.WATER;
    }
}
