package 파일;

import java.io.FileWriter;
import java.io.IOException;

public class _01 {
	public static void main(String[] args) {
		
		String fileName = "file01.txt";
		FileWriter f = null;
		try {
			f = new FileWriter(fileName);
			System.out.println("성공");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (f != null) {
				try {
					f.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
