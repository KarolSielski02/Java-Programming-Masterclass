import java.util.LinkedList;

public class Playlist {

    private String name;
    private LinkedList<Song> songLinkedList;

    public Playlist(String name) {
        this.name = name;
        songLinkedList = new LinkedList<Song>();
    }

    public static void addSongToPlaylist (String albumName, Song song){

    }
}
