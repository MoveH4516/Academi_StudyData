package 파일;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class _02 {
	public static void main(String[] args) {
		
		// 파일의 경로
		Path path = Paths.get(""); // 현재 프로젝트의 경로
		System.out.println(path.toAbsolutePath());
		final String CUR_PATH = path.toAbsolutePath() + "\\src\\파일\\";
		String fileName = "file1.txt";
		String filepath = CUR_PATH + fileName;
		System.out.println(filepath);
		File file1 = new File(filepath);
		
		System.out.println(file1.exists()); // 같은 이름의 파일이 있는지 확인.
		
		try {
			boolean result = file1.createNewFile();
			System.out.println(result ? "파일 생성" : "파일 이름 중복");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
