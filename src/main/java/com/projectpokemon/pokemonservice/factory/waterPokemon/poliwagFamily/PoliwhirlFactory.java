package com.projectpokemon.pokemonservice.factory.waterPokemon.poliwagFamily;

import com.projectpokemon.pokemonservice.enums.StoneType;
import com.projectpokemon.pokemonservice.factory.waterPokemon.WaterPokemonInterface;

import java.util.List;

public class PoliwhirlFactory implements WaterPokemonInterface {
    @Override
    public String supports() {
        return "Poliwhirl";
    }

    @Override
    public List<String> validEvolutions() {
        return List.of("Poliwrath");
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
        return StoneType.WATER;
    }
}
