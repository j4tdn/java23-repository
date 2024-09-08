package string.immutable;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ex04StringExercises {
	public static void main(String[] args) {
		String [] songs = {
				"d:/music/something.mp3",
				"d:/music/home/something.mp3",

				"d:/video/nonsense.mp3",
				"d:/music/foreover.mp4",
				"d:/desktop/home.mp3"
				
		};
		System.out.println("mp3 songs : "+Arrays.toString(getMp3Songs(songs)));
		
		//Viết hàm tình các bài hát mp3 trong ổ đỉa d thư mục music
	}
	private static String[] getMp3Songs(String [] songs) {
		String[] mp3Songs = new String[songs.length];
		
		int count =0;
		
		for(String song :songs) {
			int lastSlashIndex= song.lastIndexOf("/");
			String parentPath = song.substring(0,lastSlashIndex);
			if(parentPath.equals("d:/music")) {
				if(song.endsWith(".mp3")) {
					int lastDotIndex = song.lastIndexOf(".");
					String songName = song.substring(lastSlashIndex+1,lastDotIndex);
					mp3Songs[count++]= songName;
				}
			}
					
		}
		return Arrays.copyOfRange(mp3Songs, 0, count);
	}
}
