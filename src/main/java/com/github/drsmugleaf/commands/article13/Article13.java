package com.github.drsmugleaf.commands.article13;

import com.github.drsmugleaf.article13.entities.Country;
import com.github.drsmugleaf.article13.entities.Party;
import com.github.drsmugleaf.article13.vote.Decision;
import com.github.drsmugleaf.article13.vote.Vote;
import com.github.drsmugleaf.commands.api.Argument;
import com.github.drsmugleaf.commands.api.Command;
import com.github.drsmugleaf.commands.api.CommandReceivedEvent;
import com.github.drsmugleaf.commands.api.converter.TypeConverters;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by DrSmugleaf on 07/04/2019
 */
public class Article13 extends Command {

    @Argument(position = 1, example = "spain")
    private Country country;

    @Argument(position = 2, example = "for/against")
    private Decision decision;

    @Argument(position = 3, example = "final")
    private Vote vote;

    @Override
    public void run() {
        List<Party> parties = country
                .getParties()
                .entrySet()
                .stream()
                .sorted(((o1, o2) -> o1.getValue().compareVote(o2.getValue(), vote, decision)))
                .map(Map.Entry::getValue)
                .collect(Collectors.toList());

        StringBuilder response = new StringBuilder("\n");
        for (Party party : parties) {
            String partyName = party.getName();
            int votes = party.getVotes(vote).getResult(decision).getVotes();

            response
                    .append("**")
                    .append(partyName)
                    .append("**")
                    .append(" (")
                    .append(votes)
                    .append(")\n");
        }

        reply(response.toString()).subscribe();
    }

    @Override
    public void registerConverters(TypeConverters converter) {
        converter.registerStringTo(CommandReceivedEvent.class, Country.class, (s, e) -> Country.getCountry(s));
        converter.registerStringTo(CommandReceivedEvent.class, Decision.class, (s, e) -> Decision.from(s));
        converter.registerStringTo(CommandReceivedEvent.class, Vote.class, (s, e) -> Vote.getVote(s));
    }

}
