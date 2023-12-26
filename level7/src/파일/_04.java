package 파일;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class _04 {
	public static void main(String[] args) {
		
		String[] name = {"김철수", "이만수", "이영희"};
		int[] ages = {20, 30, 40};
		
		String dir = System.getProperty("user.dir");
		dir += "/src/파일";

		File file = new File(dir, "file2.txt");
		System.out.println(file);
		
		try (FileWriter fw = new FileWriter(file)) {
			for (int i = 0; i < name.length; i++) {
				fw.write(name[i] + "/" + ages[i] + "\n");
			}
			System.out.println("저장 성공");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("저장 실패");
		}
		
	}
}
