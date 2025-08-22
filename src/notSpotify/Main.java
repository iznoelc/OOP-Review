package notSpotify;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // ---CREATING NEW SONGS---
        // create 3 songs for each genre that the user can pick from to add to their playlist
        Song rock1 = new Song("Rocket Skates", "Deftones", 4.233);
        Song rock2 = new Song("Screaming", "Loathe", 5.9);
        Song rock3 = new Song("Papercut", "Linkin Park", 3.067);

        Song pop1 = new Song("Good Luck, Babe", "Chappell Roan", 3.63);
        Song pop2 = new Song("Gameboy", "KATSEYE", 3.083);
        Song pop3 = new Song("G.I.R.L.", "8485", 2.7);

        Song jazz1 = new Song("Take Five", "Dave Brubeck", 5.467);
        Song jazz2 = new Song("So What", "Miles Davis", 9.367);
        Song jazz3 = new Song("Take The “A” Train", "Duke Ellington", 3.0);

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
        for (int i = 0; i < myUser.getAllPlaylists().size(); i++){
            if (myUser.getAllPlaylists().get(i).getPlaylistName().equals("mischief")){
                System.out.println("Found mischief playlist, adding songs");

                // add the songs we want to the playlist
                System.out.println("Adding song: " + pop1.getTitle() + " to playlist " + myUser.getAllPlaylists().get(i).getPlaylistName());
                myUser.getAllPlaylists().get(i).addSong(pop1);

                System.out.println("Adding song: " + pop2.getTitle() + " to playlist " + myUser.getAllPlaylists().get(i).getPlaylistName());
                myUser.getAllPlaylists().get(i).addSong(pop2);

                System.out.println("Adding song: " + pop3.getTitle() + " to playlist " + myUser.getAllPlaylists().get(i).getPlaylistName());
                myUser.getAllPlaylists().get(i).addSong(pop3);

                // then we could remove a song if we wanted
                System.out.println("Removing song: " + pop1.getTitle() + " from playlist " + myUser.getAllPlaylists().get(i).getPlaylistName());
                myUser.getAllPlaylists().get(i).removeSong(pop1);

            } else if (myUser.getAllPlaylists().get(i).getPlaylistName().equals("deep sea creature")){
                // add songs to other playlist
                System.out.println("Adding song: " + rock1.getTitle() + " to playlist " + myUser.getAllPlaylists().get(i).getPlaylistName());
                myUser.getAllPlaylists().get(i).addSong(rock1);

                System.out.println("Adding song: " + rock2.getTitle() + " to playlist " + myUser.getAllPlaylists().get(i).getPlaylistName());
                myUser.getAllPlaylists().get(i).addSong(rock2);

                System.out.println("Adding song: " + rock3.getTitle() + " to playlist " + myUser.getAllPlaylists().get(i).getPlaylistName());
                myUser.getAllPlaylists().get(i).addSong(rock3);
            }
        }

        // ---PRINTING PLAYLISTS---
        for (int i = 0; i < myUser.getAllPlaylists().size(); i++) {
            myUser.getAllPlaylists().get(i).playAllSongs();
        }

    }
}
