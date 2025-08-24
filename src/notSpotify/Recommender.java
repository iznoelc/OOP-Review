package notSpotify;

import java.util.Random;


public class Recommender {

    public void generateRandomRecommendations(Playlist playlist){
        Random rand = new Random();
        int song1, song2;
        int plLength = playlist.getSongs().size();

        // randomly get a random index between 0 and size of playlist inputted
        // but make sure they are not the same number
        song1 = rand.nextInt(plLength);
        do {
            song2 = rand.nextInt(plLength);
        } while (song2 == song1);

        System.out.println("1. " + playlist.getSongs().get(song1).getTitle() + " by " + playlist.getSongs().get(song1).getArtist());
        System.out.println("2. " + playlist.getSongs().get(song2).getTitle() + " by " + playlist.getSongs().get(song2).getArtist());
    }

}
