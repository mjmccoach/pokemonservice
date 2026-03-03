package com.projectpokemon.pokemonservice.factory.waterPokemon.shellderFamily;

import com.projectpokemon.pokemonservice.enums.StoneType;
import com.projectpokemon.pokemonservice.factory.waterPokemon.WaterPokemonInterface;

import java.util.List;

public class ShellderFactory implements WaterPokemonInterface {
    @Override
    public String supports() {
        return "Shellder";
    }

    @Override
    public List<String> validEvolutions() {
        return List.of("Cloyster");
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
    public List<StoneType> getEvolutionStone() {
        return List.of(StoneType.WATER);
    }
}
