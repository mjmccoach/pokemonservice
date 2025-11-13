package com.projectpokemon.pokemonservice.service;

import com.projectpokemon.pokemonservice.objects.PokemonBase;
import com.projectpokemon.pokemonservice.objects.UpdatePokemonBasePayload;
import com.projectpokemon.pokemonservice.persistence.PokemonBaseDAO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class PokemonBaseService {

    private PokemonBaseDAO pokemonBaseDAO;

    public PokemonBase getPokemonBaseById(int id) {
        return pokemonBaseDAO.getPokemonBaseById(id);
    }

    public List<PokemonBase> getAllPokemonBases() {
        return pokemonBaseDAO.getAllPokemonBases();
    }

    public PokemonBase updatePokemonBase(int id, UpdatePokemonBasePayload updatePokemonBasePayload) {
        pokemonBaseDAO.updatePokemonBase(
                updatePokemonBasePayload.getName(),
                updatePokemonBasePayload.getPrimaryType(),
                updatePokemonBasePayload.getSecondaryType(),
                id);
        return pokemonBaseDAO.getPokemonBaseById(id);
    }

    public PokemonBase createPokemonBase() {
        return null;
    }

    public void deletePokemonBaseById(int id) {
        pokemonBaseDAO.deletePokemonBaseById(id);
    }
}
