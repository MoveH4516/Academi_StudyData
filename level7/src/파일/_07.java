package 파일;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class _07 {
	public static void main(String[] args) {
		String fileName = "file2.txt";
		final String CUR_PATH = System.getProperty("user.dir") + "/src/파일/";
		
		try (FileReader fr = new FileReader(CUR_PATH + fileName);
			BufferedReader br = new BufferedReader(fr);) {
			System.out.println("읽기 성공");
			while (true) {
				String data = br.readLine();
				if (data == null) {
					break;
				}
				System.out.println(data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
