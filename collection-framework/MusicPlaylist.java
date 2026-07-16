/*Additional
 Music Playlist Recommendation Engine

Scenario
A music streaming application wants to enhance the user experience by
maintaining a list of recently played songs. The application should always
display the most recently played song at the top and keep only the latest 10
songs in the history.

Requirements
Design a Java application that fulfills the following requirements:

Use a LinkedList<String> to store recently played songs.
Whenever a song is played, it should be added at the beginning of the
playlist.

If the playlist size exceeds 10 songs, automatically remove the oldest song
from the end of the list.

Allow users to search whether a particular song exists in the recently
played list.

Display the complete "Recently Played" history.

Task
Develop a Music Playlist Recommendation Engine that enables the music
application to:
1. Add newly played songs to the top of the playlist.
2. Maintain only the latest 10 recently played songs.
3. Remove the oldest song when the limit exceeds 10.
4. Search for a song in the recently played history.
5. Display the complete list of recently played songs in order.*/

import java.util.*;

public class MusicPlaylist {
    LinkedList<String> playlist = new LinkedList<>();

    // 1. Add song at the beginning
    void playSong(String song) {
        playlist.addFirst(song);
        // 2. if size > 10 then remove the last song
        if(playlist.size() > 10) {
            playlist.removeLast();
        }
    }

    // 3. Search song
    void searchSong(String song) {
        if(playlist.contains(song)) {
            System.out.println(song + " is in recently played list.");
        } else {
            System.out.println(song + " not found.");
        }
    }

    // 4. Display playlist
    void display() {
        System.out.println("Recently Played Songs:");
        for(String s : playlist) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        MusicPlaylist mp = new MusicPlaylist();

        // Step 1: Play some songs
        mp.playSong("Song A");
        mp.playSong("Song B");
        mp.playSong("Song C");

        // Step 2: Display playlist
        mp.display();

        // Step 3: Search a song
        mp.searchSong("Song B");
        mp.searchSong("Song X");

        // Step 4: Add more than 10 songs to test limit
        for(int i=1; i<=12; i++) {
            mp.playSong("Track " + i);
        }

        // Step 5: Display again (only latest 10 should remain)
        mp.display();
    }
}
