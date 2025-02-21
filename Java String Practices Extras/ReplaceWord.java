import java.util.Scanner;

public class ReplaceWord {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = sc.nextLine();
        System.out.println("Enter the word to replace: ");
        String oldWord = sc.nextLine();
        System.out.println("Enter the new word: ");
        String newWord = sc.nextLine();
        
        String modifiedSentence = replaceWord(sentence, oldWord, newWord);
        System.out.println("Modified Sentence: " + modifiedSentence);
    }

    public static String replaceWord(String sentence, String oldWord, String newWord) {
        String result = "";
        int oldWordLength = oldWord.length();
        
        for (int i = 0; i <= sentence.length() - oldWordLength; i++) {
            if (sentence.substring(i, i + oldWordLength).equals(oldWord)) {
                result += newWord;
                i += oldWordLength - 1;
            } else {
                result += sentence.charAt(i);
            }
        }
        
        return result;
    }
}
