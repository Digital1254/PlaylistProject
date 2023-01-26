
/**
 * Write a description of class Playlist here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;

/**
 * The Playlist class, which will keep track of a playlist of Song objects
 * Refer to the project description to make sure you have access to all available methods
 */
public class Playlist {
    /**
     * Fields-- This will likely just need to be the ArrayList of Songs. Reference our previous problems
     * (CarDealership, Zoo) for structure on how this will look
     */

    private ArrayList<Song> playlist;


     /**
      * Constructor-- this doesn't need any parameters. You should just initialize the ArrayList and
      * then use additional methods to add Songs in one-by-one
      */

    public Playlist()
    {
        playlist = new ArrayList<Song>();
    }
      

      /**
       * Methods-- Remember that you need to be able to complete all of the following:
       * Adding a song
       * 'liking' a song
       * Removing a specific song
       * Examining all Songs (a String return or void print makes sense here)
       * Examining a sublist of all liked songs
       * Determining the total duration of all songs
       * Removing all unliked songs from the playlist (careful with this one!)
       */
      public void add(Song x)
      {
          playlist.add(x);
      }
      public void like2(int index)
      {
          Song x = playlist.get(index);
          x.like();
      }
      public void remove(int index)
      {
          playlist.remove(index);
      }
      public String examine(){
          String x = "";
          for(int i =0; i < playlist.size(); i++){
              Song current = playlist.get(i);
              String y = current.getName();
              x += y + ", ";
          }
          int z = x.length();
          String a = x.substring(0, z-2);
          return a;
      }
      public String examineliked{
          
      }
}
