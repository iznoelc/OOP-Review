package notSpotify;

import java.util.ArrayList;
import java.util.List;

public class RockPlaylist implements Playlist {
    private String name; // playlist name
    private List<Song> songs = new ArrayList<>();

    public String getPlaylistName(){
        return name;
    }

    public void setPlaylistName(String name){
        this.name = name;
    }

    public List<Song> getSongs(){
        return songs;
    }

    @Override
    public void addSong(Song song){
        songs.add(song);
    }

    @Override
    public void removeSong(Song song){
        // check if song is in the playlist
        // if so, remove the song. else, notify the user that song wasn't in their playlist.
        if (songs.contains(song)){
            songs.remove(song);
        } else {
            System.out.println("That song isn't in your playlist!");
        }
    }

    @Override
    public void playAllSongs(){
        System.out.println("---YOUR ROCK PLAYLIST \"" + name + "\"---");
        // print all songs in format:
        // 0. artist: title
        // length: duration
        for (int i = 0; i < songs.size(); i++) {
            System.out.print((i + 1) + ". ");
            System.out.println(songs.get(i).getArtist() + ": " + songs.get(i).getTitle());
            System.out.println("Length: " + songs.get(i).getDuration() + " minutes");
        }
    }
}
