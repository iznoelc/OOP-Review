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

        // create an upbeat playlist. for the assignment, since we have converted
        // "Playlist" into an interface, i will use PopPlaylist for this demonstration,
        // but it would make more sense to use a "Default" playlist, where Playlist is a class
        // and Pop, Rock, Jazz, etc. are children of the default playlist class, since---like for
        // ---recommendations, Playlists may mix types and songs may not be all in one specific genre.
        PopPlaylist upbeatSongs = new PopPlaylist();

        Recommender recommend = new Recommender(); // initialize a recommender


        // ---CREATING NEW SONGS---
        // create 3 songs for each genre that the user can pick from to add to their playlist
        // FOR 1C: add 2 songs per genre so there are 5 songs per genre
        String[][] rockSongs = {
                {"Rocket Skates", "Deftones", "4.233"},
                {"Screaming", "Loathe", "5.9"},
                {"Papercut", "Linkin Park", "3.067"},
                {"Smells Like Teen Spirit", "Nirvana", "5.033"},
                {"my mind is a mountain", "Deftones", "2.85"},
        };

        // add all rock songs to rock playlist
        for (String[] song : rockSongs){
            allRockSongs.addSong(new Song(song[0], song[1], Double.parseDouble(song[2])));
        }

        String[][] popSongs = {
                {"Good Luck, Babe", "Chappell Roan", "3.63"},
                {"Gameboy", "KATSEYE", "3.083"},
                {"G.I.R.L.", "8485", "2.7"},
                {"Asheville", "glaive", "2.633"},
                {"Knock Yourself Out XD", "Porter Robinson", "2.8"},
        };

        for (String[] song : popSongs){
            allPopSongs.addSong(new Song(song[0], song[1], Double.parseDouble(song[2])));
        }

        String[][] jazzSongs = {
                {"Take Five", "Dave Brubeck", "5.467"},
                {"So What", "Miles Davis", "9.367"},
                {"Take The \"A\" Train", "Duke Ellington", "3.0"},
                {"My Favorite Things", "John Coltrane", "13.6833"},
                {"Come On! Feel the Illinoise! (Part I: The World’s Columbian Exposition – Part II: Carl Sandburg Visits Me in a Dream)", "Sufjan Stevens", "6.75"}
        };

        for (String[] song : jazzSongs){
            allJazzSongs.addSong(new Song(song[0], song[1], Double.parseDouble(song[2])));
        }

        // add songs to upbeat playlist
        upbeatSongs.addSong(allPopSongs.getSongs().get(1));
        upbeatSongs.addSong(allPopSongs.getSongs().get(2));
        upbeatSongs.addSong(allJazzSongs.getSongs().get(0));
        upbeatSongs.addSong(allJazzSongs.getSongs().get(2));
        upbeatSongs.addSong(allRockSongs.getSongs().get(0));

        // use pop, rock, and jazz playlists to create a playlist by mood
        // we could do this for any mood, but for demonstration purposes, i have only created
        // one mood playlist. then, call recommender on the mood playlist
        System.out.println("Recommending you UPBEAT songs: ");
        recommend.generateRandomRecommendations(upbeatSongs);

        // ---RECOMMENDATIONS BY GENRE & MOOD---
        // since we have created playlists by genre & mood, we can get the genre
        // and then randomly generate 2 songs from that genre as "recommendations."
        // simulate user entering "pop" for genre recommendations
        System.out.println("Recommending you POP songs: ");
        recommend.generateRandomRecommendations(allPopSongs);

    }
}
