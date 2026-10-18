import java.io.*;

class Codechef {
    public static void main(String[] args) throws IOException {
        BufferedInputStream in = new BufferedInputStream(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int T = nextInt(in);

        while (T-- > 0) {
            int X = nextInt(in);
            int Y = nextInt(in);
            int K = nextInt(in);
            int N = nextInt(in);

            int needed = X - Y;
            boolean found = false;

            for (int i = 0; i < N; i++) {
                int P = nextInt(in);
                int C = nextInt(in);

                if (P >= needed && C <= K) {
                    found = true;
                }
            }

            out.println(found ? "LuckyChef" : "UnluckyChef");
        }

        out.flush();
    }

    static int nextInt(BufferedInputStream in) throws IOException {
        int c;
        do {
            c = in.read();
        } while (c <= ' ' && c != -1);

        int num = 0;
        while (c > ' ') {
            num = num * 10 + c - '0';
            c = in.read();
        }

        return num;
    }
}