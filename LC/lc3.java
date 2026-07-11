package LC;
import java.io.*;
import java.util.*;

class lc3 {
	// very slow will come back to fix
    public int lengthOfLongestSubstring(String s) {
        int count = 0;
        int highest = 0;
        boolean a = false;

        
        for (int i = 0; i < s.length(); i++){
            count = 0;
            for (int j = i; j < s.length(); j++){
                String current = "" + s.charAt(j);
                if (!s.substring(i, j).contains(current)){
                    count++;
                    if (highest < count) highest = count;
                } else break;
            }
            a = false;
        }
        return highest;
    }
}