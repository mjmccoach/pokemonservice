package com.projectpokemon.pokemonservice.persistence.rowmapper;

import com.projectpokemon.pokemonservice.enums.PokemonType;
import com.projectpokemon.pokemonservice.objects.MoveBase;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class MoveBaseRowMapper implements RowMapper<MoveBase> {
    @Override
    public MoveBase mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new MoveBase(
                rs.getInt("id"),
                rs.getString("name"),
                PokemonType.valueOf(rs.getString("type").toUpperCase()),
                rs.getInt("maxpp"));
    }
}
