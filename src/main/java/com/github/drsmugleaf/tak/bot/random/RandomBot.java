package com.github.drsmugleaf.tak.bot.random;

import com.github.drsmugleaf.tak.Game;
import com.github.drsmugleaf.tak.board.Coordinates;
import com.github.drsmugleaf.tak.board.Preset;
import com.github.drsmugleaf.tak.bot.Bot;
import com.github.drsmugleaf.tak.pieces.Color;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by DrSmugleaf on 16/03/2019
 */
public abstract class RandomBot extends Bot {

    protected RandomBot(String name, Game game, Color color, Preset preset) {
        super(name, game, color, preset);
    }

    @Nullable
    @Override
    public Coordinates getNextMove() {
        List<Coordinates> availableActions = getAvailableActions();
        if (availableActions.isEmpty()) {
            return null;
        }

        int random = ThreadLocalRandom.current().nextInt(availableActions.size());
        return availableActions.get(random);
    }

}