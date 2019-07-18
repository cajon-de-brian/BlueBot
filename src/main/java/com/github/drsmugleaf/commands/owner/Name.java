package com.github.drsmugleaf.commands.owner;

import com.github.drsmugleaf.BanterBot4J;
import com.github.drsmugleaf.commands.api.Command;
import com.github.drsmugleaf.commands.api.CommandInfo;
import com.github.drsmugleaf.commands.api.tags.Tags;

/**
 * Created by DrSmugleaf on 10/06/2018
 */
@CommandInfo(
        tags = {Tags.OWNER_ONLY},
        description = "Change the bot's name"
)
public class Name extends Command {

    private static String invalidArgumentsResponse() {
        return "Invalid arguments.\n" +
               "**Formats:**\n" +
               BanterBot4J.BOT_PREFIX + "name username\n" +
               "**Examples:**\n" +
               BanterBot4J.BOT_PREFIX + "name Banter Bot4J";
    }

    @Override
    public void run() {
        String name = String.join(" ", ARGUMENTS);
        if (name.isEmpty()) {
            reply(invalidArgumentsResponse()).subscribe();
            return;
        }

        EVENT
                .getClient()
                .edit(self -> self.setUsername(String.join(" ", ARGUMENTS)))
                .flatMap(newName -> reply("Changed the bot's name to " + name))
                .subscribe();
    }

}
