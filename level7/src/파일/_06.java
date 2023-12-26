package 파일;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class _06 {
	public static void main(String[] args) {
		
		final String CUR_PATH = System.getProperty("user.dir") + "\\src\\파일\\";
		String fileName = "file1.txt";
		
		try(FileReader fr = new FileReader(CUR_PATH + fileName);
			BufferedReader br = new BufferedReader(fr);) {
			String data = br.readLine();
			System.out.println(data);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
