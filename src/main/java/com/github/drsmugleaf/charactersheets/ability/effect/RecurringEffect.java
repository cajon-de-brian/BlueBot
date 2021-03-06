package com.github.drsmugleaf.charactersheets.ability.effect;

import com.github.drsmugleaf.charactersheets.character.Character;

/**
 * Created by DrSmugleaf on 12/07/2019
 */
public class RecurringEffect implements IEffect {

    private final IEffect EFFECT;
    private final long TIMES;
    private long elapsed = 0;

    public RecurringEffect(IEffect effect, long times) {
        EFFECT = effect;
        TIMES = times;
    }

    @Override
    public boolean isValid(Character user, Character on) {
        return EFFECT.isValid(user, on);
    }

    @Override
    public void use(Character on, Character user) {
        Runnable effect = () -> EFFECT.use(on, user);
        elapsed++;
        if (elapsed <= TIMES) {
//            game.getTurn().addEffect(effect);
        }
    }

    public long getTimes() {
        return TIMES;
    }

    public long getElapsed() {
        return elapsed;
    }

}
