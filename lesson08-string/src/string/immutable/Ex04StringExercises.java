package string.immutable;

import java.util.Arrays;

public class Ex04StringExercises {
	
	
	public static void main(String[] args) {
		String[] songs = {
				"d:/music/something.mp3",
				"d:/video/nonsense.mp3",
				"d:/music/foreover.mp4",
				"c:/desktop/home.mp3"
		};
		
		System.out.println("mp3 songs: " + Arrays.toString(getMp3Song(songs)));
//		Viết hàm tìm các bài hát mp3 trong ổ đĩa d thư mục music
	}
	
	private static String[] getMp3Song(String[] songs) {
		String[] mp3Songs = new String[songs.length];
		int count=0;
		
		for(String song:songs) {
			int lastsSlashIndex = song.lastIndexOf("/");
			String parentPath = song.substring(0, lastsSlashIndex);  //-> d:/music/
			if(parentPath.equals("d:/music")) {
				if(song.endsWith(".mp3")) {
					int lastDotIndex = song.lastIndexOf(".");
					String songName = song.substring(lastsSlashIndex+1, lastDotIndex);
					mp3Songs[count++] = songName;
				}
			}
		}
		return Arrays.copyOfRange(mp3Songs, 0, count);
	}
}
