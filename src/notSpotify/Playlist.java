package notSpotify;

import java.util.ArrayList;
import java.util.List;

public interface Playlist {
    String getPlaylistName();
    void setPlaylistName(String name);
    List<Song> getSongs();
    void addSong(Song song);
    void removeSong(Song song);
    void playAllSongs();
}
