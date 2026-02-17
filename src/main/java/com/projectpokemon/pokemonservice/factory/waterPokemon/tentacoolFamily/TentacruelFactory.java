package com.projectpokemon.pokemonservice.factory.waterPokemon.tentacoolFamily;

import com.projectpokemon.pokemonservice.factory.poisonPokemon.PoisonPokemonInterface;
import com.projectpokemon.pokemonservice.factory.waterPokemon.WaterPokemonInterface;

import java.util.List;

public class TentacruelFactory implements WaterPokemonInterface, PoisonPokemonInterface {
    @Override
    public String supports() {
        return "Tentacruel";
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
