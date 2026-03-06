package com.projectpokemon.pokemonservice.factory.waterPokemon.laprasFamily;

import com.projectpokemon.pokemonservice.factory.icePokemon.IcePokemonInterface;
import com.projectpokemon.pokemonservice.factory.waterPokemon.WaterPokemonInterface;

import java.util.List;

public class LaprasFactory implements WaterPokemonInterface, IcePokemonInterface {
    @Override
    public String supports() {
        return "Lapras";
    }

    @Override
    public List<String> validEvolutions() {
        return List.of();
    }

    @Override
    public int getEvolutionLevel() {
        return 0;
    }
}
