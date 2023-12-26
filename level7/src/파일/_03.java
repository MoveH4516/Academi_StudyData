package 파일;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class _03 {
	public static void main(String[] args) {
		
		String dir = System.getProperty("user.home");
		System.out.println(dir);
		dir += "/desktop";
		
		File file = new File(dir, "file1.txt");
		System.out.println(file.getPath());
		
		String data = "바탕화면 파일 생성";
		data += "!!!";
		try(FileWriter fw = new FileWriter(file)) {
			fw.write(data);
			System.out.println("저장완료");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("저장 실패");
		}
	}
}
