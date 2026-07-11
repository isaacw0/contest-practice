package DMOJ;
import java.io.*;
import java.util.*;

public class bpc1j1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int face = sc.nextInt();
        int count = 0;

        for (int i = 0; i < face; i++) {
            String s = sc.next();

            if (s.equals("face")) {
                count++;
            }
        }

        System.out.println(count);
    }
}