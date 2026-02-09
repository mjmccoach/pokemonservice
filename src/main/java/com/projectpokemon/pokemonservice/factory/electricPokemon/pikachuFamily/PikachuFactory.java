package com.projectpokemon.pokemonservice.factory.electricPokemon.pikachuFamily;

import com.projectpokemon.pokemonservice.factory.electricPokemon.ElectricPokemonInterface;

import java.util.List;

public class PikachuFactory implements ElectricPokemonInterface {
    @Override
    public String supports() {
        return "Pikachu";
    }

    @Override
    public List<String> validEvolutions() {
        return List.of("Raichu");
    }

    @Override
    public int getEvolutionLevel() {
        return 0;
    }

    @Override
    public boolean evolvesWithThunderStone() {
        return true;
    }
}
