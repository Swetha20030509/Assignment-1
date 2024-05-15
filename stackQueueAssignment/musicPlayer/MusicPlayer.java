package stackQueueAssignment.musicPlayer;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MusicPlayer {
	Queue<Song> AllSongs=new LinkedList<>();
	public void addSong(Song song)
	{
		AllSongs.add(song);
		System.out.println("The song added sucessfully");
	}
	public void removeSong(String title)
	{
		 if (AllSongs.isEmpty()) {
	            System.out.println("Playlist is empty");
	            return;
	        }
	        Queue<Song> tempQueue = new LinkedList<>();
	        boolean found = false;
	        while (!AllSongs.isEmpty()) {
	            Song currentSong = AllSongs.poll();
	            if (!currentSong.getTitle().equals(title)) {
	                tempQueue.add(currentSong);
	            } else {
	                found = true;
	            }
	        }
	        if (!found) {
	            System.out.println("Song not found in the playlist");
	        }
	        System.out.println("The song removed sucessfully");
	        AllSongs.addAll(tempQueue);
	    }
	public void currentSong()
	{
		System.out.println(AllSongs.size());
		System.out.println("Current song is  :"+AllSongs.peek().getTitle());
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		MusicPlayer music=new MusicPlayer();
		music.intialize();
		while(true)
		{
		System.out.println("1. ADD SONG");
		System.out.println("2. REMOVE SONG");
		System.out.println("3. CURRENT SONG PLAY");
		System.out.println("4. Exit");
		System.out.println("Enter your choice");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Enter the song title");
			String title=sc.next();
			Song song=new Song(title);
			music.addSong(song);
			break;
		case 2:
			System.out.println("Enter the song title");
			String title1=sc.next();
			music.removeSong(title1);
			break;
		case 3:
			music.currentSong();
			break;
		case 4:
			System.exit(0);
			break;
		}
	}
	}

	private void intialize() {
		
		System.out.println("...");
		AllSongs.add(new Song("unale"));
		AllSongs.add(new Song("pirai thedum"));
		AllSongs.add(new Song("Amma amma"));
		AllSongs.add(new Song("kaavala"));
		}

}
