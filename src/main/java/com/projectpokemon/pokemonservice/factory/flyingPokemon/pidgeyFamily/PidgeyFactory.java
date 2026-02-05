package com.projectpokemon.pokemonservice.factory.flyingPokemon.pidgeyFamily;

import com.projectpokemon.pokemonservice.factory.flyingPokemon.FlyingPokemonInterface;

import java.util.List;

public class PidgeyFactory implements FlyingPokemonInterface {
    @Override
    public String supports() {
        return "Pidgey";
    }

    @Override
    public List<String> validEvolutions() {
        return List.of("Pidgeotto");
    }

    @Override
    public int getEvolutionLevel() {
        return 18;
    }
}
