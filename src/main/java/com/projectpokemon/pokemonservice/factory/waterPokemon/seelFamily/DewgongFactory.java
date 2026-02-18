package com.projectpokemon.pokemonservice.factory.waterPokemon.seelFamily;

import com.projectpokemon.pokemonservice.factory.icePokemon.IcePokemonInterface;
import com.projectpokemon.pokemonservice.factory.waterPokemon.WaterPokemonInterface;

import java.util.List;

public class DewgongFactory implements WaterPokemonInterface, IcePokemonInterface {
    @Override
    public String supports() {
        return "Dewgong";
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
