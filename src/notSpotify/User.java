package notSpotify;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List<Playlist> playlists = new ArrayList<>(); // ArrayList for a list of all user's playlists

    public void setUsername(String username){
        this.username = username;
    }

    public String getUsername(){
        return username;
    }

    public List<Playlist> getAllPlaylists(){
        return playlists;
    }

    /**
     * Creates a playlist based on the type parameter. Will create a default
     * playlist if type entered does match any of the existing types. Then, sets the playlist name
     * and adds it to the user's ArrayList of playlists.
     *
     * @param  name  a String to represent the playlist's name
     * @param  type a String representing the playlist's type (pop, jazz, rock, default)
     */
    public void createPlaylist(String name, String type){
        Playlist playlist;

        // check playlist type and create a new playlist instance accordingly
        if (type.equalsIgnoreCase("jazz")){
            playlist = new JazzPlaylist();
        } else if (type.equalsIgnoreCase("rock")){
            playlist = new RockPlaylist();
        } else {
            // default to a pop playlist otherwise
            playlist = new PopPlaylist();
        }

        playlist.setPlaylistName(name); // set the playlist name
        playlists.add(playlist); // add playlist to user's lists of playlists
    }

    /**
     * Deletes a playlist from the user's ArrayList of playlists.
     *
     * @param  playlist Playlist to be deleted
     */
    public void deletePlaylist(Playlist playlist){
        // check if playlist exists
        // if so, remove the playlist. else, notify the user that the playlist doesn't exist!
        if (playlists.contains(playlist)){
            playlists.remove(playlist);
        } else {
            System.out.println("That playlist doesn't exist!");
        }
    }

    /**
     * Adds a song to a specified playlist
     *
     * @param  playlist playlist for the song to be added to
     * @param  song song to be added to the specified playlist
     */
    public void addSongToPlaylist(Playlist playlist, Song song){
        playlist.addSong(song);
    }

    /**
     * Removes a song from a specified playlist
     *
     * @param  playlist playlist for the song to be removed from
     * @param  song song to be removed from the specified playlist
     */
    public void removeSongFromPlaylist(Playlist playlist, Song song){
        playlist.removeSong(song);
    }
}
