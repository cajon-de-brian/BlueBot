package com.github.drsmugleaf.youtube;

import com.github.drsmugleaf.commands.Youtube;
import com.sedmelluq.discord.lavaplayer.player.AudioLoadResultHandler;
import com.sedmelluq.discord.lavaplayer.tools.FriendlyException;
import com.sedmelluq.discord.lavaplayer.track.AudioPlaylist;
import com.sedmelluq.discord.lavaplayer.track.AudioTrack;
import sx.blah.discord.handle.obj.IChannel;
import sx.blah.discord.handle.obj.IUser;

import javax.annotation.Nonnull;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by DrSmugleaf on 05/09/2017.
 */
public class AudioResultHandler implements AudioLoadResultHandler {

    private final GuildMusicManager MUSIC_MANAGER;
    private final IChannel CHANNEL;
    private final IUser SUBMITTER;
    private final String SEARCH_STRING;

    public AudioResultHandler(@Nonnull IChannel channel, @Nonnull IUser submitter, @Nonnull String searchString) {
        MUSIC_MANAGER = Youtube.getGuildMusicManager(channel.getGuild());
        CHANNEL = channel;
        SUBMITTER = submitter;
        SEARCH_STRING = searchString;
    }

    public IChannel getChannel() {
        return CHANNEL;
    }

    public IUser getSubmitter() {
        return SUBMITTER;
    }

    public String getSearchString() {
        return SEARCH_STRING;
    }

    @Override
    public void trackLoaded(AudioTrack track) {
        Song song = new Song(track, CHANNEL, SUBMITTER);
        MUSIC_MANAGER.getScheduler().queue(song);
    }

    @Override
    public void playlistLoaded(AudioPlaylist playlist) {
        List<AudioTrack> tracks = playlist.getTracks();
        List<Song> songs = new ArrayList<>();

        for (AudioTrack track : tracks) {
            Song song = new Song(track, CHANNEL, SUBMITTER);
            songs.add(song);
        }

        MUSIC_MANAGER.getScheduler().queue(songs);
    }

    @Override
    public void noMatches() {
        Event event = new NoMatchesEvent(this);
        EventDispatcher.dispatch(event);
    }

    @Override
    public void loadFailed(FriendlyException exception) {
        Event event = new LoadFailedEvent(this, exception);
        EventDispatcher.dispatch(event);
    }

}
