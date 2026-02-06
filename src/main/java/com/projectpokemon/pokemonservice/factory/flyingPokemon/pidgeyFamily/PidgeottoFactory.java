package com.projectpokemon.pokemonservice.factory.flyingPokemon.pidgeyFamily;

import com.projectpokemon.pokemonservice.factory.flyingPokemon.FlyingPokemonInterface;
import com.projectpokemon.pokemonservice.factory.normalPokemon.NormalPokemonInterface;

import java.util.List;

public class PidgeottoFactory implements FlyingPokemonInterface, NormalPokemonInterface {
    @Override
    public String supports() {
        return "Pidgeotto";
    }

    @Override
    public List<String> validEvolutions() {
        return List.of("Pidgeot");
    }

    @Override
    public int getEvolutionLevel() {
        return 36;
    }
}
