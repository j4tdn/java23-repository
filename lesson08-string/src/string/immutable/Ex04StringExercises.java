package string.immutable;

import java.util.Arrays;

public class Ex04StringExercises {

	public static void main(String[] args) {
		String[] songs = {
				"d:/music/something.mp3",
				"d:/music/loveyou.mp3",
				"d:/music/xinchao.mp4",
				"d:/video/nonsense.mp3",
				"d:/music/foreover.mp4",
				"c:/desktop/home.mp3"
		};
		
		// Viet ham tim cac bai hat mp3 trong o dia d thu muc music
		
		System.out.println("mp3 songs: " + Arrays.toString(getMp3Songs(songs)));
	}

	private static String[] getMp3Songs(String[] songs) {
		String[] mp3Songs = new String[songs.length];
		int count = 0;
		for (String song : songs) {
			int lastSlashIndex = song.lastIndexOf("/");
			String parentPath = song.substring(0, lastSlashIndex);
			if (parentPath.equals("d:/music"))
				if (song.endsWith(".mp3")) {
					int lastDoIndex = song.lastIndexOf(".");
					String songName = song.substring(lastSlashIndex + 1, lastDoIndex);
					mp3Songs[count++] = songName;
				}
		}

		return Arrays.copyOfRange(mp3Songs, 0, count);
	}
}
