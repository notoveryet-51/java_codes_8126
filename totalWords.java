import java.util.*;

public class totalWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();
        sc.close();

        String[] words = input.split("\\s+");
        int totalWords = words.length;

        System.out.println("Word frequencies:");
        for (int i = 0; i < totalWords; i++) {
            if (words[i].equals("")) continue;

            int count = 1;
            for (int j = i + 1; j < totalWords; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                    words[j] = "";
                }
            }
            System.out.println(words[i] + ": " + count);
        }

        System.out.println("Total number of words: " + totalWords);
    }
}
