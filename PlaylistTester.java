/**
 * Sample of a tester file for the Playlist class. This file should demonstrate all the capability of your
 * playlist in the main method. You don't need to follow the testing specifications of this exactly
 * if you want to write your own separate tester instead.
 * Note that there's no need for a Scanner in this project-- all of the playlist can be 'hardcoded' into main.
 * @author
 * @version
 */
public class PlaylistTester {
    public static void main(String[] args) {
        System.out.println("Initializing a Playlist...\n");
        //Make your playlist here
        Playlist x = new Playlist();

        System.out.println("Adding songs to the Playlist...\n");
        /**
         * Add some songs here. Note that the format for adding a Song to a Playlist p
         * is something like...
         * p.addSong(new Song(..., ..., ...))
         */
        x.add(new Song("Daft Punk", "End of Line", 156));
        x.add(new Song("Arctic Monkeys", "Teddy Picker", 160));
        x.add(new Song("$20", "Boygenius", 320));
        x.add(new Song("alt-J", "Philadelphia", 218));
        x.add(new Song("Magdalena Bay", "You Lose!", 204));



        System.out.println("Printing the songs...\n");
        //Print out all the songs in the playlist to verify it's working correctly
        String y = x.examine();
        System.out.println(y);


        System.out.println("\nLiking the songs in position 0, 2, 4...\n");
        //Once your songs are 'liked', this should be reflected in the next printout
        x.like2(0);
        x.like2(2);
        x.like2(4);


        System.out.println("Printing the songs...\n");
        String z = x.examineliked();
        System.out.println(z);


        System.out.println("\nRemoving the song in position 4...\n");
        x.remove(4);
        


        System.out.println("Printing the songs...\n");
        y = x.examine();
        System.out.println(y);


        System.out.println("\nPrinting only the liked songs...\n");
        //Your Playlist should be able to do this without looping while in main!
        y = x.examineliked();
        System.out.println(y);


        System.out.println("\nPrinting the total duration of all songs...\n");
        //Note that the format should look something like minutes:seconds
        int a = x.totalduration();
        System.out.println(a);


        System.out.println("\nRemoving all unliked songs from the playlist...\n");
        //This should be doable with a single method call
        x.removeunliked();


        System.out.println("Printing all songs...\n");
        //This should now look like only the liked songs list from before
        y = x.examine();
        System.out.println(y);
    }
}
