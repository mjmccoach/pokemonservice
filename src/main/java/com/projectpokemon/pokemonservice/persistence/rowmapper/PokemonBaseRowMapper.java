package com.projectpokemon.pokemonservice.persistence.rowmapper;

import com.projectpokemon.pokemonservice.enums.PokemonType;
import com.projectpokemon.pokemonservice.objects.PokemonBase;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class PokemonBaseRowMapper implements RowMapper<PokemonBase> {
    @Override
    public PokemonBase mapRow(ResultSet rs, int rowNum) throws SQLException {
        PokemonType secondaryType = null;
        if (rs.getString("secondary_type") != null) {
            secondaryType = PokemonType.valueOf(rs.getString("secondary_type").toUpperCase());
        }

        return new PokemonBase(
                rs.getInt("id"),
                rs.getString("name"),
                PokemonType.valueOf(rs.getString("primary_type").toUpperCase()),
                secondaryType);
    }
}
