import java.util.Scanner;

public class WordLengthArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        
        String[] words = customSplit(inputString);
        String[][] wordsWithLengths = getWordsWithLengths(words);
        
        System.out.printf("%-20s %-10s%n", "Word", "Length");
        System.out.println("-------------------- ----------");
        for (String[] wordWithLength : wordsWithLengths) {
            System.out.printf("%-20s %-10d%n", wordWithLength[0], Integer.parseInt(wordWithLength[1]));
        }
    }

    public static int getStringLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            return count;
        }
    }

    public static String[] customSplit(String str) {
        int length = getStringLength(str);
        int wordCount = 1;
        
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') {
                wordCount++;
            }
        }
        
        int[] spaceIndexes = new int[wordCount - 1];
        int index = 0;
        
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') {
                spaceIndexes[index++] = i;
            }
        }
        
        String[] words = new String[wordCount];
        int startIndex = 0;
        
        for (int i = 0; i < wordCount; i++) {
            int endIndex = (i < wordCount - 1) ? spaceIndexes[i] : length;
            words[i] = str.substring(startIndex, endIndex);
            startIndex = endIndex + 1;
        }
        
        return words;
    }

    public static String[][] getWordsWithLengths(String[] words) {
        String[][] wordsWithLengths = new String[words.length][2];
        
        for (int i = 0; i < words.length; i++) {
            wordsWithLengths[i][0] = words[i];
            wordsWithLengths[i][1] = String.valueOf(getStringLength(words[i]));
        }
        
        return wordsWithLengths;
    }
}
