package string.immutable;

import java.util.Arrays;

public class Ex04StringExercises {

	
	public static void main(String[] args) {
		String[] songs = {
				"d:/music/somethinngyoulike.mp3",
				"d:/music/hello.mp3",
				"d:/video/nonsense.mp3",
				"d:/music/forever.mp4",
				"c:/desktop/home.mp3"
		};
		
		
		// Viết hàm tìm các bài hát mp3 trong ổ đĩa d thư mục music
		System.out.println("mp3 song : " + Arrays.toString(getMp3Songs(songs)));
		for (String song : songs) {
			if (checkFile(song)) System.out.println("sonng : " + song);
		}
	}
	private static boolean checkFile(String filePath) {
		String[] paths = filePath.strip().split("/");
		if (filePath.startsWith("d") && paths[1].equals("music") && filePath.endsWith("mp3"))return true;
		return false;
	}
	private static String[] getMp3Songs(String[] songs) {
		String[] mp3Songs = new String[songs.length];
		int count = 0;
		for (String song : songs) {
			int lastSlashIndex = song.lastIndexOf("/");
			String parentPath = song.substring(0, lastSlashIndex);
			if (parentPath.equals("d:/music")) {
				if (song.endsWith("mp3")) {
					int lastDotIndex = song.lastIndexOf(".");
					String songName = song.substring(lastSlashIndex+1, lastDotIndex);
					mp3Songs[count++] = songName;
				}
			}
		}
		return Arrays.copyOfRange(mp3Songs, 0, count);
	}
	
}
