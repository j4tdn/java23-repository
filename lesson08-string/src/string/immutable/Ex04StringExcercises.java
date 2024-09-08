package string.immutable;

import java.util.Arrays;

public class Ex04StringExcercises {
	public static void main (String args[]) {
		String[] songs = {
				"d/music/somthing.mp3",
				"d/video/nosense.mp3",
				"d/music/foverer.mp4",
				"d/desktop/home.mp3"
				};
		System.out.println(Arrays.toString(getMp3Song(songs)));
		}
	
	private static String[] getMp3Song (String[] songs) {
		String[] mp3Songs = new String[songs.length];
		int count = 0;
		
		for (String song:songs) {
			int lastSlashIndex = song.lastIndexOf("/");
			String parrentPath = song.substring(0, lastSlashIndex);
			if (parrentPath.startsWith("d/music")) {
				if (parrentPath.endsWith(".mp3")) {
					int lastDocIndex = song.lastIndexOf(".");
					String songName = song.substring(lastSlashIndex+1, lastDocIndex);
					mp3Songs[count++] = songName;
				}
			}
		}
		return Arrays.copyOfRange(mp3Songs, 0, count);
	}
}
