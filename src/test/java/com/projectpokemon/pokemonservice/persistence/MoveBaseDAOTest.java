package com.projectpokemon.pokemonservice.persistence;

import com.projectpokemon.pokemonservice.enums.PokemonType;
import com.projectpokemon.pokemonservice.objects.MoveBase;
import com.projectpokemon.pokemonservice.persistence.rowmapper.MoveBaseRowMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class MoveBaseDAOTest {

    private static final String SELECT_BY_ID = "SELECT * FROM move_base WHERE id = ?";
    private static final String SELECT_BY_TYPE = "SELECT * FROM move_base WHERE type = ?";
    private static final String SELECT_ALL = "SELECT * FROM move_base";

    private static final int MOVE_BASE_ID1 = 30;
    private static final String MOVE_BASE_NAME1 = "Flamethrower";
    private static final int PP1 = 15;
    private static final int MOVE_BASE_ID2 = 45;
    private static final String MOVE_BASE_NAME2 = "Thunderbolt";
    private static final int PP2 = 15;
    private static final int MOVE_BASE_ID3 = 50;
    private static final String MOVE_BASE_NAME3 = "Thunder";
    private static final int PP3 = 5;

    @Mock
    JdbcTemplate mockJdbcTemplate;
    @Mock
    MoveBaseRowMapper mockMoveBaseRowMapper;

    @InjectMocks
    private MoveBaseDAO moveBaseDAO;

    private MoveBase moveBase1;
    private MoveBase moveBase2;
    private MoveBase moveBase3;

    @BeforeEach
    void setUp() {
        moveBase1 = new MoveBase(MOVE_BASE_ID1, MOVE_BASE_NAME1, PokemonType.FIRE, PP1);
        moveBase2 = new MoveBase(MOVE_BASE_ID2, MOVE_BASE_NAME2, PokemonType.ELECTRIC, PP2);
        moveBase3 = new MoveBase(MOVE_BASE_ID3, MOVE_BASE_NAME3, PokemonType.ELECTRIC, PP3);
    }


    @Test
    void can_select_by_id() {
        when(mockJdbcTemplate.queryForObject(eq(SELECT_BY_ID), eq(mockMoveBaseRowMapper), eq(MOVE_BASE_ID1))).thenReturn(moveBase1);

        MoveBase actual = moveBaseDAO.getMoveBaseById(30);

        verify(mockJdbcTemplate).queryForObject(SELECT_BY_ID, mockMoveBaseRowMapper, MOVE_BASE_ID1);

        assertEquals(MOVE_BASE_ID1, actual.getId());
        assertEquals(MOVE_BASE_NAME1, actual.getName());
        assertEquals(PokemonType.FIRE, actual.getPokemonType());
        assertEquals(PP1, actual.getPp());
    }

    @Test
    void can_select_by_type() {
        when(mockJdbcTemplate.query(eq(SELECT_BY_TYPE), eq(mockMoveBaseRowMapper), eq(PokemonType.ELECTRIC.name()))).thenReturn(Arrays.asList(moveBase2, moveBase3));

        List<MoveBase> actual = moveBaseDAO.getMoveBaseByType(PokemonType.ELECTRIC.name());

        verify(mockJdbcTemplate).query(SELECT_BY_TYPE, mockMoveBaseRowMapper, PokemonType.ELECTRIC.name());

        assertEquals(2, actual.size());

        assertEquals(MOVE_BASE_ID2, actual.getFirst().getId());
        assertEquals(MOVE_BASE_NAME2, actual.getFirst().getName());
        assertEquals(PokemonType.ELECTRIC, actual.getFirst().getPokemonType());
        assertEquals(15, actual.getFirst().getPp());

        assertEquals(MOVE_BASE_ID3, actual.get(1).getId());
        assertEquals(MOVE_BASE_NAME3, actual.get(1).getName());
        assertEquals(PokemonType.ELECTRIC, actual.get(1).getPokemonType());
        assertEquals(PP3, actual.get(1).getPp());
    }

    @Test
    void can_get_all_moves() {
        when(mockJdbcTemplate.query(eq(SELECT_ALL), eq(mockMoveBaseRowMapper))).thenReturn(Arrays.asList(moveBase1, moveBase2, moveBase3));

        List<MoveBase> actual = moveBaseDAO.getAllMoves();

        verify(mockJdbcTemplate).query(SELECT_ALL, mockMoveBaseRowMapper);

        assertEquals(3, actual.size());

        assertEquals(MOVE_BASE_ID1, actual.getFirst().getId());
        assertEquals(MOVE_BASE_NAME1, actual.getFirst().getName());
        assertEquals(PokemonType.FIRE, actual.getFirst().getPokemonType());
        assertEquals(15, actual.getFirst().getPp());

        assertEquals(MOVE_BASE_ID2, actual.get(1).getId());
        assertEquals(MOVE_BASE_NAME2, actual.get(1).getName());
        assertEquals(PokemonType.ELECTRIC, actual.get(1).getPokemonType());
        assertEquals(15, actual.get(1).getPp());

        assertEquals(MOVE_BASE_ID3, actual.get(2).getId());
        assertEquals(MOVE_BASE_NAME3, actual.get(2).getName());
        assertEquals(PokemonType.ELECTRIC, actual.get(2).getPokemonType());
        assertEquals(PP3, actual.get(2).getPp());
    }
}