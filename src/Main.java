import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        int z = 0;
        for (int d = 0; d < sentences.length; d++) {
            String[] words = sentences[d].split("\\s");
            int q = words.length;
            if (q>z) z=q;
        }
        System.out.println(z);
    }
} //Maximum Number of Words Found in Sentences