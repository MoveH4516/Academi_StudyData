package member;
class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int[] wall = new int[n];
        int idx = 0;
        for (int i = 0; i < n; i++) {
            if (i == section[idx] - 1) {
                wall[i] = 1;
                idx++;
            }
            if (idx == section.length) break;
        }
        while (true) {
            int cnt = 0;
            for (int i = 0; i < n; i++) {
                if (wall[i] == 1) {
                    cnt++;
                    answer++;
                    for (int j = i; j < n && j < i + m; j++) {
                        wall[j] = 0;
                    }
                }
            }
            if (cnt == 0) {
                break;
            }
        }
        
        return answer;
    }
}
public class _qwe {
	public static void main(String[] args) {
		Solution s = new Solution();
		int[] arr = {2, 3, 6};
		
		System.out.println(s.solution(8, 4, arr));
	}
}
