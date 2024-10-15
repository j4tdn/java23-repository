package string.immutable;

import java.util.Arrays;

public class Ex04StringExercises {
	public static void main(String[] args) {
		String[] songs = {
				"d:/music/something.mp3",
				"d:/music/hello.mp3",
				"d:/music/xinchao.mp4",
				"d:/video/nonhouse.mp3",
				"d:/music/forever.mp4",
				"c:/desktop/home.mp3"
		};
		
		//Viết hàm tìm bài hát mp3 trong ổ đĩa music 
		System.out.println("mp3 songs: " + Arrays.toString(findFileMp3(songs)));
	}
	
	private static String[] findFileMp3(String[] songs) {
		String[] mp3Songs = new String[songs.length];
		int count = 0;
		for (String song : songs) {
			int lastSlashIndex = song.lastIndexOf("/");
			String parentPath = song.substring(0, lastSlashIndex);
			if (parentPath.equals("d:/music"))
				if (song.endsWith(".mp3")) {
					int lastDotIndex = song.lastIndexOf(".");
					String songName = song.substring(lastSlashIndex + 1, lastDotIndex);
					mp3Songs[count++] = songName;
				}
		}
		
		return Arrays.copyOfRange(mp3Songs, 0, count);
	}

}
