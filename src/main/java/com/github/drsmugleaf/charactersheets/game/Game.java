package com.github.drsmugleaf.charactersheets.game;

import com.github.drsmugleaf.charactersheets.Nameable;
import com.github.drsmugleaf.charactersheets.character.Roster;
import com.github.drsmugleaf.charactersheets.location.World;

/**
 * Created by DrSmugleaf on 11/07/2019
 */
public class Game implements Nameable {

    private final String NAME;
    private final World WORLD;
    private final Roster ROSTER;
    private final Turn TURN;

    public Game(String name, World world, Roster roster, Turn turn) {
        NAME = name;
        WORLD = world;
        ROSTER = roster;
        TURN = turn;
    }

    @Override
    public String getName() {
        return NAME;
    }

    public World getWorld() {
        return WORLD;
    }

    public Roster getRoster() {
        return ROSTER;
    }

    public Turn getTurn() {
        return TURN;
    }

}
