package 배열심화문제2;

public class _문제10채팅 {
	public static void main(String[] args) {
		
		/*
		 [문제]
		 	철수와 영희의 채팅
		 	철수는 왼쪽, 영희는 오른쪽 정렬
		 	대화의 한 줄 길이는 20칸이다.
		 */
		
		String[][] wordList = {
				{"철수", "영희야 안녕"},
				{"영희", "철수야 안녕"},
				{"철수", "오늘 점심 같이 먹을래?"},
				{"영희", "아니 약속있어."},
				{"영희", "다음에 먹자."},
				{"철수", "그래 다음에 먹자."}
		};
		int size = 20;
		char[] range = new char[size];
		
		for (int i = 0; i < wordList.length; i++) {
			size = 20;
			for (int j = 0; j < size; j++) {
				range[j] = ' ';
			}
			if (wordList[i][0].equals("철수")) {
				for (int k = 0; k < wordList[i][1].length(); k++) {
					range[k] = wordList[i][1].charAt(k);
				}
			} else {
				for (int k = wordList[i][1].length() - 1; k >= 0; k--) {
					range[size - 1] = wordList[i][1].charAt(k);
					size--;					
				}
			}
			for (int j = 0; j < range.length; j++) {
				System.out.print(range[j]);
			}
			System.out.println();
		}				
	}
}
