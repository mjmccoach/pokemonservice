package com.projectpokemon.pokemonservice.factory.waterPokemon.goldeenFamily;

import com.projectpokemon.pokemonservice.factory.waterPokemon.WaterPokemonInterface;

import java.util.List;

public class GoldeenFactory implements WaterPokemonInterface {
    @Override
    public String supports() {
        return "Goldeen";
    }

    @Override
    public List<String> validEvolutions() {
        return List.of("Seaking");
    }

    @Override
    public int getEvolutionLevel() {
        return 33;
    }
}
