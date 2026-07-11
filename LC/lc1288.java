package LC;
import java.io.*;
import java.util.*;

class lc1288 {
    public int removeCoveredIntervals(int[][] intervals) {
        int a = 0;
        for (int i = 0; i < intervals.length; i++){
            for (int k = 0; k < intervals.length; k++){
                if (k == i){
                }
                else if (intervals[k][0] <= intervals[i][0] && intervals[i][1] <= intervals[k][1]){
                    a++;
                    break;
                }
            }
        }
        return intervals.length - a;
    }
}
