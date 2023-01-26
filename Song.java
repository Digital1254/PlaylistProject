
/**
 * Write a description of class Song here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Song {
    //Fields-- what information do we want each Song to store?
    private boolean liked;
    private int length;
    private String artist;
    private String name;



    /**
     * Constructor-- what information needs to be given to make a Song?
     * How will you handle 'liked' songs? It makes sense for a Song not be 'liked' by default
     */
    public Song(String artist, String name, int length, boolean liked)
    {
        this.artist = artist;
        this.name = name;
        this.length = length;
        this.liked = liked;
    }
     /**
      * Methods-- what will you want each Song to do?
      * Consider all the getter methods (getName, getArtist, etc.)
      * You should probably have a toString method to be able to get the information for the full
      * song easily as well!
      * What kind of mutator (setter) methods will you need?
      */
    public String getName()
    {
        return name;

    }
    public String getArtist()
    {
        return artist;
    }
    public int getLength()
    {
        return length;
    }
    public boolean isLiked()
    {
        return true;
    }
    public boolean isNotLiked()
    {
        return false;
    }
    public int getDurationInSeconds()
    {
        return length;
        //this assumes the user inputs total time in seconds, the program will not convert
        //from minutes to seconds automatically
    }
    public void like(){
        liked = true;
    }
}
