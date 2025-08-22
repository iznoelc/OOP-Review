package notSpotify;

public class Song {
    private String title;
    private String artist;
    private double duration; // in minutes

    // constructor to initialize properties
    public Song(String title, String artist, double duration){
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    // getters for each property
    public String getTitle(){
        return title;
    }

    public String getArtist(){
        return artist;
    }

    public double getDuration(){
        return duration;
    }
}
