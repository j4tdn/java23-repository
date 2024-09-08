package string.immutable;

import java.util.Arrays;

public class Ex04StringExercises {

	public static void main(String[] args) {
		
		String[] songs = {
				"d:/music/something.mp3",
				"d:/music/xinchao.mp4",
				"d:/video/nonsense.mp3",
				"d:/music/a/forever.mp4",
				"c:/desktop/home.mp3",
				"d:/music/muathuhanoi.mp3"
		};
		
		// Viết hàm tìm tên các bái hát mp3 trong ổ đĩa d thư mục music
		
		// System.out.println(new File(songs[0]).getParent());
		System.out.println("mp3 songs: " + Arrays.toString(getMp3Song(songs)));
		
	}
	
	private static String[] getMp3Song(String[] songs) {
		
		String[] mp3Songs = new String[songs.length];
		int count = 0;
		
		for(String song: songs) {
			int lastSlatIndex = song.lastIndexOf("/");
			String parentPath = song.substring(0, lastSlatIndex);
			if(parentPath.equals("d:/music")) {
				if(song.endsWith(".mp3")) {
					int lastDotIndex = song.lastIndexOf(".");
					String songName = song.substring(lastSlatIndex + 1, lastDotIndex);
					mp3Songs[count++] = songName;
				}
			}
		}
		return Arrays.copyOfRange(mp3Songs, 0, count);
	}
	
//	in ra toàn bộ đường dẫn
//	private static String[] findMp3Song(String[] songs) {
//		String[] mp3Songs = new String[songs.length];
//		int count = 0;
//		for(String song: songs) {
//			if(song.startsWith("d:/music") && song.endsWith(".mp3")) {
//				mp3Songs[count++] = song;
//			}
//		}
//		
//		return Arrays.copyOfRange(mp3Songs, 0, count);
//	}
	
}
