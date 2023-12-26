package 파일;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class FileEx {
	Scanner sc = new Scanner(System.in);
	String fileName = "vector.txt";
	final String path = System.getProperty("user.dir") + "/src/파일/";
	int[] arr = null;
	File file = new File(path, fileName);;
	int cnt;
	boolean pass;
	
	void init() {
		//file = new File(path, fileName);
		String data = "";
		try (FileReader fr = new FileReader(file);
				BufferedReader br = new BufferedReader(fr);) {
				while (true) {
					String str = br.readLine();
					if (str == null) {
						break;
					}
					data += str + " ";
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		if (data.isEmpty()) {
			return;
		}
		String[] array = data.split(" ");
		cnt = array.length;
		arr = cnt == 0 ? new int[1] : new int[cnt];
		for (int i = 0; i < cnt; i++) {
			arr[i] = Integer.parseInt(array[i]);
		}
//		try (FileWriter fw = new FileWriter(file)) {
//				fw.write("");
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}
	
	void add() {
		int num = 0;
		try {
			System.out.println("숫자 입력 >> ");
			num = sc.nextInt();
		} catch (Exception e) {
			System.out.println("숫자만 입력 가능");
			sc.nextLine();
			return;
		}
		pass = true;
		if (cnt == 0) {
			arr = new int[1];
			arr[0] = num;
			cnt++;
			show();
			return;
		}
		int[] temp = arr;
		cnt++;
		arr = new int[cnt];
		for (int i = 0; i < temp.length; i++) {
			arr[i] = temp[i];
		}
		arr[cnt - 1] = num;
		show();
	}
	
	void save () {
		if (!pass) {
			System.out.println("저장할 데이터가 없습니다.");
			return;
		}
		try (FileWriter fw = new FileWriter(file)) {
			for (int i = 0; i < cnt; i++) {
				fw.write(arr[i] + " ");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		pass = false;
	}
	
	void road () {
		try (FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);) {
			String data = "";
			while (true) {
				String str = br.readLine();
				if (str == null) {
					break;
				}
				data += str + " ";
			}
			System.out.println(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	void remove() {
		if (cnt == 0) {
			System.out.println("데이터가 없습니다");
			return;
		}
		System.out.println("삭제할 인덱스값 >> ");
		int idx = 0;
		try {
			idx = sc.nextInt();
			if (idx < 0 || idx >= cnt) {
				throw new Exception ();
			}
		} catch (Exception e) {
			System.out.println("입력 오류");
			sc.nextLine();
			return;
		}
		int[] temp = arr;
		for (int i = idx; i < cnt - 1; i++) {
			temp[i] = temp[i + 1];
		}
		cnt--;
		arr = new int[cnt];
		for (int i = 0; i < cnt; i++) {
			arr[i] = temp[i];
		}
		show();
		pass = true;
	}
	
	void show() {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	void run() {
		init();
		while (true) {
			System.out.println("[벡트 컨트롤러]");
			System.out.println("[1]추가하기");
			System.out.println("[2]삭제하기");
			System.out.println("[3]저장하기");
			System.out.println("[4]로드하기");
			System.out.println("[5]종료하기");
			int sel = sc.nextInt();
			if (sel == 5) {
				System.out.println("종료");
				break;
			} else if (sel == 1) {
				add();
			} else if (sel == 2) {
				remove();
			} else if (sel == 3) {
				save();
			} else if (sel == 4) {
				road();
			} else {
				continue;
			}
			
		}
	}
}

public class _08 {
	public static void main(String[] args) {
		
		FileEx f = new FileEx();
		f.run();
		
	}
}
