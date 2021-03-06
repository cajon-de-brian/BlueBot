package com.github.drsmugleaf.database.model;

import com.github.drsmugleaf.Nullable;
import com.github.drsmugleaf.commands.api.EventListener;
import com.github.drsmugleaf.database.api.Database;
import com.github.drsmugleaf.database.api.Model;
import com.github.drsmugleaf.database.api.annotations.Column;
import com.github.drsmugleaf.database.api.annotations.Table;
import discord4j.core.event.domain.channel.PrivateChannelCreateEvent;

/**
 * Created by DrSmugleaf on 18/01/2018.
 */
@Table(name = "channels")
public class DiscordChannel extends Model<DiscordChannel> {

    @Column(name = "id")
    @Column.Id
    @Nullable
    public Long id;

    public DiscordChannel(@Nullable Long id) {
        this.id = id;
    }

    private DiscordChannel() {}

    @EventListener(PrivateChannelCreateEvent.class)
    public static void handle(PrivateChannelCreateEvent event) {
        Runnable runnable = () -> {
            long id = event.getChannel().getId().asLong();
            DiscordChannel channel = new DiscordChannel(id);
            channel.createIfNotExists();

            Database.LOGGER.debug("Created private discord channel with id " + id);
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }

    @Nullable
    public Long getId() {
        return id;
    }

}
