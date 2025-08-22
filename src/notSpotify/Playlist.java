package notSpotify;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    protected String name; // playlist name
    protected List<Song> songs = new ArrayList<>(); // create a list of songs

    public String getPlaylistName(){
        return name;
    }

    public void setPlaylistName(String name){
        this.name = name;
    }

    // add a song to the playlist
    public void addSong(Song song){
        songs.add(song);
    }

    // remove a song from the playlist
    public void removeSong(Song song){
        // check if song is in the playlist
        // if so, remove the song. else, notify the user that song wasn't in their playlist.
        if (songs.contains(song)){
            songs.remove(song);
        } else {
            System.out.println("That song isn't in your playlist!");
        }
    }

    public List<Song> getSongs() {
        return songs;
    }

    /**
     * "Play" all songs in the playlist by printing out their title, artist, and duration to the console
     */
    public void playAllSongs(){
        System.out.println("---YOUR PLAYLIST \"" + name + "\"---");
        // print all songs in format:
        // 0. artist: title
        // length: duration
        for (int i = 0; i < songs.size(); i++){
            System.out.print((i + 1) + ". ");
            System.out.println(songs.get(i).getArtist() + ": " + songs.get(i).getTitle());
            System.out.println("Length: " + songs.get(i).getDuration() + " minutes");
        }
    }
}
