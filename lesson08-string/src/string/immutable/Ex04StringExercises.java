package string.immutable;

import java.util.Arrays;

public class Ex04StringExercises {

	public static void main(String[] args) {
		String[] song = {
			"d:/music/something.mp3",
			"d:/video/nonsense.mp3",
			"d:/music/forever.mp4",
			"c:/desktop/home.mp3"
		};
//	checkMp3(song);
	System.out.println("mp3 songs:" +Arrays.toString(getCheckMp3(song)));
//		viết hàm tìm các bài mp3 trong ổ đĩa
	}
	
	private static String[] checkMp3C1(String[] song) {
		String[] mp3Songs = new String[song.length];
           int count = 0;
		for(String songs:song) {
			if(songs.contains("mp3")) {
             mp3Songs[count++];
			}
		}
		return mp3Songs;
	}
	 
	private static String[] getCheckMp3(String[] song) {
		String[] mp3Songs = new String[song.length];
		int count = 0;
		for(String songs:song) {
			int lastSlashIndex = songs.lastIndexOf("/");
			String parentPath = songs.substring(0,lastSlashIndex);
	         if(parentPath.equals("d:/music")) {
	        	 if(songs.endsWith(".mp3")) {
	        		 int lastDotIndex = songs.lastIndexOf(".");
	        		 String songName = songs.substring(lastSlashIndex+1, lastDotIndex);
	        		 mp3Songs[count++] =songName;
	        	 }
	         }
		}
		return Arrays.copyOfRange(mp3Songs, 0, count);
	}
	}
	
