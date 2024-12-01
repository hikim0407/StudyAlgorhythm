package easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution16 {
    // 상, 우, 하, 좌 방향
    private static final int[] dx = {-1, 0, 1, 0};
    private static final int[] dy = {0, 1, 0, -1};

    public int[] findCycles(String[] grid) {
        int rows = grid.length;
        int cols = grid[0].length();
        boolean[][][] visited = new boolean[rows][cols][4];
        List<Integer> cycleLengths = new ArrayList<>();

        // 모든 셀과 방향에 대해 탐색
        for (int x = 0; x < rows; x++) {
            for (int y = 0; y < cols; y++) {
                for (int dir = 0; dir < 4; dir++) {
                    if (!visited[x][y][dir]) {
                        cycleLengths.add(traceCycle(grid, x, y, dir, visited));
                    }
                }
            }
        }

        Collections.sort(cycleLengths);
        return cycleLengths.stream().mapToInt(i -> i).toArray();
    }

    private int traceCycle(String[] grid, int startX, int startY, int startDir, boolean[][][] visited) {
        int x = startX;
        int y = startY;
        int dir = startDir;
        int cycleLength = 0;

        while (!visited[x][y][dir]) {
            visited[x][y][dir] = true;
            cycleLength++;

            // 다음 위치와 방향 계산
            // dir 값은 다음과 같이 메핑한다.
            // 위:0, 오른쪽:1, 아래:2, 왼쪽:3 
            if (grid[x].charAt(y) == 'L') {
                dir = (dir + 3) % 4; // 좌회전
            } else if (grid[x].charAt(y) == 'R') {
                dir = (dir + 1) % 4; // 우회전
            }
            
            
            x = (x + dx[dir] + grid.length) % grid.length; // 행 경계 처리
            y = (y + dy[dir] + grid[0].length()) % grid[0].length(); // 열 경계 처리
        }

        return cycleLength;
    }
    
    public static void main (String args[]) {
    	Solution16 sl = new Solution16();
    	int[] answer = sl.findCycles(new String[]{"R", "R"});
    	for(Integer index : answer) {
			System.out.println(index);
		}
	}

}
