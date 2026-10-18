import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int K = sc.nextInt();
            int N = sc.nextInt();

            int needed = X - Y;
            boolean found = false;

            for (int i = 0; i < N; i++) {
                int P = sc.nextInt();
                int C = sc.nextInt();

                if (P >= needed && C <= K) {
                    found = true;
                }
            }

            if (found) {
                System.out.println("LuckyChef");
            } else {
                System.out.println("UnluckyChef");
            }
        }

        sc.close();
    }
}
