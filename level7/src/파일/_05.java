package 파일;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class _05 {
	public static void main(String[] args) {
		
		String[] names = {"mom", "megait", "github"};
		String[] pws = {"1111", "2222", "3333"};
		int[] moneys = {20000, 30000, 40000};
		
		String fileName = "file2.txt";
		String data = "";
		
		String path = System.getProperty("user.dir"); // 현재 경로
		path += "/src/파일";
		File file = new File(path, fileName);
		
		for (int i = 0; i < names.length; i++) {
			data += names[i] + "/" + pws[i] + "/" + moneys[i] + "\n";
		}
		data = data.substring(0,data.length() - 1);
		
		try (FileWriter fw = new FileWriter(file)) {
			fw.write(data);
			System.out.println("파일 생성 완료");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("파일 생성 실패");
		}
	}
}
