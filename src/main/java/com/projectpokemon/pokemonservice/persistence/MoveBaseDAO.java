package com.projectpokemon.pokemonservice.persistence;

import com.projectpokemon.pokemonservice.objects.MoveBase;
import com.projectpokemon.pokemonservice.persistence.rowmapper.MoveBaseRowMapper;
import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@AllArgsConstructor
public class MoveBaseDAO {

    private static final String SELECT_BY_ID = "SELECT * FROM move_base WHERE id = ?";
    private static final String SELECT_BY_TYPE = "SELECT * FROM move_base WHERE type = ?";
    private static final String SELECT_ALL = "SELECT * FROM move_base";
    private static final String INSERT = "INSERT INTO move_base VALUES (?, ?, ?)";

    private MoveBaseRowMapper moveBaseRowMapper;
    private JdbcTemplate jdbcTemplate;

    public MoveBase getMoveBaseById(int id) {
        return jdbcTemplate.queryForObject(SELECT_BY_ID, moveBaseRowMapper, id);
    }

    public List<MoveBase> getMoveBaseByType(String type) {
        return jdbcTemplate.query(SELECT_BY_TYPE, moveBaseRowMapper, type);
    }

    public List<MoveBase> getAllMoves() {
        return jdbcTemplate.query(SELECT_ALL, moveBaseRowMapper);
    }
}
