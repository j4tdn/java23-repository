package string.immutable;

import java.util.Arrays;

public class Ex04StringExercise {

	public static void main(String[] args) {
		String[] songs = {
				"d:/music/somthing.mp3",
				"d:/video/nonsense.mp3",
				"d:/music/foreover.mp4",
				"c:/desktop/home.mp3,",
				"d:/music/lovesand.mp3"
		};
		System.out.println("mp3 songs: " + Arrays.toString(getMp3songs(songs)));
		//  viết hàm tìm các bài hát mp3 trong ổ đĩa d thư mục music
	}
	private static String[] getMp3songs(String [] songs ) {
		String[]  mp3Songs = new String[songs.length];
		int count = 0;
		for(String song:songs) {
			int last = song.lastIndexOf("/");
			String parentPath = song.substring(0,last);
			if(parentPath.equals("d:/music")) {
				if(song.endsWith(".mp3")) {
					int lastDotIndex = song.lastIndexOf(".");
					String songName = song.substring(last + 1, lastDotIndex);
					mp3Songs[count++] = songName;
				}
			}
		}
		return Arrays.copyOfRange(mp3Songs, 0, count);
	}
}
