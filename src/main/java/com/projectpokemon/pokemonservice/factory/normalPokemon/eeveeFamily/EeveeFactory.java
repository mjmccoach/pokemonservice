package com.projectpokemon.pokemonservice.factory.normalPokemon.eeveeFamily;

import com.projectpokemon.pokemonservice.enums.StoneType;
import com.projectpokemon.pokemonservice.factory.normalPokemon.NormalPokemonInterface;

import java.util.List;

public class EeveeFactory implements NormalPokemonInterface {
    @Override
    public String supports() {
        return "Eevee";
    }

    @Override
    public List<String> validEvolutions() {
        return List.of("Flareon", "Jolteon", "Vaporeon");
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
        return List.of(StoneType.FIRE, StoneType.THUNDER, StoneType.WATER);
    }
}
