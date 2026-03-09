package com.projectpokemon.pokemonservice.factory.electricPokemon.zapdosFamily;

import com.projectpokemon.pokemonservice.factory.electricPokemon.ElectricPokemonInterface;
import com.projectpokemon.pokemonservice.factory.flyingPokemon.FlyingPokemonInterface;

import java.util.List;

public class ZapdosFactory implements ElectricPokemonInterface, FlyingPokemonInterface {
    @Override
    public String supports() {
        return "Zapdos";
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
