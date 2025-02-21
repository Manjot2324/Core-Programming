import java.util.Scanner;

public class LongestWord {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = sc.nextLine();
        
        String longestWord = findLongestWord(sentence);
        System.out.println("Longest word: " + longestWord);
    }

    public static String findLongestWord(String sentence) {
        String longestWord = "";
        String currentWord = "";
        
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (ch != ' ') {
                currentWord += ch;
            } else {
                if (currentWord.length() > longestWord.length()) {
                    longestWord = currentWord;
                }
                currentWord = "";
            }
        }
        
        if (currentWord.length() > longestWord.length()) {
            longestWord = currentWord;
        }
        
        return longestWord;
    }
}
