import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

class ReaderOptimized {
    static BufferedReader reader;
    static StringTokenizer tokenizer;

    static void init(InputStream input) {
        reader = new BufferedReader(new InputStreamReader(input));
        tokenizer = new StringTokenizer("");
    }

    static String next() throws IOException {
        if (!tokenizer.hasMoreTokens()) {
            tokenizer = new StringTokenizer(reader.readLine());
        }
        return tokenizer.nextToken();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    static long nextLong() throws IOException {
        return Long.parseLong(next());
    }

    static double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }

    static BigInteger nextBigInteger() throws IOException {
        return new BigInteger(next());
    }

    public static void main(String[] args) throws IOException {
        init(System.in);

        // read an int-type data
        int n = nextInt();
        System.out.println("n = " + n);

        // read a long-type data
        long l = nextLong();
        System.out.println("l = " + l);

        // read a double-type data
        double d = nextDouble();
        System.out.println("d = " + d);

        // read a BigInteger-type data
        BigInteger bigInteger = nextBigInteger();
        System.out.println("bigInteger = " + bigInteger);
    }
}
