package com.projectpokemon.pokemonservice.factory.waterPokemon.shellderFamily;

import com.projectpokemon.pokemonservice.factory.icePokemon.IcePokemonInterface;
import com.projectpokemon.pokemonservice.factory.waterPokemon.WaterPokemonInterface;

import java.util.List;

public class CloysterFactory implements WaterPokemonInterface, IcePokemonInterface {
    @Override
    public String supports() {
        return "Cloyster";
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
