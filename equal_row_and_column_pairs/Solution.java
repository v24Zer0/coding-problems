package equal_row_and_column_pairs;

// Given a 0-indexed n x n integer matrix grid,
// return the number of pairs (ri, cj) such that row ri and column cj are equal.
// A row and column pair is considered equal if
// they contain the same elements in the same order (i.e., an equal array).

// Example 1:
//      Input: grid = [[3,2,1],[1,7,6],[2,7,7]]
//      Output: 1
//      Explanation: There is 1 equal row and column pair:
//      - (Row 2, Column 1): [2,7,7]

// Example 2:
//      Input: grid = [[3,1,2,2],[1,4,4,5],[2,4,2,2],[2,4,2,2]]
//      Output: 3
//      Explanation: There are 3 equal row and column pairs:
//      - (Row 0, Column 0): [3,1,2,2]
//      - (Row 2, Column 2): [2,4,2,2]
//      - (Row 3, Column 2): [2,4,2,2]

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public int equalPairs(int[][] grid) {
        Map<String, Integer> counts = new HashMap<>();
        int pairCount = 0;

        StringBuilder sb = new StringBuilder();

//        Convert row to string and add to counts map
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid.length; j++) {
                sb.append(grid[i][j]);
                sb.append(',');
            }

            String row = sb.toString();
            counts.put(row, counts.getOrDefault(row, 0) + 1);

            sb.setLength(0);
        }

//        Convert column to string and check if it exists in counts map
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid.length; j++) {
                sb.append(grid[j][i]);
                sb.append(',');
            }

            String column = sb.toString();
            if(counts.containsKey(column)) {
                pairCount += counts.get(column);
            }

            sb.setLength(0);
        }

        return pairCount;
    }
}
