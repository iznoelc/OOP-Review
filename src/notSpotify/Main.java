package notSpotify;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // create playlists for each song type
        PopPlaylist allPopSongs = new PopPlaylist();
        RockPlaylist allRockSongs = new RockPlaylist();
        JazzPlaylist allJazzSongs = new JazzPlaylist();

        // ---CREATING NEW SONGS---
        // create 3 songs for each genre that the user can pick from to add to their playlist
        // FOR 1C: add 2 songs per genre so there are 5 songs per genre
        String[][] rockSongs = {
                {"Rocket Skates", "Deftones", "4.233"},
                {"Screaming", "Loathe", "5.9"},
                {"Papercut", "Linkin Park", "3.067"},
        };

        // add all rock songs to rock playlist
        for (String[] song : rockSongs){
            allRockSongs.addSong(new Song(song[0], song[1], Double.parseDouble(song[2])));
        }

        String[][] popSongs = {
                {"Good Luck, Babe", "Chappell Roan", "3.63"},
                {"Gameboy", "KATSEYE", "3.083"},
                {"G.I.R.L.", "8485", "2.7"},
        };

        for (String[] song : popSongs){
            allPopSongs.addSong(new Song(song[0], song[1], Double.parseDouble(song[2])));
        }

        String[][] jazzSongs = {
                {"Take Five", "Dave Brubeck", "5.467"},
                {"So What", "Miles Davis", "9.367"},
                {"Take The \"A\" Train", "Duke Ellington", "3.0"},
        };

        for (String[] song : jazzSongs){
            allJazzSongs.addSong(new Song(song[0], song[1], Double.parseDouble(song[2])));
        }

        // ---CREATING A USER---
        // then set the username
        User myUser = new User();
        myUser.setUsername("iznoelc");

        // ---CREATING PLAYLISTS---
        myUser.createPlaylist("mischief", "pop");
        myUser.createPlaylist("deep sea creature", "rock");

        // ---ADDING/REMOVING SONGS---
        // say we want to add a song to the "mischief" playlist
        // we can loop through all playlists until we find one with a name
        // equaling mischief. since there could be "Mischief" and "mischief"
        // we can just use equals instead of equalsIgnoreCase.
        for (Playlist playlist : myUser.getAllPlaylists()){
            if (playlist.getPlaylistName().equals("mischief")){
                System.out.println("Found mischief playlist, adding songs");

                // add the songs we want to the playlist
                System.out.println("Adding song: " + allPopSongs.getSongs().get(0).getTitle() + " to playlist " + playlist.getPlaylistName());
                playlist.addSong(allPopSongs.getSongs().get(0));

                System.out.println("Adding song: " + allPopSongs.getSongs().get(1).getTitle() + " to playlist " + playlist.getPlaylistName());
                playlist.addSong(allPopSongs.getSongs().get(1));

                System.out.println("Adding song: " + allPopSongs.getSongs().get(2).getTitle() + " to playlist " + playlist.getPlaylistName());
                playlist.addSong(allPopSongs.getSongs().get(2));

                // then we could remove a song if we wanted
                System.out.println("Removing song: " + allPopSongs.getSongs().get(0).getTitle() + " from playlist " + playlist.getPlaylistName());
                playlist.removeSong(allPopSongs.getSongs().get(0));

            } else if (playlist.getPlaylistName().equals("deep sea creature")){
                // add songs to other playlist
                System.out.println("Adding song: " + allRockSongs.getSongs().get(0).getTitle() + " to playlist " + playlist.getPlaylistName());
                playlist.addSong(allRockSongs.getSongs().get(0));

                System.out.println("Adding song: " + allRockSongs.getSongs().get(1).getTitle() + " to playlist " + playlist.getPlaylistName());
                playlist.addSong(allRockSongs.getSongs().get(1));

                System.out.println("Adding song: " + allRockSongs.getSongs().get(2).getTitle() + " to playlist " + playlist.getPlaylistName());
                playlist.addSong(allRockSongs.getSongs().get(2));
            }
        }

        // ---PRINTING PLAYLISTS---
        for (Playlist playlist : myUser.getAllPlaylists()) {
            playlist.playAllSongs();
        }

    }
}
