package com.projectpokemon.pokemonservice.persistence;

import com.projectpokemon.pokemonservice.enums.PokemonType;
import com.projectpokemon.pokemonservice.objects.PokemonBase;
import com.projectpokemon.pokemonservice.persistence.rowmapper.PokemonBaseRowMapper;
import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@AllArgsConstructor
public class PokemonBaseDAO {

    private static final String SELECT_BY_ID = "SELECT * from PokemonBase where id = ?";
    private static final String SELECT_ALL = "SELECT * from PokemonBase";
    private static final String UPDATE = "UPDATE `PokemonBase` " +
            "                             SET name = '%s' " +
            "                             primary_type = '%s' " +
            "                             secondary_type = '%s " +
            "                             WHERE id = %s;";
    private static final String DELETE = "DELETE from PokemonBase where id = ?";

    private final JdbcTemplate jdbcTemplate;
    private final PokemonBaseRowMapper pokemonBaseRowMapper;

    public PokemonBase getPokemonBaseById(int id) {
        return jdbcTemplate.queryForObject(SELECT_BY_ID, pokemonBaseRowMapper, id);
    }

    public List<PokemonBase> getAllPokemonBases() {
        return jdbcTemplate.query(SELECT_ALL, pokemonBaseRowMapper);
    }

    public void updatePokemonBase(String name, PokemonType primaryType, PokemonType secondaryType, int id) {
        jdbcTemplate.update(String.format(UPDATE, name, primaryType, secondaryType, id));
    }

    public void deletePokemonBaseById(int id) {
        jdbcTemplate.update(DELETE, id);
    }


}
