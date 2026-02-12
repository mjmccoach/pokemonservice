package com.projectpokemon.pokemonservice.factory.firePokemon.growlitheFamily;

import com.projectpokemon.pokemonservice.enums.StoneType;
import com.projectpokemon.pokemonservice.factory.firePokemon.FirePokemonInterface;

import java.util.List;

public class GrowlitheFactory implements FirePokemonInterface {
    @Override
    public String supports() {
        return "Growlithe";
    }

    @Override
    public List<String> validEvolutions() {
        return List.of("Arcanine");
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
    public StoneType getEvolutionStone() {
        return StoneType.FIRE;
    }
}
