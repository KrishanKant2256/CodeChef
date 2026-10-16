
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine();

        boolean[] known = new boolean[26];

        for (char c : S.toCharArray()) {
            known[c - 'a'] = true;
        }

        int N = Integer.parseInt(sc.nextLine());

        while (N-- > 0) {
            String word = sc.nextLine();

            boolean canRead = true;

            for (char c : word.toCharArray()) {
                if (!known[c - 'a']) {
                    canRead = false;
                    break;
                }
            }

            System.out.println(canRead ? "Yes" : "No");
        }

        sc.close();
    }
}

