package LC;
import java.io.*;
import java.util.*;

class lc3754 {
    public long sumAndMultiply(int n) {
    String s = "" + n;
    String xs = "";
    long sum = 0;
    // x
    for (int i = 0; i < s.length(); i++){
        if (s.charAt(i) != '0'){
            xs += s.charAt(i);
        }
    }
    if (xs == ""){
        xs = "0";
    }

    long x = Integer.parseInt(xs);
    System.out.println("x is " + x);
    s = "" + x;
    // sum
    for (int i = 0; i < s.length(); i++){
        sum = sum + (s.charAt(i)-48);
        System.out.println("Current: " + s.charAt(i) + "\n" + sum);
    }

    System.out.println("Sum is " + sum);
    long answer = sum*x;
    return answer;
    }
}
